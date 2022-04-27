package sistema.view;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class ListagemCliente extends JFrame {

    private JPanel jpnCentro = new JPanel();
    private JPanel jpnSul = new JPanel();

    public ListagemCliente() {
        setSize(500,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        criaPaineis(); //chama o metodo!!!!
        setVisible(true);
    }
    private void criaPaineis(){
        add(jpnCentro,"Center");
        add(jpnSul,"South");
        
    }
}
