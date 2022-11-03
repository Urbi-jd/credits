module fxcss {
    requires javafx.fxml;
    requires javafx.controls;

    exports com.example.credits.app;
    opens com.example.credits.controller to javafx.fxml;
}