package introducao.avaliacao1;

public class AppAvaliacao1 {
    public static void main(String[] args) {
        Obra obra1 = new Obra();

        FaseDaObra fase1 = new FaseDaObra();
        fase1.setNome("Fundação");
        obra1.getListaFases().add(fase1);

        FaseDaObra fase2 = new FaseDaObra();
        fase2.setNome("PrimeiroAndar");
        obra1.getListaFases().add(fase2);

        var eng1 = new Engenheiro();
        eng1.setNome("Rick Sanchez");
        eng1.setNumero(1234);
        eng1.setSalario(10000);
        eng1.setFormacao("Engenheiro Civil");
        fase2.setEncarregado(eng1);

        var eng2 = new Engenheiro();
        eng2.setNome("Emmett Brown");
        eng2.setNumero(4321);
        eng2.setSalario(15000);
        eng2.setFormacao("Engenheiro Civil");
        fase1.setEncarregado(eng2);

        var cons1 = new Construtor();
        cons1.setNome("Huguinho");
        cons1.setNumero(1111);
        cons1.setSalario(3000f);
        cons1.setTerceirizado(false);
        fase2.getListaConstrutores().add(cons1);

        var cons2 = new Construtor();
        cons2.setNome("Luizinho");
        cons2.setNumero(2222);
        cons2.setSalario(2500f);
        cons2.setTerceirizado(true);
        fase2.getListaConstrutores().add(cons2);

        var cons3 = new Construtor();
        cons3.setNome("Zezinho");
        cons3.setNumero(3333);
        cons3.setSalario(3000f);
        cons3.setTerceirizado(false);
        fase1.getListaConstrutores().add(cons3);

        var mat1 = new MaterialDeConstrucao();
        mat1.setNome("Viga de madeira");
        mat1.setPreco(20f);

        var mat2 = new MaterialDeConstrucao();
        mat2.setNome("Saco de cimento");
        mat2.setPreco(80f);

        var mat3 = new MaterialDeConstrucao();
        mat3.setNome("Vergalhão de aço");
        mat3.setPreco(50f);

        var item1 = new ItemDeConstrucao();
        item1.setQuantidade(500);
        item1.setProduto(mat1);
        fase2.getListaItens().add(item1);

        var item2 = new ItemDeConstrucao();
        item2.setQuantidade(800);
        item2.setProduto(mat2);
        fase2.getListaItens().add(item2);

        var item3 = new ItemDeConstrucao();
        item3.setQuantidade(900);
        item3.setProduto(mat2);
        fase1.getListaItens().add(item3);

        var item4 = new ItemDeConstrucao();
        item4.setQuantidade(1000);
        item4.setProduto(mat3);
        fase1.getListaItens().add(item4);

        float valTot = obra1.calcularValorTotalDaObra();
        System.out.println("O valor total e " + valTot);
        
        String textoLista = obra1.listarDadosDaObra();
        System.out.println(textoLista);




        


    }
}
