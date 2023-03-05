package app.progresbar;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;

import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {
    @FXML
    private Label myLabel;

    @FXML
    private ProgressBar myBar;

    private double valueProgres;
    private int persen = 10;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        myBar.setStyle("-fx-accent: #00FF00");

    }

    public void increaseProgress() {

        if (persen <= 100) {
            valueProgres+=0.10;
            myBar.setProgress(valueProgres);
            myLabel.setText(persen+"%");
            persen+=10;
        }

    }


//    private int persen = 10;
//    private double sx;
//
//    public void ButtonAction(ActionEvent e) {
//        myBar.setProgress(sx+=0.10);
//        myLabel.setText(persen+"%");
//        persen+=10;
//    }
}