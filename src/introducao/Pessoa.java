package introducao;

public class Pessoa {
    //Atributos (variaveis) automaticamente inicializados com o valor padrão
    //escopo de vida de instancia
    private String nome;
    public int idade;
    public String CPF;
    public float altura;
    
    //GETTER e SETTER
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    //comportamento
    //CONSTRUTOR - inicializar um objeto e definir valores obrigatorios
    public Pessoa(String nome){ //escopo de vida local
        System.out.println("CONSTRUTOR:" + nome);
        this.nome = nome;
    }//ate aqui
    
    //metodo (função)
    //assinatura de um método
    //modificadordeacesso tipoderetorno nomedometodo(parametros) { corpo }
    public String podeDirigir(){
        if(this.idade >= 18){
            return "Pode dirigir";
        }else{
            return "Não pode dirigir";
        }
    }
    public void mostraCPF(){
        System.out.println(this.CPF);
    }
}
