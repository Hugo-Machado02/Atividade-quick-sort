public class QuickSort {

    public static void main(String[] args) {
        int[] array = {6, 9, 8, 1, 4, 7, 6, 2, 5};

        System.out.print("\nVetor Desordenado -> {");
        imprimirVetor(array);

        int inicia_left = 0;
        int inicia_right = array.length - 1;

        System.out.print("\nVetor Ordenado -> {");
        ordenaVetor(array, inicia_left, inicia_right);

        imprimirVetor(array);
    }

    public static void ordenaVetor(int[] array, int esq, int dir){
        if(esq < dir){
            int pivo = pertes(array, esq, dir);
            ordenaVetor(array, esq, pivo);
            ordenaVetor(array, pivo+1 , dir);
        }
    }

    public static int pertes(int[] array, int esq, int dir){
        int index = (esq + dir) / 2;
        int pivo = array[index];
        int l = esq - 1;
        int r = dir + 1;

        while (true) {
            do {
                l++;
            } while (array[l] < pivo);
    
            do {
                r--;
            } while (array[r] > pivo);
    
            if (l >= r) {
                return r;
            }

            int aux = array[l];
            array[l] = array[r];
            array[r] = aux;
        }
    }

    public static void imprimirVetor(int[] array){
        for(int i = 0; i< array.length - 1; i++){
            if(i < array.length-2){
                System.out.print(array[i]+", ");
            }else{
                System.out.print(array[i]+"}");
            }
        }
    } 
}
