package br.edu.ifsp.poo.aula07;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class MainWindow extends Application {

    private Label lbDescricao, lbValor, lbData, lbCategoria;
    private TextField txtDescricao, txtValor;
    private ComboBox cbCategoria;
    private DatePicker dpData;
    private Button btnSalvar;

    private CtrlMainWindow ctrl = new CtrlMainWindow(this);

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        lbDescricao = new Label("Descrição: ");
        txtDescricao = new TextField();
        txtDescricao.setPromptText("Digite a descrição do gasto");

        btnSalvar = new Button("Salvar");
        btnSalvar.setOnAction(e -> ctrl.salvar());

        dpData = new DatePicker();

        ObservableList<String> itens = FXCollections.observableArrayList("---", "Educação", "Saúde", "Dependentes");
        cbCategoria = new ComboBox(itens);

        HBox layout = new HBox();
        layout.getChildren().addAll(lbDescricao, txtDescricao, cbCategoria, btnSalvar,dpData);

        Scene scene = new Scene(layout, 800, 400);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Despesas");
        primaryStage.show();
    }

    public String getDescricao(){
        return txtDescricao.getText();
    }
    public String getCategoria(){
        return cbCategoria.getSelectionModel().getSelectedItem().toString();
    }

    public void clear(){
        txtDescricao.setText("");
        cbCategoria.getSelectionModel().select(0);
    }
}
