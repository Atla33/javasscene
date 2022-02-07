module com.example.condo {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.condo to javafx.fxml;
    exports com.example.condo;
    exports com.example.condo.Visao;
    opens com.example.condo.Visao to javafx.fxml;
}