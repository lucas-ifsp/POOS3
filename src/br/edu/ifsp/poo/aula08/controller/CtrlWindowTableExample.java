package br.edu.ifsp.poo.aula08.controller;

import br.edu.ifsp.poo.aula08.model.Example;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;


public class CtrlWindowTableExample {
    @FXML private TableView<Example> tableView;
    @FXML private TableColumn<Example,String> cName; // <Tipo_Entidade, Tipo_Atributo>​
    @FXML private TableColumn<Example,String> cDescription; // <Tipo_Entidade, Tipo_Atributo>​

    @FXML private TextField txtNome;

    ObservableList<Example> observableList;

    @FXML
    public void initialize(){
        bindTableToEntity();
        fill();
    }

    public void bindTableToEntity(){
        cName.setCellValueFactory(new PropertyValueFactory<>("name"));
        cDescription.setCellValueFactory(new PropertyValueFactory<>("description"));
    }

    public void fill(){
        Example e1 = new Example("Pao", "De comer");
        Example e2 = new Example("Leite", "De beber");
        Example e3 = new Example("Pito", "De pitar");

        observableList = FXCollections.observableArrayList();
        observableList.addAll(e1,e2, e3);
        tableView.setItems(observableList);
    }

    public void addItemToTable(ActionEvent actionEvent) {
        String name = txtNome.getText();
        Example e = new Example(name, "VAZIO");
        observableList.add(e);
        clear();
    }

    public void clear(){
        txtNome.setText("");
    }

    public void removeItem(ActionEvent actionEvent) {
        Example e = tableView.getSelectionModel().getSelectedItem();
        observableList.remove(e);
    }
}
