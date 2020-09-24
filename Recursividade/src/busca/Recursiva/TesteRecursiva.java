package busca.Recursiva;

public class TesteRecursiva {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		String resultBuscaBinaria = buscaBinaria(20);
		String resultBuscaBinaria02 = buscaBinaria(13254);
		System.out.println(resultBuscaBinaria);
		System.out.println(resultBuscaBinaria02);
		
		String resultBuscaSequencial = buscaSequencial(800);
		String resultBuscaSequencial02 = buscaSequencial(90);
		
		System.out.println(resultBuscaSequencial);
		System.out.println(resultBuscaSequencial02);

	}

	private static String buscaSequencial(int valor) {
		
		Vetor vet  = new Vetor();
		
		String result = valor == vet.buscaSequencial(valor) ? "Valor "+ valor +" foi encontrado" :
			"Valor "+valor+" não encontrado";	
		
		return result;
		
	}

	private static String buscaBinaria(int valor) {
		
		Vetor vet  = new Vetor();		
		
		String result = valor == vet.buscaBinaria(valor) ? "Valor "+ valor +" foi encontrado" :
			"Valor "+valor+" não encontrado";
		
		return result;
	}

}
