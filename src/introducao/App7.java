package introducao;

import java.util.Calendar;
import java.util.GregorianCalendar;
import introducao.exercicio4.EmpresaCliente;
import introducao.exercicio4.Funcionario;
import introducao.exercicio4.PessoaFisica;

public class App7 {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario();
        EmpresaCliente empresa1 = new EmpresaCliente();

        funcionario1.setCPF("555.555.555-55");
        funcionario1.setFuncao("Atendimento");
        funcionario1.setId(1010);
        funcionario1.setNome("Zezinho");
        funcionario1.setTelefone("5555-5555");
        Calendar calendario = GregorianCalendar.getInstance();
        calendario.set(2000,05,10);
        funcionario1.setDataNascimento(calendario.getTime());

        empresa1.setNome("Tio Patinhas Corporation");
        empresa1.setCNPJ("999.999.0001-99");
        empresa1.setMarca("Dinheiro");
        empresa1.setTelefone("5555-6666");
        empresa1.setNumFuncionarios(10);
        calendario.set(2022,05,10);
        empresa1.setDataCriacao(calendario.getTime());
        //2)Crie uma variável pessoa1:PessoaFisica e atribua 
        //o valor de funcionario1. Imprima em tela os atributos que são visíveis.
        //POLIMORFISMO - POLI - varias MORFIMOS - formas de existir
        PessoaFisica pessoa1 = funcionario1;
        System.out.println(pessoa1.getDataNascimento());
        System.out.println(pessoa1.getCPF());
        System.out.println(pessoa1.getNome());
        System.out.println(pessoa1.getTelefone());

    }
}
