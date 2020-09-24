package busca.Recursiva;


	public class Vetor {

		private int[] obj = new int[10];
		 private int size = 0;

		 public Vetor() {
			 
			 this.popularVetor();
		 }
		
		 public int buscaBinaria(int valor) {
			int inicio = 0;
			int fim;
			int meio;
			
		    fim = this.obj.length -1;
		    
		    while(inicio<=fim) {
		    	
		    	meio = (inicio +fim) /2;
		    	
		    	if(this.obj[meio]==valor) {
		    		return this.obj[meio];
		    	}
		    	else if(this.obj[meio]<valor) inicio =meio +1;
		    	else fim =meio -1;
		    }		    
			 
			 return 0;
		 }
		 
		private void popularVetor() {
			
			for(int i = 0;i< 10;i++) {
				this.obj[i] = i * 10;
				this.size++;
			}
			
		}

		public void adiciona(int obj) {
		
			
			if(this.obj.length == size) {
				System.out.println("Vetor esta cheio");
				return;
			}
			this.obj[size] = obj;
			size++;
		}
		
		
		public boolean Empty() {
			return size ==0;
		}
		
		public boolean Cheia() {
			return this.size == obj.length;
		}
		public int tamanho(){
			
			return size ;
		}
		
		
		public String toString() {

			if (this.size == 0) {
				return "[]";
			}

			StringBuilder builder = new StringBuilder("[");

			for (int i = 0; i < this.size; i++) {
				builder.append(this.obj[i]);
				builder.append(",");

			}

			builder.append("]");

			return builder.toString();
		}

		public int buscaSequencial(int valor) {
			
			int i=0;
			while(i<this.obj.length && this.obj[i]!=valor) i++;
			
			if(i>this.obj.length-1) return -1;
			
			return this.obj[i] ;
		}
	}

