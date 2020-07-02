package br.edu.ifsp.poo.aula08.controller;

import br.edu.ifsp.poo.aula08.view.WindowDisplay;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CtrlWindowReverter {

    @FXML
    TextField txtInput;
    @FXML
    Label lbResultOutput;

    public void revert(ActionEvent actionEvent) {
        String inputText = txtInput.getText();
        StringBuilder reverter = new StringBuilder(inputText);
        String reversedText = reverter.reverse().toString();
        lbResultOutput.setText(reversedText);

        WindowDisplay window = new WindowDisplay();
        Integer num = reversedText.length();
        window.showAndWait(num);
    }

}
