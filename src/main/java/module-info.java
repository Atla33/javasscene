module com.example.condo {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    exports com.example.condo;
    opens com.example.condo to javafx.fxml;


}