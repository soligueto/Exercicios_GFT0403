package Exercicio2.Entities;
import Exercicio2.Imposto;
import Exercicio2.Main;

public class COFINS implements Imposto{
    
    private double cofins = 0;

    if(valor > 12000){
        cofins = valor *1,04;
    }else {
        cofins = valor;
    }

    public double Cofins(){
        return cofins;
    }
}
