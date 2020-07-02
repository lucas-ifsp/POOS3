package br.edu.ifsp.poo.aula08.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class CtrlWindowDisplay {
    @FXML
    Button btnOk;
    @FXML
    Label lbRevertedOutput;

    public void displayOutput(Integer num){
        lbRevertedOutput.setText(num.toString());
    }

    public void close(ActionEvent actionEvent) {
        Stage stage = (Stage) btnOk.getScene().getWindow();
        stage.close();
    }
}
