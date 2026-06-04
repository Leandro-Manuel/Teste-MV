import java.util.Scanner;
public class Desafio1 {
    public static void main(String[] args) {

        // declaracao do objeto scanner para ler dados do usuario
        var input = new Scanner(System.in);

        // variavel para somar os valores
        float soma = 0;

        // declaracao de uma variavel composta, vetor com 5 posicoes
        int[] vetor = new int[5];

        // loop for para ler e preencher nosso vetor
        for(int x=0; x<5; x++) {
            System.out.print("Insira o valor " + (x+1) + ": ");
            vetor[x] = input.nextInt();
            soma += vetor[x];
        }

        // como boa pratica, fechei o scanner
        input.close();

        // declaro que o valor do primeiro elemento é maior/menor para facilitar na comparacao com os demais valores
        int maior = vetor[0];
        int menor = vetor[0];


        // comparo cada indice do vetor para encontrar o maior e menor valor
        for(int y=1; y<5; y++) {
            if(vetor[y] > maior) {
                maior = vetor[y];
            }

            if(vetor[y] < menor) {
                menor = vetor[y];
            }
        }

        // exibo maior, menor e media dos valores
        System.out.println("Maior valor: " + maior);
        System.out.println("Menor valor: " + menor);
        System.out.println("Média dos valores: " + soma / 5);
    }
}
