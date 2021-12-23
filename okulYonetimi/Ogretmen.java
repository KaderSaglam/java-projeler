package okulYonetimi;

public class Ogretmen extends Kisi{
private	String sicilNo;
	private String bolum;
	
	public Ogretmen() {
		
	}
	
	public Ogretmen(String sicilNo, String bolum, String adSoyad, String KimlikNo, int yas) {
		super(adSoyad, KimlikNo,yas);
		this.sicilNo = sicilNo;
		this.bolum = bolum;
	}
	
	public String getSicilNo() {
		return sicilNo;
	}
	
	public void setSicilNo(String sicilNo) {
		this.sicilNo = sicilNo;
		
	}
	
	public String getBolum() {
		return bolum;
	}
	
	public void setBolum(String bolum) {
		this.bolum = bolum;
	}

	 @Override
	    public String toString() {
	        return "Ogretmen{" +"ad soyad="+getAdSoyad()+",kimlik No :"+getKimlikNo()+", yas="+getYas()+
	                ", sicilNo='" + sicilNo + '\'' +
	                ", bolum='" + bolum + '\'' +
	                '}';
	    }

}
