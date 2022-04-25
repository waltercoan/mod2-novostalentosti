import introducao.Aplicativo;
import introducao.Celular;
import introducao.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {
        //Criando uma variável do tipo Pessoa
        //Criando uma instância de objeto a partir da classe Pessoa

        //passagem de parametros
        //instanciação
        Pessoa zezinho = new Pessoa("Laranja");
        zezinho.setNome("Zezinho da Silva Sauro");
        zezinho.setCPF("555.555.555-55");
        zezinho.setAltura(1.8f);
        zezinho.setIdade(22);

        Pessoa luizinho = new Pessoa("Limão");
        //luizinho.nome = "Luizinho da Silva Sauro Jr";

        System.out.println(zezinho.getNome());
        System.out.println(zezinho.getCPF());
        System.out.println(zezinho.getAltura());
        System.out.println(zezinho.getIdade());
        System.out.println(luizinho.getNome());
        System.out.println(luizinho.getCPF());
        System.out.println(luizinho.getIdade());

        String guardaResultado = zezinho.podeDirigir();
        System.out.println(guardaResultado);
        guardaResultado = luizinho.podeDirigir();
        System.out.println(guardaResultado);

        zezinho.mostraCPF();
        luizinho.mostraCPF();

        Celular startak = new Celular("(47) 99999-5555");
        startak.setModelo("PT 550");
        startak.setMarca("Motorola");

        startak.setDono(zezinho);
        
        Aplicativo app1 = new Aplicativo("Angry Birds");
        Aplicativo app2 = new Aplicativo("Whatsapp");
        Aplicativo app3 = new Aplicativo("Tiktok");
        Aplicativo app4 = new Aplicativo("Instagram");

        startak.getListaAplicativos().add(app1);
        startak.getListaAplicativos().add(app2);
        startak.getListaAplicativos().add(app3);
        startak.getListaAplicativos().add(app4);
        

    }
}
