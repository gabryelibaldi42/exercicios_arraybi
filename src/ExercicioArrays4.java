public class ExercicioArrays4 {
    public int[][] exercicio1d() {
        int[][] matriz = new int[9][6];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i % 2 == 0) {
                    matriz[i][j] = -1; //linhas pares recebem -1
                 } else {
                    matriz[i][j] = 0; //linhas impares recebem 0
                }
            }
        }
        return matriz;
    }
}
