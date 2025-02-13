package POO_Polimorfismo;


import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class ProdutoPerecivelTest {

    static Produto produto;
        
    
    @BeforeAll
    static public void prepare(){
        String s = "15/02/2025";
        DateTimeFormatter parser = DateTimeFormatter.ofPattern("dd/MM/uuuu");
        LocalDate data = LocalDate.parse(s, parser);
        produto = new ProdutoPerecivel("Produto teste", 100, 0.2, data);
    }
    
    @Test
    public void calculaPrecoCorretamente(){
        assertEquals(90.0, produto.valorVenda(), 0.01);
    }

    // @Test
    // public void stringComDescricaoEValor(){
    //     String desc = produto.toString();
    //     assertTrue(desc.contains("Produto teste") && desc.contains("R$ 110,00"));
    // }

    // @Test
    // public void naoCriaProdutoComPrecoNegativo(){
    //     assertThrows(IllegalArgumentException.class, () -> new ProdutoPerecivel("teste", -5, 0.5));
    // }
    
    // @Test
    // public void naoCriaProdutoComMargemNegativa(){
    //     assertThrows(IllegalArgumentException.class, () -> new ProdutoPerecivel("teste", 5, -1));
    // }
}