package org.example.apjavafxtutorial.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import org.example.apjavafxtutorial.service.AuthenticationService;
import org.example.apjavafxtutorial.service.impl.AuthenticationServiceImpl;
import org.example.apjavafxtutorial.util.SceneManager;

import java.io.IOException;

public class LoginPageController {

    @FXML
    private PasswordField passwordField;

    @FXML
    private TextField usernameField;

    @FXML
    private Button loginButton;

    private final AuthenticationService authService;

    public LoginPageController() {
        this.authService = new AuthenticationServiceImpl();
    }

    @FXML
    private void handleLoginButtonAction() {
        String username = usernameField.getText();
        String password = passwordField.getText();

        if (authService.login(username, password)) {
            try {
                DashboardPageController controller = SceneManager.getInstance()
                        .switchScene("/org/example/apjavafxtutorial/pages/dashboardPage/dashboardPage.fxml",
                                DashboardPageController.class);
                controller.setWelcomeMessage(username);
            } catch (IOException e) {
                e.printStackTrace();
                System.err.println("Error loading dashboard page: " + e.getMessage());
            }
        }

        usernameField.clear();
        passwordField.clear();
    }

    @FXML
    private void handleCancelButtonAction() {
        usernameField.clear();
        passwordField.clear();
        System.out.println("Login cancelled.");
    }
}
