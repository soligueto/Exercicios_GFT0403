import java.util.Scanner;
public class Exercício4 {
    public static void main( String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int x = sc.nextInt();        
        String frase = "";
        String add = "incomoda ";

        for (int i = 0; i < x; i++) {
            frase = frase + add;
        }

        System.out.println(frase + "muito mais");

    sc.close();
    }
}
