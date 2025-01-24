package ru.antipov.lr4task1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private TextField dayNumberTextField;

    @FXML
    private Label resultLabel;

    @FXML
    void processButtonOnAction(ActionEvent event) {
        try {
            int dayNumber = Integer.parseInt(dayNumberTextField.getText());
            String dayName = getDayOfWeek(dayNumber);
            resultLabel.setText(dayName);
        } catch (NumberFormatException e) {
            resultLabel.setText("Некорректный ввод числа");
        }
    }

    private String getDayOfWeek(int dayNumber) {
        String dayName;
        switch (dayNumber) {
            case 1:
                dayName = "Понедельник";
                break;
            case 2:
                dayName = "Вторник";
                break;
            case 3:
                dayName = "Среда";
                break;
            case 4:
                dayName = "Четверг";
                break;
            case 5:
                dayName = "Пятница";
                break;
            case 6:
                dayName = "Суббота";
                break;
            case 7:
                dayName = "Воскресенье";
                break;
            default:
                dayName = "Неправльный день";
        }
        return "День недели: " + dayName;
    }
}