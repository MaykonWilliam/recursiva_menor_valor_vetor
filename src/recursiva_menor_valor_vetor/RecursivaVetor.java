package recursiva_menor_valor_vetor;

public class RecursivaVetor {
	// 
    public static int menorValor(int[] vetor, int tamanho, int menor) {
        // para quando atingir o ultimo valor do vetor, onde o tamanho é 0
        if (tamanho == 0) {
            return menor;
        }
        
        //verifica se o valor anterior é menor que o valor atual
        if (vetor[tamanho - 1] < menor) {
            menor = vetor[tamanho - 1];
        }
        
        // chama a função reduzindo o tamanho do vetor.
        return menorValor(vetor, tamanho - 1, menor);
    }
}
