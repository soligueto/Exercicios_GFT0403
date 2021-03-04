import java.util.Scanner;

public class Exercicio1 {
    public static void main( String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int maior = 0, menor = 1000;

        boolean iguais = true;
        System.out.println("Digite 5 números entre 0 e 1000");
        for (int i = 1; i <= 5; i++) {
            int x = sc.nextInt();
            if (x > maior) {
                maior = x;
            }
            if ( x < menor){
                menor = x;
            }
            if (menor != maior) {
                iguais = false;
            }            
        }
        System.out.println("Maior número = " + maior);
        System.out.println("Menor número = " + menor);
        if (iguais == true) {
            System.out.println("Todos os números são iguais");
        }
    sc.close();
    }
}

