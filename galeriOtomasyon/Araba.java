package galeriOtomasyon;

public abstract class Araba {

	
	public String model;
	public Araba(String model) {
		this.model=model;
		System.out.println("Honda1 "+ model + " Model araba olusturuldu. Olusan arabanin ozellikleri \n");
	}
	public abstract void move();
	public   void diesel() {
		System.out.println("Yakit olarak Diesel  kullanir");
	};
	public   void benzin() {
		System.out.println("Yakit olarak benzin kullanir");
	};
	
	
	
	
	
}
