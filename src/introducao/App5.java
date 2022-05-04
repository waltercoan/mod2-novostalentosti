package introducao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import introducao.exercicio2.Hospede;
import introducao.exercicio2.Quarto;
import introducao.exercicio2.Reserva;

public class App5 {
    public static void main(String[] args)  {
        //SimpleDateFormat converte texto pra data ou data pra
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Quarto quarto1 = new Quarto();
        quarto1.setNumero(100);

        Hospede pessoa1 = new Hospede("111.111.111-11");
        pessoa1.setNome("Zezinho");
        pessoa1.setTelefone("5555-1234");

        Hospede pessoa2 = new Hospede("222.222.222-22");
        pessoa2.setNome("Mariazinha");
        pessoa2.setTelefone("5555-4321");

        Reserva reserva1 = new Reserva(1001);
        try {
            reserva1.setDataInicial(sdf.parse("28/04/2022"));
            reserva1.setDataFinal(sdf.parse("05/05/2022"));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        reserva1.setQuarto(quarto1);
        reserva1.getListaHospedes().add(pessoa1);
        reserva1.getListaHospedes().add(pessoa2);
        
        System.out.println(reserva1);



        

    }
}
