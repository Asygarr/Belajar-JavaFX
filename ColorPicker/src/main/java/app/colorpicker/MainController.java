package app.colorpicker;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ColorPicker;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.paint.Color;

public class MainController {

    @FXML
    private AnchorPane myPhane;

    @FXML
    private ColorPicker myColorPicker;

    public void getColor(ActionEvent e) {
        Color color = myColorPicker.getValue();
        myPhane.setBackground(new Background(new BackgroundFill(color, null, null)));
    }

}