package org.example.apjavafxtutorial.service.impl;

import org.example.apjavafxtutorial.model.User;
import org.example.apjavafxtutorial.service.AuthenticationService;

public class AuthenticationServiceImpl implements AuthenticationService {
    private User currentUser;

    @Override
    public boolean login(String username, String password) {
        // In a real application, you would validate against a database
        // For now, we'll just do a simple check
        if (username != null && !username.isEmpty() && password != null && !password.isEmpty()) {
            currentUser = new User(username, password);
            return true;
        }
        return false;
    }

    @Override
    public void logout() {
        currentUser = null;
    }

    @Override
    public User getCurrentUser() {
        return currentUser;
    }
}