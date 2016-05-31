
public class Main {

	public static void main(String[] args) {
		
		/*
		 * Dada a matriz abaixo:
		 */
		
		char[][] matriz = {
				{'s', 'a', 'p', 'o'},
				{'b', 'a', 'l', 'a'},
				{'o', 's', 's', 'o'},
				{'c', 'a', 's', 'a'},
				{'f', 'o', 'g', 'o'},
				{'g', 'e', 'l', 'o'},
				{'f', 'a', 's', 'e'},
				{'e', 's', 's', 'e'},
				{'a', 'b', 'b', 'a'},
				{'r', 'e', 's', 'a'},
		};
		
		/*
		 * Crie uma rotina para mostrar na tela as linhas
		 * que formam palavras palindromas
		 */
		
		for (int i = 0; i < matriz.length; i++) {
			
			String nome = "";
			String nomeInv = "";
			
			for (int j = 0; j < matriz[0].length; j++) {
				nome += matriz[i][j];
				nomeInv += matriz [i][3-j];
			}
			
			if (nome.equals(nomeInv)){
			
				System.out.println(nome);
			}
				
				
			}
			System.out.print("\n");
		}
		
		/*
		 * Preencha o vetor abaixo com o número de vezes que uma vogal 
		 * aparece no vetor acima sendo o índice 0 para a e 5 para u
		 */
		
		int[] nrVogais = { 0, 0, 0, 0, 0 };
		
		
		
		

	

}
