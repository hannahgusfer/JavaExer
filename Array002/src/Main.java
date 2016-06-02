
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
		
		
		/*
		 * Preencha o vetor abaixo com o número de vezes que uma vogal 
		 * aparece no vetor acima sendo o índice 0 para a e 5 para u
		 */
		
		int[] nrVogais = { 0, 0, 0, 0, 0 };
		
		
		//Percorrer linha a linha
		
		for(int i=0; i < 10; i++){
			
		//Percorre a coluna
		for(int j=0; j<4; j++){
		
			
			char letraAtual = matriz[i][j];
			
			if(letraAtual == 'a'){
				nrVogais[0] = nrVogais[0] + 1;
			}
				
			if(letraAtual == 'e'){
				nrVogais[1] = nrVogais[1] + 1;
			}
					
			if(letraAtual == 'i'){
				nrVogais[2] = nrVogais[2] + 1;
			}
			if(letraAtual == 'o'){
				nrVogais[3] = nrVogais[3] + 1;
			}
			if(letraAtual == 'u'){
				nrVogais[4] = nrVogais[4] + 1;
				
				
					
			}
			


		}
			
		}
		
		System.out.print("a: ");
		System.out.println(nrVogais[0]);
		
		System.out.print("e: ");
		System.out.println(nrVogais[1]);
	
		System.out.print("i: ");
		System.out.println(nrVogais[2]);
		
		System.out.print("o: ");
		System.out.println(nrVogais[3]);
		
		System.out.print("u: ");
		System.out.println(nrVogais[4]);
		}

}
