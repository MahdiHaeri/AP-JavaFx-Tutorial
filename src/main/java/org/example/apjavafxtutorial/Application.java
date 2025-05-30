package org.example.apjavafxtutorial;

import javafx.stage.Stage;
import org.example.apjavafxtutorial.util.SceneManager;

public class Application extends javafx.application.Application {

    private static final String TITLE = "JavaFX Application";
    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;

    @Override
    public void start(Stage stage) throws Exception {
        // Initialize the SceneManager with the primary stage
        SceneManager.getInstance().setPrimaryStage(stage);

        // Set the stage properties
        stage.setTitle(TITLE);
        stage.setWidth(WIDTH);
        stage.setHeight(HEIGHT);

        // Load the initial scene
        SceneManager.getInstance().switchScene(
                "/org/example/apjavafxtutorial/pages/loginPage/loginPage.fxml");

        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
