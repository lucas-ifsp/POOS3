package br.edu.ifsp.poo.aula08.view;

import br.edu.ifsp.poo.aula08.controller.CtrlWindowDisplay;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class WindowDisplay {

    public void showAndWait(Integer num){
        FXMLLoader loader = new FXMLLoader();
        try {
            Pane graph = loader.load(getClass().getResource("./FXMLDisplay.fxml").openStream());
            CtrlWindowDisplay ctrl = loader.getController();
            ctrl.displayOutput(num);

            Scene scene = new Scene(graph, 250, 75);

            Stage stage = new Stage();
            stage.setScene(scene);
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.showAndWait();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
