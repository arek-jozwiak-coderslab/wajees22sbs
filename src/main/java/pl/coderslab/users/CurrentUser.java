package pl.coderslab.users;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

public class CurrentUser extends User {
    private final AppUser appUser;

    public CurrentUser(String username, String password,
                       Collection<? extends GrantedAuthority> authorities,
                       AppUser appUser) {
        super(username, password, authorities);
        this.appUser = appUser;
    }

    public AppUser getAppUser() {
        return appUser;
    }
}