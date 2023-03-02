module application.logout {
    requires javafx.controls;
    requires javafx.fxml;


    opens application.logout to javafx.fxml;
    exports application.logout;
}