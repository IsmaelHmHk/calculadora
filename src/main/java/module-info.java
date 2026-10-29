module com.ismael.calculadora {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.ismael.calculadora to javafx.fxml;
    exports com.ismael.calculadora;
}