package Exercicio2.Entities;

import jdk.nashorn.internal.ir.IfNode;

public class IPI {
    private double ipi = 0;
    
    if(valor < 20000){
        ipi = valor * 1.07;
    } else {
        ipi = valor * 1.19;
    }
    public double Ipi(){
        return ipi;
    }        
}

