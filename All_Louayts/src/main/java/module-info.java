module com.example.allouayts {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.allouayts to javafx.fxml;
    exports com.example.allouayts;
}