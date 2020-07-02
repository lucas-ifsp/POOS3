package br.edu.ifsp.poo.aula07;

public class CtrlMainWindow {

    private MainWindow window;

    public CtrlMainWindow(MainWindow window) {
        this.window = window;
    }

    public void salvar(){
        String description = window.getDescricao();
        String category = window.getCategoria();
        
        Despesa despesa = new Despesa();
        despesa.setCategory(category);
        despesa.setDescription(description);
        
        //joga no banco, joga no arquivo, mata o gato
        System.out.println("despesa = " + despesa);
        window.clear();
    }
}
