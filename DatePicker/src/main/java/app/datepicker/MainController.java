package app.datepicker;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class MainController {
    @FXML
    private Label myLabel;

    @FXML
    private DatePicker myDatePicker;

    public void getDate(ActionEvent e) {
        LocalDate date = myDatePicker.getValue();
        String dateFormat = date.format(DateTimeFormatter.ofPattern("MM/dd/yyyy"));
        myLabel.setText("Date : " + dateFormat);
    }
}