package calculadorademedia;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int contador = 0;
        int media;
        int soma = 0;
        int flag = 0;
        int nota;
        Scanner input = new Scanner(System.in);
        
        while (flag >= 0)
        {
            System.out.println("Digite a nota, ou digite um número negativo para encerrar: ");
            nota =  input.nextInt();
            if (nota < 0)
            {
                flag = -1;
                input.close();
            }
            else {
                soma += nota;
                contador++;
            }
        }
        media = soma/contador;
        System.out.println("Número de dados inseridos: " + contador + " média dos dados: " + media);

    }
}