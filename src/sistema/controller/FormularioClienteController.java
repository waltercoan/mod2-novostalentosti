package sistema.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComponent;

import sistema.view.FormularioCliente;


public class FormularioClienteController 
                implements ActionListener{

    private FormularioCliente formCliente;

    public FormularioClienteController(FormularioCliente formCliente) {
        this.formCliente = formCliente;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        JComponent botaoClicado = (JComponent) e.getSource();
        if(botaoClicado.getName().equals("btnOK")){
            btnOKClique();
        }
    }
    private void btnOKClique() {
        var cliente = formCliente.getCliente();
        formCliente.atualiza(cliente);
        formCliente.dispose();
    }
    
}
