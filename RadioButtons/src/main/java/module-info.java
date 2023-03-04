module app.radiobuttons {
    requires javafx.controls;
    requires javafx.fxml;


    opens app.radiobuttons to javafx.fxml;
    exports app.radiobuttons;
}