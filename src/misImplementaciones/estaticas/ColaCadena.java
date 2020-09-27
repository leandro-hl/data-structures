package misImplementaciones.estaticas;

public class ColaCadena implements miApi.ColaCadenaTDA {
	
	private String [] vector;
	private int poner, sacar;
	

	@Override
	public void inicializarCola() {
		vector = new String [101];
		poner=sacar=0;
		
	}

	@Override
	public void acolar(String x) {
		vector[poner] = x;
		poner+=1;
		if(poner == 101) {
			poner = 0;
		}
	}

	@Override
	public void desacolar() {
		sacar+=1;
		if (sacar == 101) {
			sacar = 0;
		}
	}

	@Override
	public boolean colaVacia() {
		
		return sacar == poner;
	}

	@Override
	public String primero() {
		
		return vector[sacar];
	}

}
