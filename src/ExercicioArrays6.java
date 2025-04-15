import java.util.Scanner;

public class ExercicioArrays6 {
    public double[][] lerMatrizDouble() {
        //criar o objeto scanner para leitura do teclado
        Scanner scanner = new Scanner(System.in);

        //criar matriz 2x5
        double[][] matriz = new double[2][5];

        //ler 10 valores double e preencher a matriz
        System.out.println("Digite 10 valores double para preencher a matriz 2x5: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = scanner.nextDouble();
            }
        }

        //fechar o scanner
        scanner.close();

        //retornar a matriz
        return matriz;
    }

    // método para teste
    public static void main(String[] args) {
        ExercicioArrays6 ex = new ExercicioArrays6();
        double[][] matriz = ex.lerMatrizDouble();

        // imprimir a matriz para verificar
        System.out.println("Matriz preenchida:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
