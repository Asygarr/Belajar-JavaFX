package app.textfield;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MainController {

    @FXML
    private Label myLabel;
    @FXML
    private TextField myTextField;
    @FXML
    private Button myButton;

    private int age;

    public void setMyButton(ActionEvent event) {
        try {
            age = Integer.parseInt(myTextField.getText());
            if (age > 18) {
                myLabel.setText("You Logged in");
                myLabel.setFont(myLabel.getFont().font(36));
                myLabel.setLayoutX(58);
                myLabel.setLayoutY(14);
            } else {
                myLabel.setText("You are not old enough to register");
                myLabel.setFont(myLabel.getFont().font(18));
                myLabel.setLayoutY(36);
                myLabel.setLayoutX(31);
            }
        } catch (NumberFormatException e) {
            myLabel.setText("Please enter a number");
            myLabel.setFont(myLabel.getFont().font(18));
            myLabel.setLayoutY(36);
            myLabel.setLayoutX(87);
        } catch (Exception e) {
            myLabel.setText("Something went wrong");
            myLabel.setFont(myLabel.getFont().font(18));
            myLabel.setLayoutY(36);
            myLabel.setLayoutX(87);
        }

    }

}