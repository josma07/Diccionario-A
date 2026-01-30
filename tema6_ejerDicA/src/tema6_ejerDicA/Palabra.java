package tema6_ejerDicA;

public class Palabra {
	static int cont=0;
	String termino;
	String definicion;
	
	Palabra(){
		
	}
	Palabra(String termino, String definicion) {
		super();
		this.termino = termino;
		this.definicion = definicion;
		cont++;
	}
	public String getTermino() {
		return termino;
	}
	public String getDefinicion() {
		return definicion;
	}
	public void setTermino(String termino) {
		this.termino = termino;
	}
	public void setDefinicion(String definicion) {
		this.definicion = definicion;
	}
	public static int getCont() {
		return cont;
	}
	public static void setCont(int cont) {
		Palabra.cont = cont;
	}
	
	

}
