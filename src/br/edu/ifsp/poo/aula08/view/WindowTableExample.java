package br.edu.ifsp.poo.aula08.view;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class WindowTableExample extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Pane graph = FXMLLoader.load(getClass().getResource("./FXMLTableExample.fxml"));
        Scene scene = new Scene(graph, 400, 500);

        stage.setScene(scene);
        stage.show();
    }
}
