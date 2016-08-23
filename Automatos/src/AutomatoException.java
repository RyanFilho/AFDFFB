
public class AutomatoException extends Exception {
	public String mensagem;
	
	public AutomatoException(String mensagem){
		this.mensagem = mensagem;
	}

	public String getMensagem() {
		return mensagem;
	}
}
