package com.example.demo5;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    TextField username;
    @FXML
    PasswordField password;


    @FXML
    protected void login() {
        String username = this.username.getText();
        String password = this.password.getText();

        if (username.equals("admin") && password.equals("password")) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setContentText("Dang nhap thanh cong");
            alert.show();
        }
    }
}
