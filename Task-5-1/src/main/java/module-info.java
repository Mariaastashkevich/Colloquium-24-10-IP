module com.example.task51 {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.task51 to javafx.fxml;
    exports com.example.task51;
}