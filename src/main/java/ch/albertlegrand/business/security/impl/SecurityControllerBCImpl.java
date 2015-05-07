package ch.albertlegrand.business.security.impl;

import ch.albertlegrand.business.security.SecurityControllerBC;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;

import java.util.List;

/**
 * @author Asemota Stefan
 * @version 1.0
 * @created 06-Jul-2011 10:41:10
 */
public class SecurityControllerBCImpl implements SecurityControllerBC {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    public static final String ACCESS_GROUP_TEMPLATE = "ALBERT-";
    public static final String ADMIN_ROLE_TEMPLATE = "ALBERT-ADMIN";
    public static final String ANONYM_ROLE_TEMPLATE = "ALBERT-ANONYM";

    public SecurityControllerBCImpl() {

    }

    @Override
    public boolean isAdmin(Authentication authentication) {
        return !authentication.getName().equals("anonymousUser");
    }

    @Override
    public boolean isAdminGUIVisible(Authentication authentication) {
        return isGUIComponentVisible(ADMIN_ROLE_TEMPLATE, authentication);
    }

    /*
    * detect a user with a new role and stores the role in the db
    */
    public void detectAndStoreNewRole(List<GrantedAuthority> authorities) {
        if (authorities != null) {
            for (GrantedAuthority auth : authorities) {
                String group = auth.getAuthority();
                if (group.startsWith(ACCESS_GROUP_TEMPLATE)) {
                    // persist roles
                }
            }
        }
    }

    private boolean isGUIComponentVisible(String componentName, Authentication auth) {

        for (GrantedAuthority grantedAuthority : auth.getAuthorities()) {
            String group = auth.getName();
            if (!grantedAuthority.equals(ADMIN_ROLE_TEMPLATE)) {
            } else {
                return true;
            }
        }
        return false;
    }
}