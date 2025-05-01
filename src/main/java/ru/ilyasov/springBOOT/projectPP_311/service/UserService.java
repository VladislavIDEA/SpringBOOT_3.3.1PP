package ru.ilyasov.springBOOT.projectPP_311.service;

import ru.ilyasov.springBOOT.projectPP_311.models.User;

import java.util.List;

public interface UserService {
    void saveUser(User user);

    List<User> getAllUsers();

    User getUserById(Long id);

    void deleteUser(Long id);
}
