package sistema.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComponent;
import javax.swing.JOptionPane;

import sistema.entity.Cliente;
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
        }else{
            if(botaoClicado.getName().equals("btnCancelar")){
                btnCancelarClique();
            }
        }
    }
    private void btnCancelarClique() {
        formCliente.dispose();
    }
    private void btnOKClique() {
        var cliente = formCliente.getCliente();
        formCliente.atualiza(cliente);
        if(validador(cliente)){
            formCliente.dispose();
        }
    }
    private boolean validador(Cliente cliente){
        if(cliente.getNome() == null || cliente.getNome().isEmpty()){
            JOptionPane.showMessageDialog(null, "O nome não pode ser deixado branco");
            return false;
        }
        return true;
    }
    
}
