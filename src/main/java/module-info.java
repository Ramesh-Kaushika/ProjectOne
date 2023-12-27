module com.example.inserttabledata {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.inserttabledata to javafx.fxml;
    exports com.example.inserttabledata;
    exports com.example.inserttabledata.controller;
    opens com.example.inserttabledata.controller to javafx.fxml;
    exports com.example.inserttabledata.tm;
}