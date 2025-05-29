package org.example.apjavafxtutorial;

import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginPageController {

    @FXML
    private PasswordField passwordField;

    @FXML
    private TextField usernameField;

    @FXML
    private void handleLoginButtonAction() {
        String username = usernameField.getText();
        String password = passwordField.getText();

        // Here you can add your login logic, e.g., checking against a database
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);

        // Clear the fields after login attempt
        usernameField.clear();
        passwordField.clear();
    }

    @FXML
    private void handleCancelButtonAction() {
        // Clear the fields when cancel is pressed
        usernameField.clear();
        passwordField.clear();

        // Optionally, you can close the window or perform other actions
        System.out.println("Login cancelled.");
    }
}
