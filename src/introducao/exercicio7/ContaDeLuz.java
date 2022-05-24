package introducao.exercicio7;

import java.util.Date;

public class ContaDeLuz {
    private float valorDaConta;
    private Date dataLeitura;
    private int numeroLeitura;
    private float quantidadeKW;
    private Date dataPagamento;
    private float valorMedio;

    public ContaDeLuz(float valorDaConta,
                      Date dataLeitura,
                      int numeroLeitura,
                      float quantidadeKW,
                      Date dataPagamento,
                      float valorMedio) {
        this.valorDaConta = valorDaConta;
        this.dataLeitura = dataLeitura;
        this.numeroLeitura = numeroLeitura;
        this.quantidadeKW = quantidadeKW;
        this.dataPagamento = dataPagamento;
        this.valorMedio = valorMedio;
    }

    public float getValorDaConta() {
        return valorDaConta;
    }
    public Date getDataLeitura() {
        return dataLeitura;
    }
    public int getNumeroLeitura() {
        return numeroLeitura;
    }
    public float getQuantidadeKW() {
        return quantidadeKW;
    }
    public Date getDataPagamento() {
        return dataPagamento;
    }
    public float getValorMedio() {
        return valorMedio;
    }    
}
