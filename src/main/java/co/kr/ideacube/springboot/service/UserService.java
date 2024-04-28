package co.kr.ideacube.springboot.service;

import java.util.List;

import co.kr.ideacube.springboot.entity.User;

public interface UserService {
    User createUser(User user);
    User getUserById(Long userId);
    List<User> getAllUsers();
    User updateUser(User user);
    void deleteUser(Long userId);
}
