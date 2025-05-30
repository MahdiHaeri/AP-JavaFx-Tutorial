module org.example.apjavafxtutorial {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;

    opens org.example.apjavafxtutorial to javafx.fxml;
    exports org.example.apjavafxtutorial;
    exports org.example.apjavafxtutorial.controller;
    opens org.example.apjavafxtutorial.controller to javafx.fxml;
}