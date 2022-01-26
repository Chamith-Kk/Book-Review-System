module com.example.bookreviewsystem {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.bookreviewsystem to javafx.fxml;
    exports com.example.bookreviewsystem;
}