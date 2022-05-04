package introducao.exercicio2;

import java.util.ArrayList;
import java.util.Date;

public class Reserva {
    private int numero;
    private Date dataInicial;
    private Date dataFinal;
    private Quarto quarto;
    private ArrayList<Hospede> listaHospedes = new ArrayList<>();

    public String toString(){
        StringBuilder montadorString = new StringBuilder();
        montadorString.append("Reserva: " + numero);
        //montadorString.append(String.format("Reserva: %d", numero));
        montadorString.append("Data Inicial: " + dataInicial);
        montadorString.append("Data Final: " + dataFinal);

        return montadorString.toString();
    }

    public Quarto getQuarto() {
        return quarto;
    }

    public ArrayList<Hospede> getListaHospedes() {
        return listaHospedes;
    }

    public void setListaHospedes(ArrayList<Hospede> listaHospedes) {
        this.listaHospedes = listaHospedes;
    }

    public void setQuarto(Quarto quarto) {
        this.quarto = quarto;
    }

    public Reserva(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Date getDataInicial() {
        return dataInicial;
    }

    public void setDataInicial(Date dataInicial) {
        this.dataInicial = dataInicial;
    }

    public Date getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(Date dataFinal) {
        this.dataFinal = dataFinal;
    }

    
}
