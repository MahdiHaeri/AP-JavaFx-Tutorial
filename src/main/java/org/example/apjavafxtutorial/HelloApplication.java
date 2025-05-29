package org.example.apjavafxtutorial;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws Exception {
//        Stage primaryStage = new Stage();
//        primaryStage.setTitle("JavaFX Application");
//        primaryStage.setWidth(1000);
//        primaryStage.setHeight(600);
//        AnchorPane root = FXMLLoader.load(getClass().getResource(
//            "/org/example/apjavafxtutorial/pages/loginPage/loginPage.fxml"
//        ));
//        primaryStage.setScene(new Scene(root));
//        primaryStage.show();

        // Make sure the path matches your resources folder structure
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource(
                "/org/example/apjavafxtutorial/pages/loginPage/loginPage.fxml"
        )));


        stage.setTitle("JavaFX Application");
        Scene scene = new Scene(root);
        stage.setWidth(1000);
        stage.setHeight(600);
        stage.setScene(scene);
        stage.show();

//        stage.setTitle("Hello World!");
//        Button btn = new Button();
//        btn.setText("Say 'Hello World'");
//        btn.setOnAction(new EventHandler<ActionEvent>() {
//
//            @Override
//            public void handle(ActionEvent event) {
//                System.out.println("Hello World!");
//            }
//        });
//
//        StackPane root = new StackPane();
//        root.getChildren().add(btn);
//        stage.setScene(new Scene(root, 300, 250));
//        stage.show();


    }

    public static void main(String[] args) {
        launch();
    }
}
