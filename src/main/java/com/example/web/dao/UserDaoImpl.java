package com.example.web.dao;

import com.example.web.model.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {
    @PersistenceContext(name = "TDPersistenceUnit")
    private EntityManager entityManager;

    @Override
    public List<User> showAll() {
        return entityManager.createQuery("from User", User.class)
                .getResultList();
    }

    @Override
    public void createUser(User user) {
        entityManager.persist(user);
    }
}
