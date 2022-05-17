package sistema.view;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

import java.awt.GridBagLayout;
import java.text.ParseException;
import java.awt.GridBagConstraints;

public class FormularioCliente extends JDialog{
    private JPanel jpnCentro = new JPanel();
    private JPanel jpnBotao = new JPanel();
    private JButton btnOK = new JButton("OK");
    private JButton btnCancelar = new JButton("Cancelar");
    private JTextField txtId = new JTextField(4);
    private JTextField txtNome = new JTextField(40);
    private MaskFormatter mascaraCPF;
    private JFormattedTextField txtCPF;
    private MaskFormatter mascaraData;
    private JFormattedTextField txtData;
    
    public FormularioCliente() {
        setSize(400,300);
        setModal(true); //bloquear o usuário na JDialog
        criaPaineis(); // nao esquece de chamar o metodo aqui!!!
        setVisible(true);
    }
    private void criaPaineis(){
        add(jpnBotao,"South");
        jpnBotao.add(btnOK);
        jpnBotao.add(btnCancelar);

        jpnCentro.setLayout(new GridBagLayout());
        GridBagConstraints cons = new GridBagConstraints();
        cons.fill = GridBagConstraints.HORIZONTAL;
        
        add(jpnCentro, "Center");
        cons.gridx = 0; //coluna 0
        cons.gridy = 0; //linha 0
        cons.weightx = 0.20; //largura em percentual
        jpnCentro.add(new JLabel("Código:"), cons);
        
        cons.gridx = 1; //coluna 1
        cons.gridy = 0; //linha 0
        cons.weightx = 0.80; //largura em percentual
        jpnCentro.add(txtId,cons);

        cons.gridx = 0; //coluna 0
        cons.gridy = 1; //linha 1
        cons.weightx = 0.20; //largura em percentual
        jpnCentro.add(new JLabel("Nome:"),cons);

        cons.gridx = 1; //coluna 1
        cons.gridy = 1; //linha 1
        cons.weightx = 0.80; //largura em percentual
        jpnCentro.add(txtNome,cons);

        cons.gridx = 0; //coluna 0
        cons.gridy = 2; //linha 2
        cons.weightx = 0.20; //largura em percentual
        jpnCentro.add(new JLabel("CPF:"),cons);


        try {
            mascaraCPF = new MaskFormatter("###.###.###-##");
            txtCPF = new JFormattedTextField(mascaraCPF);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        cons.gridx = 1; //coluna 1
        cons.gridy = 2; //linha 2
        cons.weightx = 0.80; //largura em percentual
        jpnCentro.add(txtCPF,cons);


        cons.gridx = 0; //coluna 0
        cons.gridy = 3; //linha 3
        cons.weightx = 0.20; //largura em percentual
        jpnCentro.add(new JLabel("Data Nascimento:"),cons);

        try {
            mascaraData = new MaskFormatter("##/##/####");
            txtData = new JFormattedTextField(mascaraData);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        cons.gridx = 1; //coluna 1
        cons.gridy = 3; //linha 3
        cons.weightx = 0.80; //largura em percentual
        jpnCentro.add(txtData,cons);

    }
}
