module app.textfield {
    requires javafx.controls;
    requires javafx.fxml;


    opens app.textfield to javafx.fxml;
    exports app.textfield;
}