package com.ismael.calculadora;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

public class CalculadoraController {
    @FXML
    private Label welcomeText;
    @FXML
    private ListView<?> listOperations;

    @FXML
    private Label window;


    //La variable que nos dira en
    // todo momento nuestra ventana actual

    String actual = window.getText();

    @FXML
    void onNumeroClick(ActionEvent event) {
        //Al pusar cualquier Boton vamos a usar este metodo
        Button boton = (Button) event.getSource();
        String digito = boton.getText();          // "0", "1", ... "9"


        if (actual.equals("0")){
            this.window.setText(digito);
        }
        else {
            window.setText(actual + digito);
        }


    }



    @FXML
    //Para poder eliminar simplemente el ultimo bloque de la cadena de texto
    //usamos substring
    void handleBack(ActionEvent event) {


        if (actual.length()==1) {

            window.setText("0");
        }
        else {
            int tamaño = actual.length();
            int actualT = tamaño - 1 ;

            window.setText(actual.substring(0,actualT));
        }


    }

    @FXML
    void handleCambiarSigno(ActionEvent event) {
    actual.
    }

    @FXML
    void handleComa(ActionEvent event) {

    }

    @FXML
    void handleDelete(ActionEvent event) {
        this.window.setText("");
    }

    @FXML
    void handleDivision(ActionEvent event) {

    }

    @FXML
    void handleMultiplicar(ActionEvent event) {

    }

    @FXML
    void handleRestar(ActionEvent event) {

    }

    @FXML
    void handleResto(ActionEvent event) {

    }

    @FXML
    void handleResultado(ActionEvent event) {

    }

    @FXML
    void handleSumar(ActionEvent event) {

    }


}
