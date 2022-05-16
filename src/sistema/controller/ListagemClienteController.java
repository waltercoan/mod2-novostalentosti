package sistema.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JComponent;
import javax.swing.JOptionPane;

import sistema.entity.Cliente;
import sistema.service.ClienteService;
import sistema.view.FormularioCliente;

public class ListagemClienteController implements ActionListener{
    private ClienteService service = new ClienteService();


    public ArrayList<Cliente> getAllClientes(){
        return service.getAllClientes();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JComponent botaoClicado = (JComponent)e.getSource();
        switch (botaoClicado.getName()) {
            case "btnNovo":
                btnNovoClique();
            break;
            case "btnAlterar":
                btnAlterarClique();
            break;
            case "btnExcluir":
                btnExcluirClique();
            break;
        }
    }

    private void btnNovoClique(){
        //JOptionPane.showMessageDialog(null, "BOTAO NOVO");    
        FormularioCliente formulario = new FormularioCliente();
    }
    private void btnAlterarClique(){
        JOptionPane.showMessageDialog(null, "BOTAO ALTERAR");    
    }
    private void btnExcluirClique(){
        JOptionPane.showMessageDialog(null, "BOTAO Excluir");
    }


}
