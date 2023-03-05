module app.progresbar {
    requires javafx.controls;
    requires javafx.fxml;


    opens app.progresbar to javafx.fxml;
    exports app.progresbar;
}