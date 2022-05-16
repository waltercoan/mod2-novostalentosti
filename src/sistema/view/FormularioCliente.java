package sistema.view;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FormularioCliente extends JDialog{
    private JPanel jpnCentro = new JPanel();
    private JPanel jpnBotao = new JPanel();
    private JButton btnOK = new JButton("OK");
    private JButton btnCancelar = new JButton("Cancelar");
    private JTextField txtId = new JTextField(4);
    private JTextField txtNome = new JTextField(40);
    public FormularioCliente() {
        setSize(400,300);
        setModal(true);
        criaPaineis(); // nao esquece de chamar o metodo aqui!!!
        setVisible(true);
    }
    private void criaPaineis(){
        add(jpnBotao,"South");
        jpnBotao.add(btnOK);
        jpnBotao.add(btnCancelar);

        add(jpnCentro, "Center");
        jpnCentro.add(new JLabel("Código:"));
        jpnCentro.add(txtId);
        jpnCentro.add(new JLabel("Nome:"));
        jpnCentro.add(txtNome);
    }
}
