package pl.coderslab.users;

public interface UserService {

    AppUser findByUserName(String name);

    void saveUser(AppUser appUser);
}
