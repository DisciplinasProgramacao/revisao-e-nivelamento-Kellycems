package POO_Polimorfismo;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class ProdutoPerecivel extends Produto {
    private static double DESCONTO = 0.25;
    private static int PRAZO_DESCONTO = 7;
    private LocalDate dataDeValidade;


    public ProdutoPerecivel(String desc, double precoCusto, double margemLucro, LocalDate validade){
        super(desc, precoCusto, margemLucro);
        dataDeValidade = validade;
    }

    @Override
     public double valorVenda() {
        int prazoParaValidadeEmDias = LocalDate.now().until(dataDeValidade).getDays();
        
        if (prazoParaValidadeEmDias <= PRAZO_DESCONTO) {
            return (precoCusto * (1 + margemLucro)) * (1-DESCONTO);
        } else {
            return precoCusto;
        }
    }
         
     
}
