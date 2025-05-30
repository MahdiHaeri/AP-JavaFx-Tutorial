package org.example.apjavafxtutorial.service;

import org.example.apjavafxtutorial.model.User;

public interface AuthenticationService {
    boolean login(String username, String password);

    void logout();

    User getCurrentUser();
}