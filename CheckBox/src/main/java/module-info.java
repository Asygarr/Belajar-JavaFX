module app.checkbox {
    requires javafx.controls;
    requires javafx.fxml;


    opens app.checkbox to javafx.fxml;
    exports app.checkbox;
}