package ru.antipov.lr4task4;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private Label resultLabel;
    @FXML
    private TextField inputA;
    @FXML
    private TextField inputB;
    @FXML
    private Button calculateButton;

    @FXML
    public void calculateAction() {
        try {
            int A = Integer.parseInt(inputA.getText());
            int B = Integer.parseInt(inputB.getText());
            if (A <= 0 || B <= 0 || A <= B) {
                resultLabel.setText("Некорректный ввод");
                return;
            }

            int remainingLength = calculateRemainingLength(A, B);
            resultLabel.setText("Незанятая длина: " + remainingLength);

        } catch (NumberFormatException e) {
            resultLabel.setText("Неверный формат ввода");
        }
    }
    private int calculateRemainingLength(int A, int B) {
        int currentLength = A;
        while (currentLength >= B) {
            currentLength -= B;
        }
        return currentLength;
    }
}
