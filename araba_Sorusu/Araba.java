package araba_Sorusu;

public class Araba {
	
	/*1- fieldlar�(encapsulated) model(String), renk(String), motor(int), yil (int)
    olan Araba  isimli bir class cretae ediniz.
  2- b�t�n fieldlar� parametre alan bir constructor tan�mlay�n�z.
  3- ArabaMain isminde main i�in bir class olu�turunuz.
  4- �ki adet parametreli const 1 adet parametresiz cons ile 3 adet araba creat ediniz
  5- araclar�n motor g�c�n� 100 beygir ve �st� olmas� ve y�l�n� hatal� veri girisine karsi kontrol ediniz.

*/
private	String model;
	private String renk;
	private int motor;
	private int yil;
	
	
	public Araba() {
		
	}
	public Araba(String model, String renk, int motor, int yil) {
		super();
		this.model = model;
		this.renk = renk;
		//this.motor = motor;
		//this.yil = yil;
		setYil(yil);
		setMotor(motor);
		
	}
	public String getModel() {
		return model;
		
	}
	public void setModel(String model) {
		this.model = model;
		
	}
	public String getRenk() {
		
		return renk;
	}
	public void setRenk(String renk) {
		
		this.renk = renk;
	}
	public int getMotor() {
		
		return motor;
	}
	public void setMotor(int motor) {
	//	 5- araclar�n motor g�c�n� 100 beygir ve �st� olmas� ve y�l�n� hatal� veri girisine karsi kontrol ediniz.
		if (motor<100) {
			System.out.println("100 beygir alti arac olmaz");
		
		} else if(motor<0) {
			System.out.println("negatif deger  girdiniz");
		

		}else this.motor=motor;

		
		
	}
	public int getYil() {
		
		return yil;
	}
	public void setYil(int yil) {
		if (yil<0) {
			System.out.println("negatif deger girdiniz");
			
		} else if(yil>2021){
			System.out.println("girdiginiz yila gore araba �retilmemistir");

		}else this.yil = yil;
	}
		
		
	
	
	

}
