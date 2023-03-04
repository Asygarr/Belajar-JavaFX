package app.radiobuttons;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;

public class MainController {
    @FXML
    private Label myLabel;

    @FXML
    private RadioButton pizza, burger, spagetti;

    public void onAction (ActionEvent e) {
        if (pizza.isSelected()) {
            myLabel.setText(pizza.getText());
        } else if (burger.isSelected()) {
            myLabel.setText(burger.getText());
        } else if (spagetti.isSelected()) {
            myLabel.setText(spagetti.getText());
        } else {
            myLabel.setText("Pilih apa yang ingin kamu makan");
        }
    }
}