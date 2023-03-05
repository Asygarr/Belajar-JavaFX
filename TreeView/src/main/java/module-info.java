module app.treeview {
    requires javafx.controls;
    requires javafx.fxml;


    opens app.treeview to javafx.fxml;
    exports app.treeview;
}