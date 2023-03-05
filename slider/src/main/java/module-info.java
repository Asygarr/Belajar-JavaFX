module app.slider {
    requires javafx.controls;
    requires javafx.fxml;


    opens app.slider to javafx.fxml;
    exports app.slider;
}