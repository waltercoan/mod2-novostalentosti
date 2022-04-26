package introducao.telas;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

//BorderLayout
public class Telinha1 extends JFrame {
    public Telinha1() {

        JLabel texto = new JLabel("Eu não acredito...");
        add(texto,"North");
        JButton botao = new JButton("Me clica!!!");
        add(botao,"South");
        JPanel painel = new JPanel();
        add(painel,"Center");
        painel.setBackground(Color.darkGray);
        painel.add(new JButton("BOTAO"));
        painel.add(new JButton("BOTAO"));
        painel.add(new JButton("BOTAO"));
        painel.add(new JButton("BOTAO"));
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Telinha1();
    }
}
