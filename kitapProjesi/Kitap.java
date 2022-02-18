package kitapProjesi;

public class Kitap {
	private int  no;
	private	String kitapAdi;
	private	String yazarAdi;
	private	int yayinYili;
	private	double fiyat;
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getKitapAdi() {
		return kitapAdi;
	}
	public void setKitapAdi(String kitapAdi) {
		this.kitapAdi = kitapAdi;
	}
	public String getYazarAdi() {
		return yazarAdi;
	}
	public void setYazarAdi(String yazarAdi) {
		this.yazarAdi = yazarAdi;
	}
	public int getYayinYili() {
		return yayinYili;
	}
	public void setYayinYili(int yayinYili) {
		this.yayinYili = yayinYili;
	}
	public double getFiyat() {
		return fiyat;
	}
	public void setFiyat(double fiyat) {
		this.fiyat = fiyat;
	}
	public Kitap(int no, String kitapAdi, String yazarAdi, int yayinYili, double fiyat) {
		
		this.no = no;
		this.kitapAdi = kitapAdi;
		this.yazarAdi = yazarAdi;
		this.yayinYili = yayinYili;
		this.fiyat = fiyat;
	}
	
public Kitap() {
	
}
@Override
public String toString() {//bu method objenin fildlarini yazdirir bu interfacedir
	return "Kitap [no=" + no 
			+ ", kitapAdi=" + kitapAdi 
			+ ", yazarAdi=" + yazarAdi 
			+ ", yayinYili=" + yayinYili
			+ ", fiyat=" + fiyat + "]";
	//objeyi direk yazdiramayiz referanslari yazdirriz.
	//objenin fieldlarini stringe cevirip yazdiriyor to string buna yariyor
	//bu kitapla alakali bi ozellik  oldugu icin bu classta yaptim
}


}
