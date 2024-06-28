package web.service;

import org.springframework.stereotype.Service;
import web.dao.UserDao;
import web.model.User;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    private final UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public List<User> index() {
        return userDao.index();
    }

    @Override
    public User show(Long id) {
        return userDao.show(id);
    }

    @Override
    public void save(User user) {
        userDao.save(user);
    }

    @Override
    public void update(User updateUser) {
        userDao.update(updateUser);
    }

    @Override
    public void delete(Long id) {
        userDao.delete(id);
    }
}
