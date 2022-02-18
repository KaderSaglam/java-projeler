package galeriOtomasyon;

public class LuxHonda extends Araba implements DisAraba, IcAraba {

	public LuxHonda(String model) {
		super(model);
		System.out.println("Honda lux \nModel : 2022");
	}

	public static void motor() {
		System.out.println("Motor hacmi : 3.2L ");
	}

	public void kapi() {
		System.out.println("Kapi : 5 ");
	}

	public void direksiyon() {
		System.out.println("Dreksiyon : otomatik");

	}

	public void koltuk() {

	}

	public void klima() {
		System.out.println("Klima : Elektronik");
	}

	@Override
	public void move() {
		System.out.println("Vites : 7");

	}

	@Override
	public void diesel() {
		// TODO Auto-generated method stub

	}

	@Override
	public void benzin() {
		System.out.println("Yakit turu benzindir");

	}

	public static void main(String[] args) {

		LuxHonda accord = new LuxHonda("HondaLux");
		accord.benzin();
		accord.direksiyon();
		accord.kapi();
		accord.klima();
		accord.move();
		accord.motor();

		System.out.println("Model Yeni  " + accord.old + "\nFiyat " + accord.price2);

	}

}