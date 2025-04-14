import java.util.Random;
import java.util.Scanner;

public class ExerciciosArray5 {
    public int[][] criarMatrizAleatoria() {
        //criar objeto scanner para leitura do teclado
        Scanner scanner = new Scanner(System.in);

        //solicitar o numero de linhas
        System.out.println("Digite o número de linhas da Matriz: ");
        int linhas = scanner.nextInt();

        //solicitar o número de colunas
        System.out.println("Digite o número de colunas da Matriz: ");
        int colunas = scanner.nextInt();

        //validar entradas (recomendado)
        if (linhas <= 0 || colunas <= 0) {
            System.out.println("Dimensões inválidas! Usando 1x1 como padrão.");
            linhas = 1;
            colunas = 1;
        }

        //criar a matriz com o tamanho especificado
        int[][] matriz = new int[linhas][colunas];

        //criar objeto Random para gerar números aleatórios
        Random random = new Random();

        //preencher matriz com números aleatórios de 0 a 99
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matriz[i][j] = random.nextInt(100); //gera número de 0 a 99
            }
        }
        // fechar o scanner
        scanner.close();

        //retorna a matriz
        return matriz;
    }

    // método main para teste
    public static void main(String[] args) {
        ExerciciosArray5 ex = new ExerciciosArray5();
        int[][] matriz = ex.criarMatrizAleatoria();

        // Imprimir a matriz para verificar
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}