package org.example.apjavafxtutorial.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class LoginPageController {

    @FXML
    private PasswordField passwordField;

    @FXML
    private TextField usernameField;

    @FXML
    private Button loginButton;

    @FXML
    private void handleLoginButtonAction() {
        String username = usernameField.getText();
        String password = passwordField.getText();

        System.out.println("Username: " + username);
        System.out.println("Password: " + password);

        // Here you can add your login validation logic
        if (!username.isEmpty() && !password.isEmpty()) {
            try {
                FXMLLoader loader = new FXMLLoader(
                        getClass().getResource("/org/example/apjavafxtutorial/pages/dashboardPage/dashboardPage.fxml"));
                Parent dashboardRoot = loader.load();

                // Get the controller and set the welcome message
                DashboardPageController dashboardController = loader.getController();
                dashboardController.setWelcomeMessage(username);

                // Get the current stage from the login button
                Stage stage = (Stage) loginButton.getScene().getWindow();

                // Create and set the dashboard scene
                Scene dashboardScene = new Scene(dashboardRoot);
                stage.setScene(dashboardScene);
                stage.show();
            } catch (IOException e) {
                e.printStackTrace();
                System.err.println("Error loading dashboard page: " + e.getMessage());
            }
        }

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
