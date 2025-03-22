package calculadorademedia;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        // inicia as variáveis que serão utilizadas no programa
        int contador = 0;
        int media;
        int soma = 0;
        int flag = 0;
        int num;

        // inicia o input utilizando o metódo scanner
        Scanner input = new Scanner(System.in);
        
        // enquanto a flag for maior ou igual que 0, o programa irá continuar
        while (flag >= 0)
        {
            // pede um número ao usuário
            System.out.println("Digite o número, ou digite um número negativo para encerrar: ");

            // armazena o numero inserido pelo usuario na variavel num
            num =  input.nextInt();

            // se a variavel num tiver o valor menor que 0, irá alterar a flag para -1 e o laço while irá se encerrar
            if (num < 0)
            {
                flag = -1;
                input.close();
            }
            // senao, irá somar o numero inserido pelo usuário na variavel soma e irá incrementar a variavel contador em 1
            else {
                soma += num;
                contador++;
            }
        }

        // ao sair do laço, realiza o calculo da média dos numeros inseridos e exibe a mensagem
        media = soma/contador;
        System.out.println("Número de dados inseridos: " + contador + ", média dos dados: " + media);

    }
}