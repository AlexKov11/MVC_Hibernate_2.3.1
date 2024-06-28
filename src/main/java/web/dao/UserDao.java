package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {
    List<User> getAllUsers();

    User showUser(Long id);

    void saveUser(User user);

    void updateUser(User updateUser);

    void deleteUser(Long id);
}
