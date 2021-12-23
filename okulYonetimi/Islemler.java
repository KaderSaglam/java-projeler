package okulYonetimi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Islemler {

//islemlere bir veri isleyecez o veriler list olcak 
	//bu listin data type Kisi den alacak adi ogrenci olsun bi tane de ogretmeb olsun 
	//yani ogretmenle ogrencileri liste atacam
	
static	List<Kisi> OgrenciList=new ArrayList();
	
	static List<Kisi> OgretmenList=new ArrayList();
	
	
static 	Scanner scan=new Scanner(System.in);
static String kisiTuru;

//simdi bir tane menu gosteriyoruz
public static void anaMenu() {
	System.out.println("====================================");
	System.out.println(" ÖÐRENCÝ VE ÖÐRETMEN YÖNETÝM PANELÝ");
	System.out.println("====================================");
	System.out.println(" 1- ÖÐRENCÝ ÝÞLEMLERÝ\r\n"
			+ "	 2- ÖÐRETMEN ÝÞLEMLERÝ\r\n"
			+ "	 Q- ÇIKIÞ\r\n"
			+ "");
	System.out.println("isleminizi seciniz");
	
	String secim=scan.next().toUpperCase();//string almamizin sebebi Q harfi de olmasidir
	switch (secim) {
	case "1":
		kisiTuru="OGRENCÝ";	 // Ben burda atama yaptim 1 i secerse ogrenci islerine gidecek
		islemMenusu();
		break;
	case "2":
		kisiTuru="OGRETMEN";	
		islemMenusu();// biz once kisiyi seciyoruz ogrenci isleri mi yapýyor ogretmen isleri mi diye ondan sonra isleme bakiyor
		break;
	case "Q":
		cikis();
		
	break;

	default:
		System.out.println("hatali giris yaptiniz");
		anaMenu();
		break;
		
	}
	
}

private static void cikis() {
System.out.println("programi kullandiginiz icin tesekkur ederiz");
	
}

private static void islemMenusu() {
	System.out.println("============= ÝÞLEMLER =============\r\n"
			+ "	1-EKLEME			 \r\n"
			+ "	2-ARAMA\r\n"
			+ "	3-LÝSTELEME\r\n"
			+ "	4-SÝLME\r\n"
			//+ " 5-ANA MENÜ\r\n" // buraya anamenü yapmak terine rekorsiv yaparim ben yani her methodun altina anamenu yazarim.
			//cýkýsý calis anamenuye git derim
			+ "	0-ÇIKIÞ\r\n"
			+ "");
	
	System.out.println("islem tercihinizi giriniz");
	String islemTercihi=scan.next().toUpperCase();
	switch (islemTercihi) {
	
case "0":
	
	anaMenu();//bunu yapinca islemden cýkacak  ana menuye goturcek beni
		break;
case "1":
     ekleme(); // yani ekleme yaptiktan sonra tekrar isleme soksun beni o yüzden alta islem menusu yazdým 
     islemMenusu();
	break;
case "2":
	arama();
	 islemMenusu();
	break;
case "3":
	listeleme();
	 islemMenusu();
	break;
case "4":
	silme();
	 islemMenusu();
	break;
default:
		System.out.println("hatali giris yaptiniz");
		 islemMenusu();// yanlis girerse islem menusune tekrar gonderiyor
		break;
	}
	
}



private static void silme() {
	System.out.println("*****   " + kisiTuru + " silme sayfasi   *****");
    boolean kontrol = true;

    if (kisiTuru.equalsIgnoreCase("OGRENCI")) {
        System.out.println("silinecek ogrc kimlik No giriniz :");
        scan.next();
        String silOgrcKimlk = scan.nextLine();
        for (Kisi k : OgrenciList) {
            if (k.getKimlikNo().contains(silOgrcKimlk)) {
                System.out.println("sildiginiz  ogrenci : " + k.getAdSoyad());
                OgrenciList.remove(k);
                kontrol = false;
                break;
            }
        }
        if (kontrol) {
            System.out.println("Aradýðýnýz öðrenci mevcut deðil");
        }
    } else {
        System.out.print("silinecek ogrt kimlik No giriniz :");
        scan.next();
        String silOgrtKimlk = scan.nextLine();
        for (Kisi k : OgretmenList) {
            if (k.getKimlikNo().contains(silOgrtKimlk)) {
                System.out.println("sildiginiz ogretmen : " + k.getAdSoyad());
                OgretmenList.remove(k);
                kontrol = false;
                break;
            }
        }
        if (kontrol) {
            System.out.println("Aradýðýnýz ogretmen mevcut deðil");
        }
    }
	
}

private static void listeleme() {
	  System.out.println("******   " + kisiTuru + " listeleme sayfasý  ******");
      if (kisiTuru.equalsIgnoreCase("ogrenci")) {
          for (Kisi k : OgrenciList) {
              System.out.println(k.toString());
          }
      } else {
          for (Kisi k : OgretmenList) {
              System.out.println(k.toString());
          }
      }
	
}

private static void arama() {
	 System.out.println("*****   " + kisiTuru + " arama sayfasi   *****");
     boolean kontrol = true;

     if (kisiTuru.equalsIgnoreCase("OGRENCI")) {
         System.out.print("aradiginiz ogrc kimlik No giriniz :");

         String araOgrcKimlk = scan.next();
          scan.next();
         for (Kisi k : OgrenciList) {
             if (k.getKimlikNo().equals(araOgrcKimlk)) {
                 System.out.println("aradiginiz ogrenci : " + k.getAdSoyad());
                 kontrol = false;
             }
         }
         if (kontrol) {
             System.out.println("Aradýðýnýz öðrenci mevcut deðil");
         }
     } else {
         System.out.print("aradiginiz ogrt kimlik No giriniz :");
         String araOgrtKimlk = scan.nextLine();
         scan.next();
         for (Kisi k : OgretmenList) {
             if (k.getKimlikNo().contains(araOgrtKimlk)) {
                 System.out.println("aradiginiz ogretmen : " + k.getAdSoyad());
                 kontrol = false;
             }
         }
         if (kontrol) {
             System.out.println("Aradýðýnýz ogretmen mevcut deðil");
         }
     }
	
}

private static void ekleme() {
	System.out.println("*****" +kisiTuru+"ekleme sayfasina hosgeldiniz");//bu kisi turundan ogrenci veya ogretmen gelecek
	System.out.println("ad soyad giriniz : ");
	String adSoyad=scan.nextLine();
	System.out.println("kimlikNo giriniz");
	String KimlikNo=scan.nextLine();
	System.out.println("yas griniz");
	int yas=scan.nextInt();
	if (kisiTuru.equalsIgnoreCase("ogrenci")) {
		System.out.println("ogrenci no giriniz");
		String numara=scan.next();
		System.out.println("sinif giriniz");
		String sinif=scan.next();
		// ben kullanicidan constructorun parametrelerini aldim.consrruCtor demek obje demek objeyi liste ekleyecem
		
	Ogrenci ogrenci=new Ogrenci(numara, sinif, adSoyad, KimlikNo, yas);
	//(String numara, String sinif, String adSoyad, String KimlikNo,int yas)
		//data typeleari aslesmesi gerekir
       OgrenciList.add(ogrenci);
       System.out.println(ogrenci.toString() + " eklendi");

	}else if(kisiTuru.equalsIgnoreCase("ogretmen")) {
		System.out.println("sicil no giriniz");
		String sicilNo=scan.next();
		System.out.println("bolum giriniz");
		String bolum=scan.next();
	Ogretmen ogretmen=new Ogretmen(sicilNo, bolum, adSoyad,KimlikNo, yas);
	//String sicilNo, String bolum, String adSoyad, String KimlikNo, int yas
	OgretmenList.add(ogretmen);
	 System.out.println(ogretmen.toString() + " eklendi");
    }else {
	System.out.println("yanlis girdiniz ");
}

//islemMenusu();==> bunu yazmasak olur cunku yazdik ustte
}

}