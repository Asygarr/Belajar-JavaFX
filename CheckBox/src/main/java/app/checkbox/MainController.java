package app.checkbox;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class MainController {
    @FXML
    private ImageView myImage;

    @FXML
    private Label myLabel;

    @FXML
    private CheckBox myCheckBox;

    Image myImage1 = new Image(getClass().getResourceAsStream("assets/lampu1.png"));
    Image myImage2 = new Image(getClass().getResourceAsStream("assets/lampu2.png"));

    public void myCheckBoxAction(ActionEvent e) {
        if (myCheckBox.isSelected()) {
            myImage.setImage(myImage2);
            myLabel.setText("ON");
        } else {
            myImage.setImage(myImage1);
            myLabel.setText("OFF");
        }
    }
}