package org.example.apjavafxtutorial.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class DashboardPageController {

    @FXML
    private Label welcomeLabel;

    @FXML
    private void initialize(String username) {
        // This method is called after the FXML file has been loaded
        // You can set initial values or perform setup tasks here
        welcomeLabel.setText("Welcome, " + username + "!");
    }

    public void setWelcomeMessage(String username) {
        welcomeLabel.setText("Welcome, " + username + "!");
    }
}
