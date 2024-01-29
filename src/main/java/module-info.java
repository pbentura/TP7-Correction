module com.example.tp7correction {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.tp7correction to javafx.fxml;
    exports com.example.tp7correction;
}