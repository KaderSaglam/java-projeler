package okulYonetimi;

public class Kisi {
	
private	String adSoyad;
	private String kimlikNo;
	private int yas;
	//bu clasý obje yapmak icin olusturuyorum  o yuzden constructor lazim 
	
	
	
	public Kisi() {
		
	}
	
	
	public Kisi(String adSoyad, String kimlikNo, int yas) {
		  setAdSoyad(adSoyad);
	        this.kimlikNo = kimlikNo;
	        setYas(yas);
	}
	
	public String getAdSoyad() {
		return adSoyad;
	}
	public void setAdSoyad(String adSoyad) {
		this.adSoyad = adSoyad.toUpperCase();
	}
	public String getKimlikNo() {
		return kimlikNo;
	}
	public void setKimlikNo(String kimlikNo) {
		this.kimlikNo = kimlikNo;
	}
	public int getYas() {
		  if (yas <0) {
	            this.yas=-yas;
	        }
	        else
	        this.yas = yas;
		return yas;
	}
	public void setYas(int yas) {
		this.yas = yas;
	}
	 @Override
	    public String toString() {
	        return "Kisi{" +
	                "adSoyad='" + adSoyad + '\'' +
	                ", kimlikNo='" + kimlikNo + '\'' +
	                ", yas=" + yas +
	                '}';
	    }
}
