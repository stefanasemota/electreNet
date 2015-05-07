package ch.albertlegrand.business.bc.impl;

import ch.albertlegrand.data.model.Authority;
import ch.albertlegrand.service.businesslogic.LoginService;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.GrantedAuthorityImpl;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class AlbertUserDetailsServiceBCImpl implements UserDetailsService {
    private static final Logger LOGGER = Logger.getLogger(AlbertUserDetailsServiceBCImpl.class);

    @Autowired
    private LoginService loginService;

    @Override
    public UserDetails loadUserByUsername(String userName) throws DataAccessException {
        Collection<Authority> collection;
        boolean isUserAdmin;
        try {
            Authority loadedAdminRoleNames = (Authority) loginService.findUsernameAndCorrespondingAuthority(userName);
            collection = (Collection<Authority>) loadedAdminRoleNames.getLoginByUsername().getAuthoritiesByUsername();

            if (collection.size() > 0) {
                isUserAdmin = (loadedAdminRoleNames.getName().equals("ALBERT-ADMIN") || loadedAdminRoleNames.getName().equals("ALBERT-DEVELOPER"));
                //we are only interested in authenticating if the user has an admin role
                if ((userName.equalsIgnoreCase(loadedAdminRoleNames.getUsername()) && isUserAdmin)) {
                    return null;//new AlbertUserDetailsBCImpl(loadedAdminRoleNames.getUsername(), loadedAdminRoleNames.getLoginByUsername().getPassword(), getAuthorities(isUserAdmin, loadedAdminRoleNames));
                }
            }
        } catch (UsernameNotFoundException user) {
            LOGGER.log(Level.ERROR, "Spring Error: " + user.getMessage());
        }


        return null;//new AlbertUserDetailsBCImpl();
    }

    private Collection<GrantedAuthority> getAuthorities(boolean isAdmin, Authority item) {
        List<GrantedAuthority> authList = new ArrayList<GrantedAuthority>(2);
        authList.add(new GrantedAuthorityImpl("ROLE_USER"));
        if (isAdmin) {
            authList.add(new GrantedAuthorityImpl(item.getName()));
        }
        return authList;
    }

}
