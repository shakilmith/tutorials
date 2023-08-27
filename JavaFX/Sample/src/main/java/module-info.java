module com.javaondemand.sample {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.javaondemand.sample to javafx.fxml;
    exports com.javaondemand.sample;
}