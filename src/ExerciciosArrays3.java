public class ExerciciosArrays3 {
    public int[][] exercicio1c() {
        int[][] matriz = new int[6][6];

        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = i;
            }
        }
        return matriz;
    }
}
