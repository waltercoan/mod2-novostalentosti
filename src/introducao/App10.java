package introducao;

import java.util.Calendar;
import java.util.GregorianCalendar;

import introducao.exercicio7.ContaDeLuz;
import introducao.exercicio7.Planilha;

public class App10 {
    public static void main(String[] args) {
        Calendar calendario = GregorianCalendar.getInstance();
        Planilha plan1 = new Planilha();

        calendario.set(2022, 05, 24);
        ContaDeLuz conta1 = 
            new ContaDeLuz(300f, calendario.getTime(), 
                          1, 32, 
                          calendario.getTime(), 0);
        
        calendario.set(2022, 05, 23);
        ContaDeLuz conta2 = 
            new ContaDeLuz(400f, calendario.getTime(), 
                        2, 42, 
                        calendario.getTime(), 0);
        plan1.getListaContasDeLuz().add(conta1);
        plan1.getListaContasDeLuz().add(conta2);
    }
}
