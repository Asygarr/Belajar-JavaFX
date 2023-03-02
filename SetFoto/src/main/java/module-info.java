module app.setfoto {
    requires javafx.controls;
    requires javafx.fxml;


    opens app.setfoto to javafx.fxml;
    exports app.setfoto;
}