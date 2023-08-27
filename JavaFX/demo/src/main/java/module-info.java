module com.javaondemand.demo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.javaondemand.demo to javafx.fxml;
    exports com.javaondemand.demo;
}