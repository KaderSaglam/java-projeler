package araba_Sorusu;

public class ArabaMain {

	public static void main(String[] args) {
		/* 3- ArabaMain isminde main i�in bir class olu�turunuz.
        4- �ki adet parametreli const 1 adet parametresiz cons ile 3 adet araba creat ediniz
        5- araclar�n motor g�c�n� 100 beygir ve �st� olmas� ve y�l�n� hatal� veri girisine karsi kontrol ediniz.

*/
		
		
Araba honda =new Araba();//paremetresiz




Araba volvo =new Araba("wdagg", "beyaz", 500,2020);

//String model, String renk, int motor, int yil

Araba toyota = new Araba("afgdgg" , "kirmizi", 2000, 800);
System.out.println(toyota.getModel());
System.out.println(honda.getModel());
System.out.println(honda.getRenk());
}
	}


