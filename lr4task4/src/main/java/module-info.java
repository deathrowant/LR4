module ru.antipov.lr4task4 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.antipov.lr4task4 to javafx.fxml;
    exports ru.antipov.lr4task4;
}