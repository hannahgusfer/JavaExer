
public class Main {

	public static void main(String[] args) {
		
		/*
		 * Dado o vetor abaixo
		 */
		
		Double[][] notas = {
				{	1.0,	1.0,	1.0,	1.0,	1.0,	1.0,	4.25	},
				{	1.0,	1.0,	1.0,	1.0,	1.0,	1.0,	5.75	},
				{	1.0,	1.0,	0.0,	1.0,	1.0,	1.0,	1.00	},
				{	1.0,	1.0,	1.0,	1.0,	1.0,	1.0,	7.50	},
				{	1.0,	1.0,	1.0,	1.0,	1.0,	1.0,	8.50	},
				{	1.0,	1.0,	1.0,	1.0,	1.0,	1.0,	9.25	},
				{	1.0,	1.0,	1.0,	1.0,	1.0,	1.0,	7.50	},
				{	1.0,	1.0,	0.0,	1.0,	1.0,	1.0,	8.25	},
				{	1.0,	0.0,	1.0,	1.0,	1.0,	1.0,	4.75	}
		};
		
		/*
		 * As linhas de 0 a 5 formam a primeira nota,
		 * calcule a nota sabendo que se o mesmo fez todos os 
		 * exercícios sua nota é 10 e se não fez nenhum sua 
		 * nota é zero.
		 * 
		 * As notas do exercício tem peso de 40% sobre a nota final
		 * enquanto a nota da prova tem peso de 60%, calcule a nota
		 * final.
		 */
		
		for (int i = 0; i < notas.length; i++) {
		
		Double ex = notas[i][0] + notas[i][1]+ notas[i][2]+ notas[i][3]+ notas[i][4]+ notas[i][5];
		Double exFinal = (ex * 10)/6;
		Double notaProva = notas[i][6];
		Double notaParcial = (exFinal * 0.4) + (notaProva * 0.6);
		
		System.out.println(notaParcial);

		}
	}

}
