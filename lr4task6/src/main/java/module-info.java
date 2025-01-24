module ru.antipov.lr4task6 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.antipov.lr4task6 to javafx.fxml;
    exports ru.antipov.lr4task6;
}