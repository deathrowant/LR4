module ru.antipov.lr4task1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.antipov.lr4task1 to javafx.fxml;
    exports ru.antipov.lr4task1;
}