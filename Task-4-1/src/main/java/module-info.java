module com.example.task41 {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;
    requires lombok;

    opens com.example.task41 to javafx.fxml;
    exports com.example.task41;
}