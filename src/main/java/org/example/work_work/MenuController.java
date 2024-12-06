package org.example.work_work;

import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;

import java.util.ArrayList;
import java.util.List;

public class MenuController {

    @FXML
    private CheckBox dish1CheckBox;

    @FXML
    private Spinner<Integer> dish1Spinner;

    @FXML
    private Label dish1PriceLabel;

    @FXML
    private CheckBox dish2CheckBox;

    @FXML
    private Spinner<Integer> dish2Spinner;

    @FXML
    private Label dish2PriceLabel;

    @FXML
    private Label totalCostLabel;

    private double dish1Price = 10.0;
    private double dish2Price = 15.0;

    @FXML
    private void initialize() {
        // Установка значений по умолчанию для спиннеров
        dish1Spinner.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 100, 1));
        dish2Spinner.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 100, 1));
    }

    // Обработка нажатия кнопки "Заказать"
    @FXML
    private void handleOrder() {
        List<String> orderDetails = new ArrayList<>();
        double totalCost = 0.0;

        if (dish1CheckBox.isSelected()) {
            int quantity = dish1Spinner.getValue();
            double cost = quantity * dish1Price;
            orderDetails.add("Блюдо 1: " + quantity + " порций, Итог: " + cost);
            totalCost += cost;
        }

        if (dish2CheckBox.isSelected()) {
            int quantity = dish2Spinner.getValue();
            double cost = quantity * dish2Price;
            orderDetails.add("Блюдо 2: " + quantity + " порций, Итог: " + cost);
            totalCost += cost;
        }

        displayOrderDetails(orderDetails, totalCost);
    }

    // Отображение деталей заказа
    private void displayOrderDetails(List<String> orderDetails, double totalCost) {
        StringBuilder details = new StringBuilder();
        for (String detail : orderDetails) {
            details.append(detail).append("\n");
        }
        details.append("Общая стоимость: ").append(totalCost);
        totalCostLabel.setText(details.toString());
    }
}
