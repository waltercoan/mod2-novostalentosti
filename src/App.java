import introducao.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {
        //Criando uma variável do tipo Pessoa
        //Criando uma instância de objeto a partir da classe Pessoa
        Pessoa zezinho = new Pessoa();
        zezinho.nome = "Zezinho da Silva Sauro";
        zezinho.CPF = "555.555.555-55";
        zezinho.altura = 1.8f;
        zezinho.idade = 22;

        Pessoa luizinho = new Pessoa();
        luizinho.nome = "Luizinho da Silva Sauro Jr";

        System.out.println(zezinho.nome);
        System.out.println(zezinho.CPF);
        System.out.println(zezinho.altura);
        System.out.println(zezinho.idade);
        System.out.println(luizinho.nome);
        System.out.println(luizinho.CPF);
        System.out.println(luizinho.idade);
        

    }
}
