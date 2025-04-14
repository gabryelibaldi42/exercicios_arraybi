public class ExerciciosArrays {
    public int[][] exercicio1a() {
        // Criar a matriz com 3 linhas e 10 colunas
        int[][] matriz = new int[3][10];

        //Preencher Matriz
        for (int i = 0; i < matriz.length; i++) { // Percorre as linhas
            for(int j = 0; j < matriz[i].length; j++) { // Percorre as colunas
                matriz[i][j] = j; // Cada coluna J, recebe o valor J
            }
        }
        // Retornar Matriz
        return matriz;
    }
}