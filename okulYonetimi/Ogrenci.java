package okulYonetimi;

public class Ogrenci extends Kisi{
	//bir ogrencinin kimlik numarasi yasi ve tcsi de oldugu icin 
	//onlari atasý olan parent classtan alacak o yuzden extends iliskisi kuruyorum
	
	
	//buradan ogrenci uretmem gerek bundan dolayi constructor kuruyorum
	
	
	
	public Ogrenci() {
		
	}

public Ogrenci(String numara, String sinif, String adSoyad, String KimlikNo,int yas) {
		super(adSoyad, KimlikNo,yas);// neden bunu ben yazdim da hocada cikti
		//numara ve sinif this ten yani bu classtan geliyor ama ad soyad yas tc kisiden geliyor superden
		this.numara = numara;
		this.sinif = sinif;
		
	}
private String numara;
private String sinif;
//private demek getter setter demek
public String getNumara() {
	return numara;
}
public void setNumara(String numara) {
	this.numara = numara;
}
public String getSinif() {
	return sinif;
}
public void setSinif(String sinif) {
	this.sinif = sinif;
}



}
