package com.example.demo2;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class UserController {

    @FXML
    Label nameLabel;

    public void displayName(String name) {
        nameLabel.setText("Hello : "+name);
    }

}
