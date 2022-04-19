import introducao.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {
        //Criando uma variável do tipo Pessoa
        //Criando uma instância de objeto a partir da classe Pessoa

        //passagem de parametros
        //instanciação
        Pessoa zezinho = new Pessoa("Laranja");
        zezinho.setNome("Zezinho da Silva Sauro");
        zezinho.CPF = "555.555.555-55";
        zezinho.altura = 1.8f;
        zezinho.idade = 22;

        Pessoa luizinho = new Pessoa("Limão");
        //luizinho.nome = "Luizinho da Silva Sauro Jr";

        System.out.println(zezinho.getNome());
        System.out.println(zezinho.CPF);
        System.out.println(zezinho.altura);
        System.out.println(zezinho.idade);
        System.out.println(luizinho.getNome());
        System.out.println(luizinho.CPF);
        System.out.println(luizinho.idade);

        String guardaResultado = zezinho.podeDirigir();
        System.out.println(guardaResultado);
        guardaResultado = luizinho.podeDirigir();
        System.out.println(guardaResultado);

        zezinho.mostraCPF();
        luizinho.mostraCPF();
    }
}
