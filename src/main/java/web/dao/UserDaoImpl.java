package web.dao;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import web.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
@Repository
public class UserDaoImpl implements UserDao {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional(readOnly = true)
    public List<User> index() {
        return entityManager.createQuery("select u from User u", User.class).getResultList();
    }

    @Override
    @Transactional(readOnly = true)
    public User show(Long id) {
        return entityManager.find(User.class, id);
    }

    @Override
    @Transactional
    public void save(User user) {
        entityManager.persist(user);
    }

    @Override
    @Transactional
    public void update(User updateUser) {
        entityManager.merge(updateUser);
    }


    @Override
    @Transactional
    public void delete(Long id) {
        User user = entityManager.find(User.class, id);
        if(user != null) {
            entityManager.remove(user);
        }
    }
}

