package introducao;



import introducao.exercicio1.Autor;
import introducao.exercicio1.Livro;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class App4 {
    public static void main(String[] args) {
        
        Livro livro1 = new Livro("Java como programar");
        livro1.setValor(349f);
        livro1.setEsgotado(false);

        //Desta forma cria a data com o valor incorreto
        //Autor autor = new Autor("Deitel",new Date(1945,01,01));
        //Para criar a data do jeito certo
        Calendar calendario = GregorianCalendar.getInstance();
        calendario.set(1945,0,01);
        Autor autor = new Autor("Deitel",calendario.getTime());
        livro1.setEscritor(autor);

        System.out.println(livro1);
        
        try {
            Livro livro2 = new Livro("UML guia do usuário");
            livro2.setValor(165f);
            livro2.setEsgotado(false);
            //Outra forma de criar uma data é usando o SimpleDateFormat
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            Autor autor2 = new Autor("Grady Booch",sdf.parse("27/12/1955"));
            livro2.setEscritor(autor2);
            System.out.println(livro2);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        Livro livro3 = new Livro("Java 2 Ensino Didático");
        livro3.setValor(126f);
        livro3.setEsgotado(true);
        Autor autor3 = new Autor("Grady Booch", null);
        livro3.setEscritor(autor3);
        System.out.println(livro3);


        


    }
}
