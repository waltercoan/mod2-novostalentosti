package sistema.exception;

public class ValorInvalidoException extends Exception{
    //mensagem de erro + campo + exception
    private String nomeCampo = "";
    
    //Sobrecarga de construtor
    public ValorInvalidoException(String mensagem, Exception origem, String nomeCampo) {
        this(mensagem, origem); // this chama construtor da própria classe
        this.nomeCampo = nomeCampo;
    }
    
    //Sobrecarga de construtor
    public ValorInvalidoException(String mensagem, Exception origem) {
        super(mensagem, origem); //super se refer a SuperClasse (PAI) Exception
        //super(); chama o construtor da SuperClasse
    }
}
