package modelagem;

public class Idade {
	private int a;
	private int b;
	private int c;
	
	public Idade(int anos, int meses, int dias) {
		this.a = anos;
		this.b = meses;
		this.c = dias;
	}
	
	public String idade() {
		return "Sua idade em dias é: " + (this.a*365)+(this.b*30)+(this.c);
	}
}
