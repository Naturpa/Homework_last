package org.example.work_work;

import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Label;

public class TextFlagController {

    @FXML
    private RadioButton redRadioButton;

    @FXML
    private RadioButton greenRadioButton;

    @FXML
    private RadioButton blueRadioButton;

    @FXML
    private RadioButton whiteRadioButton;

    @FXML
    private RadioButton yellowRadioButton;

    @FXML
    private Label outputLabel;

    // Метод для обработки нажатия кнопки "Нарисовать"
    @FXML
    private void handleDraw() {
        StringBuilder flagColors = new StringBuilder();

        // Получаем выбранные цвета
        flagColors.append(redRadioButton.isSelected() ? " Красный" : "")
                .append(greenRadioButton.isSelected() ? " Зелёный" : "")
                .append(blueRadioButton.isSelected() ? " Синий" : "")
                .append(whiteRadioButton.isSelected() ? " Белый" : "")
                .append(yellowRadioButton.isSelected() ? " Жёлтый" : "");

        // Очищаем текст и убираем начальную запятую
        String result = flagColors.toString().replaceFirst(", ", "");

        // Устанавливаем конечный результат в Label
        outputLabel.setText(result.isEmpty() ? "Выберите цвета" : result);
    }
}
