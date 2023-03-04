module app.datepicker {
    requires javafx.controls;
    requires javafx.fxml;


    opens app.datepicker to javafx.fxml;
    exports app.datepicker;
}