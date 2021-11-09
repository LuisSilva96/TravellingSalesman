module com.example.travellingsalesman {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.travellingsalesman to javafx.fxml;
    exports com.example.travellingsalesman;
}