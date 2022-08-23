module com.example.ejerciciostema3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ejerciciostema3 to javafx.fxml;
    exports com.example.ejerciciostema3;
}