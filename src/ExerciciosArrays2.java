public class ExerciciosArrays2 {
    int[][] exercicio1b() {
        int[][] matriz = new int[5][10];

        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = j*j; // Cada coluna j recebe o valor j ao quadrado
            }
        }
        return matriz;
    }
}
