public class ExercicioArrays7 {
    public int contarElementos(double[][] matriz) {
        //verificar se a matriz é null ou vazia
        if (matriz == null || matriz.length == 0) {
            return 0;
        }

        //calcular o número total de elementos: linha x colunas
            int linhas = matriz.length;
            int colunas = matriz[0].length; //assume que a matriz tem pelo menos uma linha

            return linhas * colunas;
    }
}
