public class Automato {
	
	private Estado [] estado;
	private Elemento [] elemento;
	private String [] delta;
	private int qtdes;
	
	
	
	public Automato(){
	}
	
	public void setelementos(String exElementos){
		int i;
		
		this.elemento = new Elemento[1 + exElementos.length()/2];
		
		for(i=0; i< elemento.length; i++){
			this.elemento[i] = new Elemento(exElementos.charAt(2*i));
		}
	}

	public void setestado(int qtdEstado){
		int i;
		this.qtdes = qtdEstado;
		for(i = 0; i < qtdEstado; i++){
		 	this.estado[i] = new Estado(i);
		}
	}

	public void setestadoIni(String id)throws AutomatoException {
		if(id.length() > 1){
			throw new AutomatoException("Erro, mais de um estado inicial");
		}
		if(id.charAt(0) > this.qtdes){
			throw new AutomatoException("Erro, estado inválido");
		}
		this.estado[id.charAt(0) -'0'].setTipo('i');
	}

	public void setestadoFinal(String id){
		int i, index;
		
		for (i = 0; i< id.length(); i++){
			index = id.charAt(i*2) - '0';
			this.estado[index].setTipo('f'); // transforma o estado em FINAL
		}
	}
}
