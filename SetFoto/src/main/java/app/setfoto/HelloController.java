package app.setfoto;


import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class HelloController {

    @FXML
    ImageView myImageView;

    @FXML
    Button myButton;

    @FXML
    Label myLabel;

    Image myImage2 = new Image(getClass().getResourceAsStream("images/foto2.jpeg"));
    Image myImage1 = new Image(getClass().getResourceAsStream("images/foto1.jpeg"));

    public void displayImage2() {
        myImageView.setImage(myImage2);
        myLabel.setText("Image 2");
    }

    public void displayImage1() {
        myImageView.setImage(myImage1);
        myLabel.setText("Image 1");
    }

}