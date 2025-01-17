package web.service;

import web.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    User showUser(Long id);

    void saveUser(User user);

    void updateUser(User updateUser);

    void deleteUser(Long id);
}
