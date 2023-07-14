package com.example.demo6;

import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;

public class MultipleChoiceController {
    @FXML
    private CheckBox option1;

    @FXML
    private CheckBox option2;
    @FXML
    private CheckBox option3;
    @FXML
    private CheckBox option4;

    @FXML
    private Label result;

    @FXML
    public void submitQuiz() {
        int diem = 0;

        if (option1.isSelected() && !option2.isSelected() && !option3.isSelected() && !option4.isSelected()) {
            diem = diem + 1;
        }
        result.setText("diemhientaicuabanla:" +diem);
    }
}
