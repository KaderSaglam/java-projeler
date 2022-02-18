package arac_Kiralama;

/*
String alinacakSehir;
String alinacakGun; (MM,dd--> ay gun formatında olmalı)
double alisSaati;
String teslimGunu;  (MM,dd--> ay gun formatında olmalı)
double teslimSaati;
​
​
musterinin ad, soyad, yas, telefon, id  ve kredi kartı bilgileri ile 
  arac tercihine ve islemine gore odemesini gerçekleştriniz..
 */
public class Musteri{
    String ad;
    String soyAd;
    String yas;
    String telefon;
    String id;
    String kartNo;
	String alinacakSehir;
	String alinacakGun;
	double alisSaati;
	String teslimGunu;
	double teslimSaati;
	public Musteri(){
		
	}
	
	public Musteri(String alinacakSehir, String alinacakGun, double alisSaati, String teslimGunu,
			double teslimSaati) {
            
		this.alinacakSehir = alinacakSehir;
		this.alinacakGun = alinacakGun;
		this.alisSaati = alisSaati;
		this.teslimGunu = teslimGunu;
		this.teslimSaati = teslimSaati;
	}
	public Musteri(String ad, String soyAd, String yas, String telefon, String id, String kartNo) {
		super();
		this.ad = ad;
		this.soyAd = soyAd;
		this.yas = yas;
		this.telefon = telefon;
		this.id = id;
		this.kartNo = kartNo;
	}
	@Override
	public String toString() {
		return "Musteri [ad=" + ad + ", soyAd=" + soyAd + ", yas=" + yas + ", telefon=" + telefon + ", id=" + id
				+ ", kartNo=" + kartNo + "]";
	}
}
