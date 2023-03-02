module com.asygar.demo1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.asygar.demo1 to javafx.fxml;
    exports com.asygar.demo1;
}