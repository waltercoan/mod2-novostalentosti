package sistema.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComponent;
import javax.swing.JOptionPane;

import sistema.entity.Cliente;
import sistema.exception.ValorInvalidoException;
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
        try{
            var cliente = formCliente.getCliente();
            formCliente.atualiza(cliente);
            validador(cliente);
            formCliente.dispose();
        
        } catch (ValorInvalidoException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            e.printStackTrace();
        }
    }
    private void validador(Cliente cliente) throws ValorInvalidoException{
        if(cliente.getNome() == null || cliente.getNome().isEmpty()){
            throw new ValorInvalidoException("O nome não pode ser deixado branco", 
                                            null,
                                            "NOME");
        }
        //criar uma validação para cada campo de tela do cliente
        //alterar a mensagem de tela JOptionPane: transformar ela numa mensagem de erro,
        // mostrar o campo que gerou o erro
    }
    
}
