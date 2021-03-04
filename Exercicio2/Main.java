package Exercicio2;
import java.util.Scanner;

import Exercicio2.Imposto;

public class Main {
    public static void main( String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Digite o valor : ");
    double valor = sc.nextInt();        

    Imposto imp = new calcularImposto(valor);

    System.out.println(imp);

    sc.close();
    }
}
