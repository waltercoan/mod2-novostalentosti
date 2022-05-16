package introducao.telas;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class FrmGridBagLayout extends JFrame{
	private JPanel jpnCentro;
	public FrmGridBagLayout() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Exemplo GridBagLayout");
		setSize(500,180);
		doPainel();
		setVisible(true);
	}
	
	public void doPainel(){
		jpnCentro = new JPanel(new GridBagLayout());
		add("Center",jpnCentro);
		jpnCentro.setBorder(BorderFactory.createTitledBorder("Dados Cliente"));
		GridBagConstraints cons = new GridBagConstraints();
		//permite redimencionamento dos componentes na horizontal
		cons.fill = GridBagConstraints.HORIZONTAL;
		//insere um espaçamento entre todos os compontentes de 5 px
		cons.insets = new Insets(5,5,5,5); 
		//Linha 0
        cons.gridy = 0;
        //Coluna 0
        cons.gridx = 0;
        //O componente vai ocupar 10% do tamanho total
        cons.weightx = 0.10; 
        jpnCentro.add(new JLabel("Codigo:"), cons);
        //Linha 0
        cons.gridy = 0;
        //Coluna 1
        cons.gridx = 1;
        // 30% do tamanho total
        cons.weightx = 0.30;
        jpnCentro.add(new JTextField(), cons);
        
        //linha 0
        cons.gridy = 0;
        //coluna 2
        cons.gridx = 2; 
        // 10% do tamanho total
        cons.weightx = 0.10; 
        jpnCentro.add(new JLabel("Nome:"), cons);
        //Linha 0
        cons.gridy = 0;
        //Coluna 3
        cons.gridx = 3;
        // 50% do total somando os demais 50% precisa fechar em 100%
        cons.weightx = 0.50;
        jpnCentro.add(new JTextField(), cons);
 
        //Linha 1
        cons.gridy = 1;
        //Coluna 0
        cons.gridx = 0;   
        cons.weightx = 0.10; 
        jpnCentro.add(new JLabel("Endereco:"), cons);
        //Linha 1
        cons.gridy = 1;
        //Coluna 1
        cons.gridx = 1;
        //Como esta linha tem apenas dois objetos
        //o segundo irá ocupar o espaço de 3 colunas
        //por isso setar o gridwidth para 3
        cons.gridwidth = 3;
        cons.weightx = 0.90;
        jpnCentro.add(new JTextField(), cons);
        //Após adicionar o item que irá consumir mais de uma coluna
        //O valor do gridwidth deve retornar para 1 
        cons.gridwidth = 1;
        
        
        
		//Linha 2
        cons.gridy = 2;
        //Coluna 0
        cons.gridx = 0;
        //O componente vai ocupar 10% do tamanho total
        cons.weightx = 0.10; 
        jpnCentro.add(new JLabel("Telefone:"), cons);
        //Linha 2
        cons.gridy = 2;
        //Coluna 1
        cons.gridx = 1;
        // 30% do tamanho total
        cons.weightx = 0.30;
        jpnCentro.add(new JTextField(), cons);
        
        //linha 2
        cons.gridy = 2;
        //coluna 2
        cons.gridx = 2; 
        // 10% do tamanho total
        cons.weightx = 0.10; 
        jpnCentro.add(new JLabel("CPF:"), cons);
        //Linha 2
        cons.gridy = 2;
        //Coluna 3
        cons.gridx = 3;
        // 50% do total somando os demais 50% precisa fechar em 100%
        cons.weightx = 0.50;
        jpnCentro.add(new JTextField(), cons);
        
        
        
	}
	public static void main(String args[]){
		new FrmGridBagLayout();
	}
}