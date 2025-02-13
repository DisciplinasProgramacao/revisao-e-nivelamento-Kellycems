package POO_Polimorfismo;

public class ProdutoNaoPerecivel extends Produto {

    public ProdutoNaoPerecivel(String desc, double precoCusto, double margemLucro){
        super(desc, precoCusto, margemLucro);
    }

    public ProdutoNaoPerecivel(String desc, double precoCusto){
        super(desc, precoCusto);
    }

    public double valorVenda(){
        return precoCusto;
    }

    


}
