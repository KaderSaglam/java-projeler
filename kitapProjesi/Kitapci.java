package kitapProjesi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kitapci {
	/*
	1.	Kullanýcýnýn Kitap ekleme, silme ve listeleme gibi
		iþlemleri yapmasýna imkan tanýyan bir uygulama yazýnýz.

	2.	Program, kitaplara 1001’den baþlayarak sýralý ve otomatik numara vermeli.
		Bunun yanýnda, her bir kitap için Kitap Adý, 
		Yazar Adý, Yayýn Yýlý ve Fiyat gibi bilgiler girilebilmelidir.

	3.	Programýn baþlangýcýnda Kullanýcýya aþaðýdaki gibi bir menü sunulmalýdýr.
		Kullanýcý programý bitirene kadar iþlemlere devam edebilmelidir.

		========= KÝTAP PROGRAMI =============
			1: Kitap ekle
			2: Numara ile kitap sil
			3: Tüm kitaplarý listele
			4: Bitir
 */
	static List <Kitap>kitapListe=new ArrayList();
	static Scanner scan=new Scanner(System.in);
	static int kitapNo=1000;
	public static void main(String[] args) {
		menu(kitapListe);
		
	}
	
		
		public static void menu(List<Kitap>Liste) {
		System.out.println("========= KÝTAP PROGRAMI =============");
		System.out.println("1: Kitap ekle\r\n"
				+ "2: Numara ile kitap sil\r\n"
				+ "3: Tüm kitaplarý listele\r\n"
				+ "4: Bitir");
		System.out.println("lutfen isleminizi seciniz");
		int tercih=scan.nextInt();
		switch(tercih) {
		case 1:
			kitapEkle(Liste);
			break;
		case 2:
			noÝleSil(Liste);
			break;
		case 3:
			listele(Liste);
			break;
		case 4:
			bitir();
			break;
	   default:
			System.out.println("yanlis giris yaptiniz");
			break;
		}
		
	}


		private static void listele(List<Kitap> liste) {
		for (Kitap k : liste) {
			System.out.println(k.toString());
			menu(liste);	
		}
			
		}


		private static void noÝleSil(List<Kitap> liste) {
		System.out.println("silinecek kitap no giriniz : ");
		int silinecekNo=scan.nextInt();
		
		for (Kitap k : liste) {//k kitap clasinin objesi
			if (k.getNo()==silinecekNo) {
				liste.remove(k);
				menu(liste);
				
			}
		}
		System.out.println(silinecekNo+ "ait kitap bulunamadi !!!");
		menu(liste);
		}


		private static void bitir() {
			System.out.println("yine bekleriz");
			
		}


		private static void kitapEkle(List<Kitap> liste) {
			//biz kullanidan alip  kitap klasýndaki constructora gonderdik. 
			//constructordan da kitap diye bir obje yaparak cagiriyoruz
		System.out.println("eklyeceginiz kitabin ismini giriniz");
		scan.nextLine();// dummy
		String kitapAdi=scan.next();
		//scan.nextLine();// dummy
		System.out.println("lutfen yazarin adini  giriniz");
		
		String yazarAdi=scan.next();
	
		System.out.println("yayin yilini giriniz");
		int yayinYili=scan.nextInt();
		System.out.println("fiyatini giriniz");
		double fiyat=scan.nextInt();
		
		Kitap kitap =new Kitap(++kitapNo, kitapAdi, yazarAdi, yayinYili,fiyat);//kitap objesi create edilidi
		
		
		liste.add(kitap);
		System.out.println(kitap+"eklendi");
		//ben burda ekledigi kitabi göstermek istiyorum. oyüzden to string kullandim.kitap
		//objesini to string kullanarak yazdir
		//privite oldugu icinde to string yaptim
		
		menu(liste);
		
			
		}
	
}
