import java.util.Random;

public class Sorteador{
    public static void main(String[] args) {
        Random sorteador = new Random();
        sorteador.setSeed(System.currentTimeMillis());
        for(int i=0;i<=1;i++){
            var dado = sorteador.nextInt(1000);
            System.out.println(dado);
        }
    }
}