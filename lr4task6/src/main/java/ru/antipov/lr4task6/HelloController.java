package ru.antipov.lr4task6;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private TextField numberTextField;

    @FXML
    private Label resultLabel;

    @FXML
    void processButtonOnAction(ActionEvent event) {
        try {
            int number = Integer.parseInt(numberTextField.getText());
            if (number <= 0) {
                resultLabel.setText("Число должно быть больше 0");
                return;
            }
            String digits = extractDigits(number);
            resultLabel.setText("Цифры: " + digits);
        } catch (NumberFormatException e) {
            resultLabel.setText("Некорректный ввод числа");
        }
    }
    private String extractDigits(int number) {
        StringBuilder result = new StringBuilder();

        while (number > 0) {
            int digit = number % 10;
            result.append(digit).append(" ");
            number = number / 10;
        }
        return result.toString();
    }
}