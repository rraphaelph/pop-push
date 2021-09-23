
public class Pilha {
	
	private String vetor[];
	private int topo;
	
	public Pilha(int capacidade)
	{
		vetor = new String[capacidade];
		topo = 0;
	}
	
	public void push(String valor) throws ArrayIndexOutOfBoundsException
	{
		vetor[topo] = valor;
		topo++;
	}
	
	public String pop() throws ArrayIndexOutOfBoundsException {
		if(topo == 0)
			throw new ArrayIndexOutOfBoundsException();
					
		return vetor[--topo]; 
	}
	
	public String toString() {
		String saida = "";
		for(int i = topo-1; i >= 0; i--)
			saida += vetor[i] + "\n";
		return saida;
	}
}
