package org.example.work_work;

import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

// Контроллер для обработки чекбоксов и виджетов
public class CheckBoxController {

    @FXML
    private CheckBox toggleLabelCheckbox;

    @FXML
    private CheckBox toggleTextFieldCheckbox;

    @FXML
    private Label labelWidget;

    @FXML
    private TextField textFieldWidget;

    // Обработчик для отображения/скрытия Label
    @FXML
    private void handleToggleLabel() {
        labelWidget.setVisible(toggleLabelCheckbox.isSelected());
    }

    // Обработчик для отображения/скрытия TextField
    @FXML
    private void handleToggleTextField() {
        textFieldWidget.setVisible(toggleTextFieldCheckbox.isSelected());
    }
}
