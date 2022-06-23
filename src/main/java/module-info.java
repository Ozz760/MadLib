module com.example.madlib {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.madlib to javafx.fxml;
    exports com.example.madlib;
}