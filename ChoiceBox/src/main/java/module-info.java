module app.choicebox {
    requires javafx.controls;
    requires javafx.fxml;


    opens app.choicebox to javafx.fxml;
    exports app.choicebox;
}