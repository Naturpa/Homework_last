package org.example.work_work;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class WordSwitcherController {

    @FXML
    private TextField inputField;

    @FXML
    private TextField outputField;

    @FXML
    private Button switchButton;

    private boolean isInputToOutput = true; // состояние переключения

    // Метод для обработки нажатия кнопки
    @FXML
    private void handleSwitch() {
        if (isInputToOutput) {
            outputField.setText(inputField.getText()); // перебрасываем текст
            switchButton.setText("←"); // изменяем стрелку на кнопку
        } else {
            inputField.setText(outputField.getText());
            switchButton.setText("→"); // возвращаем стрелку
        }
        isInputToOutput = !isInputToOutput; // меняем состояние
    }
}
