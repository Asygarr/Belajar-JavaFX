module app.colorpicker {
    requires javafx.controls;
    requires javafx.fxml;


    opens app.colorpicker to javafx.fxml;
    exports app.colorpicker;
}