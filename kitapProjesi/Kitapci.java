package kitapProjesi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kitapci {
	/*
	1.	Kullan�c�n�n Kitap ekleme, silme ve listeleme gibi
		i�lemleri yapmas�na imkan tan�yan bir uygulama yaz�n�z.

	2.	Program, kitaplara 1001�den ba�layarak s�ral� ve otomatik numara vermeli.
		Bunun yan�nda, her bir kitap i�in Kitap Ad�, 
		Yazar Ad�, Yay�n Y�l� ve Fiyat gibi bilgiler girilebilmelidir.

	3.	Program�n ba�lang�c�nda Kullan�c�ya a�a��daki gibi bir men� sunulmal�d�r.
		Kullan�c� program� bitirene kadar i�lemlere devam edebilmelidir.

		========= K�TAP PROGRAMI =============
			1: Kitap ekle
			2: Numara ile kitap sil
			3: T�m kitaplar� listele
			4: Bitir
 */
	static List <Kitap>kitapListe=new ArrayList();
	static Scanner scan=new Scanner(System.in);
	static int kitapNo=1000;
	public static void main(String[] args) {
		menu(kitapListe);
		
	}
	
		
		public static void menu(List<Kitap>Liste) {
		System.out.println("========= K�TAP PROGRAMI =============");
		System.out.println("1: Kitap ekle\r\n"
				+ "2: Numara ile kitap sil\r\n"
				+ "3: T�m kitaplar� listele\r\n"
				+ "4: Bitir");
		System.out.println("lutfen isleminizi seciniz");
		int tercih=scan.nextInt();
		switch(tercih) {
		case 1:
			kitapEkle(Liste);
			break;
		case 2:
			no�leSil(Liste);
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


		private static void no�leSil(List<Kitap> liste) {
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
			//biz kullanidan alip  kitap klas�ndaki constructora gonderdik. 
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
		//ben burda ekledigi kitabi g�stermek istiyorum. oy�zden to string kullandim.kitap
		//objesini to string kullanarak yazdir
		//privite oldugu icinde to string yaptim
		
		menu(liste);
		
			
		}
	
}
