package recursiva_menor_valor_vetor;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		String input;
		String[] valores;
		int[] vetor ;
		int menor;
		int resultado;
		
		input = JOptionPane.showInputDialog("Digite os valores separados por virgula(,):");
        valores = input.split(",");
        
        vetor = new int[valores.length];
        
        //Converte os valores para intereiro
        for (int i = 0; i < valores.length; i++) {
            vetor[i] = Integer.parseInt(valores[i]);
        }
        
        //menor valor como ultimo numero do vetor
        menor = vetor[vetor.length - 1];
        
        resultado = RecursivaVetor.menorValor(vetor, vetor.length, menor);
        
        JOptionPane.showMessageDialog(null, "O menor valor do vetor é: " + resultado);
	}

}
