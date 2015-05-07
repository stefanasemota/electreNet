package ch.albertlegrand.business.security;

import org.springframework.security.core.Authentication;

import java.io.Serializable;

/**
 * Provides basic methods and operations for the spring security controller
 *
 * @author Asemota Stefan
 * @version 1.0
 * @created 06-Jul-2011 10:41:10
 */
public interface SecurityControllerBC extends Serializable {

    boolean isAdminGUIVisible(Authentication authentication);

    boolean isAdmin(Authentication authentication);

}