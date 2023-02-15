package ac;

public class UseAc {
	public static void main(String[] args) {
		Inverter i = new Inverter("Exide",20000);
		Ac a = new Ac("Chroma",35000,i);
		System.out.println(a);
	}

}
