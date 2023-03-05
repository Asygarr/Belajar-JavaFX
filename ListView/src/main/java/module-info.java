module app.listview {
    requires javafx.controls;
    requires javafx.fxml;


    opens app.listview to javafx.fxml;
    exports app.listview;
}