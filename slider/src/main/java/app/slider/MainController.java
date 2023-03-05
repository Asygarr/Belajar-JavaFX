package app.slider;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;

import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {

    @FXML
    private Label myLabel;

    @FXML
    private Slider mySlider;

    int myTemperatur;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        myTemperatur = (int) mySlider.getValue();
        myLabel.setText(myTemperatur + "°C");

        mySlider.valueProperty().addListener((observableValue, number, t1) -> {
            myTemperatur = (int) mySlider.getValue();
            myLabel.setText(myTemperatur + "°C");
        });

    }
}