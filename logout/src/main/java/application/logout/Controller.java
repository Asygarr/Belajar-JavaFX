package application.logout;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Controller {

    @FXML
    private Button logoutButton;
    @FXML
    private AnchorPane pane;

    Stage stage;

    public void logout(ActionEvent event) {

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Logout");
        alert.setHeaderText("logged out");
        alert.setContentText("Do you want to log in again?");

        if (alert.showAndWait().get() == ButtonType.OK) {
            stage = (Stage) pane.getScene().getWindow();
            System.out.println("You have logged out");
            stage.close();
        }

    }

}
