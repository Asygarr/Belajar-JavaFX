module app.spinner {
    requires javafx.controls;
    requires javafx.fxml;


    opens app.spinner to javafx.fxml;
    exports app.spinner;
}