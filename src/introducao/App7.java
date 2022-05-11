package introducao;

import java.util.Calendar;
import java.util.GregorianCalendar;
import introducao.exercicio4.EmpresaCliente;
import introducao.exercicio4.Funcionario;
import introducao.exercicio4.PessoaFisica;
import introducao.exercicio4.PessoaJuridica;

public class App7 {
    public static void main(String[] args) {
        //Instanciando a classe funcionario e a classe empresacliente
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

        //3)Crie uma variável pessoa2:PessoaJuridica e 
        PessoaJuridica pessoa2;
        //atribua o valor de empresa1. Imprima em 
        pessoa2 = empresa1;
        //tela os atributos que são visíveis.
        System.out.println(pessoa2.getNome());
        System.out.println(pessoa2.getTelefone());
        System.out.println(pessoa2.getDataCriacao());
        System.out.println(pessoa2.getCNPJ());
        
        //4)Crie uma variável pessoa3:Pessoa e 
        introducao.exercicio4.Pessoa pessoa3;
        //atribua o valor de pessoa1. Imprima 
        pessoa3 = pessoa1;
        //em tela os atributos que são visíveis.
        System.out.println(pessoa3.getNome());
        System.out.println(pessoa3.getTelefone());

        //5)Crie uma variável pessoa4:Pessoa e 
        introducao.exercicio4.Pessoa pessoa4;
        //atribua o valor de pessoa2. Imprima
        pessoa4 = pessoa2; 
        //em tela os atributos que são visíveis.
        System.out.println(pessoa4.getNome());
        System.out.println(pessoa4.getTelefone());
        
        //6)Crie uma variável funcionario2:Funcionario 
        Funcionario funcionario2;
        //e atribua o valor de pessoa3. Imprima 
        funcionario2 = (Funcionario)pessoa3;
        //em tela os atributos que são visíveis.
        System.out.println(funcionario2.getNome());
        System.out.println(funcionario2.getCPF());
        System.out.println(funcionario2.getDataNascimento());
        System.out.println(funcionario2.getFuncao());
        System.out.println(funcionario2.getId());
        System.out.println(funcionario2.getTelefone());

        //7)Crie uma variável empresa2:EmpresaCliente e 
        EmpresaCliente empresa2;
        //atribua o valor de pessoa4. 
        //Imprima em tela os atributos que são visíveis.
        empresa2 = (EmpresaCliente)pessoa4;
        System.out.println(empresa2.getNome());
        System.out.println(empresa2.getCNPJ());
        System.out.println(empresa2.getDataCriacao());
        System.out.println(empresa2.getMarca());
        System.out.println(empresa2.getNumFuncionarios());
        System.out.println(empresa2.getTelefone());
        

    }
}
