package ch.albertlegrand.service.businesslogic;

/**
 * Created by IntelliJ IDEA.
 * User: stefanasemota
 * Date: 22.01.12
 * Time: 12:00
 * To change this template use File | Settings | File Templates.
 */
public interface LoginService {

    public Object findUsernameAndCorrespondingAuthority(String username);

    public Object getById(long id);
}
