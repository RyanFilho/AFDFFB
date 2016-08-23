
public class Estado {
	private int Id;
	private char tipo;
	
	
	public Estado(int Id){
		this.Id = Id;
	}
	
	
	public int getId() {
		return Id;
	}
	public char getTipo() {
		return tipo;
	}
	public void setTipo(char tipo){
		this.tipo = tipo;
	}
}
