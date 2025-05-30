package org.example.apjavafxtutorial;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Objects;

public class Application extends javafx.application.Application {

    private static final String TITLE = "JavaFX Application";
    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;
    private Scene currentScene;

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource(
                "/org/example/apjavafxtutorial/pages/loginPage/loginPage.fxml"
        )));

        stage.setTitle("JavaFX Application");
        Scene scene = new Scene(root);
        stage.setWidth(800);
        stage.setHeight(600);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
