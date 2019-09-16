package com.rpg.mastershield.service;

import com.rpg.mastershield.model.User;
import com.rpg.mastershield.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

@Service
@Transactional
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {
        List<User> users = new ArrayList<>();
        userRepository.findAll().forEach(users::add);

        return users;
    }

    public User getUser(long id) throws NoSuchElementException {
        return userRepository.findById(id).get();
    }

    public User getUserByUsername(String username) throws NoSuchElementException {
        User user = userRepository.findByUsername(username);
        System.out.println(user);
        if(user != null) {
            return user;
        } else {
            throw new NoSuchElementException();
        }
    }

    public void addUser(User user) {
        userRepository.save(user);
    }

    public void updateUser(User user) {
        userRepository.save(user);
    }

    public void deleteUser(User user) {
        userRepository.delete(user);
    }
}
