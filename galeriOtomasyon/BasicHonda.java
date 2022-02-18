package galeriOtomasyon;

public class BasicHonda extends Araba implements DisAraba {
	public BasicHonda(String model) {
		super(model);
	}

	public static void motor() {

	}

	public void kapi() {

		System.out.println("kapi : 3 /Sofor+yolcu+Bagaj");
	}

	public void direksiyon() {
System.out.println("Basic (Giris seviye) hondalarda direksiyon manueldir");
	}

	public void koltuk() {

	}

	public void klima() {
		System.out.println("Basic (Giris seviye) hondalarda klima bulunmamaktadir");
	}

	@Override
	public void move() {
System.out.println("5 Vites");

	}

	

	public static void main(String[] args) {

		BasicHonda jazz = new BasicHonda("basicHonda");
		jazz.benzin();
		jazz.direksiyon();
		jazz.kapi();
		jazz.klima();
		jazz.move();
       System.out.println("Model Yeni  "+ jazz.old+"\nFiyat "+ jazz.price);
    
	}
	
	

}