package sistema.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;

public class ListagemClienteController implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton botaoClicado = (JButton)e.getSource();
        switch (botaoClicado.getName()) {
            case "btnNovo":
                JOptionPane.showMessageDialog(null, "BOTAO NOVO");    
            break;
            case "btnAlterar":
                JOptionPane.showMessageDialog(null, "BOTAO ALTERAR");    
            break;
       
            default:
                break;
        }
        
    }
    
}
