package hastane_otomasyonu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class Methodlar extends VeriBankasi {
    static int hastaNo = 0;
    static Scanner scanner = new Scanner(System.in);
    static VeriBankasi doktor1 = new VeriBankasi("Hasan", "Kocaman", "Allergist");
    static VeriBankasi doktor2 = new VeriBankasi("Mustafa", "Donat", "Norolog");
    static VeriBankasi doktor3 = new VeriBankasi("Fatih", "YÄ±ldÄ±z", "Genel cerrah");
    static VeriBankasi doktor4 = new VeriBankasi("YÄ±ldÄ±z", "Aydogan", "Cocuk doktoru");
    static VeriBankasi doktor5 = new VeriBankasi("Emine", "Ceyran", "Dahiliye");
    static VeriBankasi doktor6 = new VeriBankasi("Kader", "SaÄŸlam", "Kardiolog");
    static List<VeriBankasi> doktorList = new ArrayList<>(
            Arrays.asList(doktor1, doktor2, doktor3, doktor4, doktor5, doktor6));
    static List<String> durumlar = new ArrayList<String>(
            Arrays.asList("Allerji", "Bas agrisi", "Diabet", "Sogukalginligi", "Migren", "Kalphastaliklari"));
    static List<Hasta> hastaList = new ArrayList<Hasta>();

    public static void menu() {

        System.out.println("====HASTANE OTOMASYONU====\n" +
                "1-HASTA GIRISI\n" +
                "2-HASTA LÄ°STESÄ°\n" +
                "3-Ã‡IKIÅ�");
        int secim = scanner.nextInt();
        switch (secim) {
            case 1:
                hastaGirisi();
                menu();
                break;
            case 2:
                hastaListesi(hastaList);
                menu();;
                break;
            case 3:
                cikis();
                break;
            default:
        }
    }

    private static void hastaListele() {

    }

    private static void cikis() {

        System.out.println("Ä°ÅŸlemleriniz yapÄ±ldÄ±!!!");
    }

    private static void hastaGirisi() {
        System.out.println("HastanÄ±n adÄ±nÄ± giriniz : ");
        String hastaAdi = scanner.next();
        scanner.nextLine();
        System.out.println("HastanÄ±n soyadÄ±nÄ± giriniz : ");
        String hastaSadi = scanner.nextLine();
        System.out.println("Hasta durumunu seÃ§iniz : ");
        hastaDurumu(durumlar);
        int durum = scanner.nextInt() - 1;
        String hastaDurumu = durumlar.get(durum);
        System.out.println("Aciliyet durumunu belirtiniz : \n1-Acil\n2-Acil DeÄŸil");
        boolean aciliyet = false;
        int aciliyetSecim = scanner.nextInt();
        switch (aciliyetSecim) {
            case 1:
                aciliyet = true;
                break;
            case 2:
                aciliyet = false;
                break;
        }
        Hasta hasta = new Hasta(++hastaNo, hastaAdi, hastaSadi, hastaDurumu, aciliyet);
        System.out.println(hasta);
        hastaList.add(hasta);
        //doktorAta(hastaDurumu, doktorList, hasta);
        System.out.println(hastaAdi+" "+hastaSadi+" doktoru : "+doktorAta2(hastaDurumu, doktorList, hastaAdi, hastaSadi));

    }

    private static List<Object> doktorAta2(String hastaDurumu, List<VeriBankasi> doktorList, String hastaAdi, String hastaSadi) {
        List<Object> secilenDoktor=new ArrayList<>();
        if (hastaDurumu.contains("Allerji")) {
            secilenDoktor= doktorList.stream().filter(t -> t.getDoktorUnvan().equals("Allergist")).collect(Collectors.toList());
        }else if (hastaDurumu.contains("Bas agrisi")){
            secilenDoktor=doktorList.stream().filter(t -> t.getDoktorUnvan().equals("Norolog")).collect(Collectors.toList());
        }else if (hastaDurumu.contains("Diabet")){
            secilenDoktor=doktorList.stream().filter(t -> t.getDoktorUnvan().equals("Genel cerrah")).collect(Collectors.toList());
        }else if (hastaDurumu.contains("Sogukalginligi")){
            secilenDoktor=doktorList.stream().filter(t -> t.getDoktorUnvan().equals("Cocuk doktoru")).collect(Collectors.toList());
        }else if (hastaDurumu.contains("Migren")){
            secilenDoktor=doktorList.stream().filter(t -> t.getDoktorUnvan().equals("Dahiliye")).collect(Collectors.toList());
        }else if (hastaDurumu.contains("Kalphastaliklari")){
            secilenDoktor=doktorList.stream().filter(t -> t.getDoktorUnvan().equals("Kardiolog")).collect(Collectors.toList());
        }
        return secilenDoktor;
    }

    /*
        public static void doktorAta(String hastaDurumu, List<VeriBankasi> doktorList, Hasta hasta) {
            if (hastaDurumu.contains("Allerji")) {
                System.out.println(hasta.getHastaAdi() + " " + hasta.getHastaSadi() + " doktoru : " + doktorList.stream()
                        .filter(t -> t.getDoktorUnvan().equals("Allergist")).collect(Collectors.toList()));
            } else if (hastaDurumu.contains("Bas agrisi")) {
                System.out.println(hasta.getHastaAdi() + " " + hasta.getHastaSadi() + " doktoru : " + doktorList.stream()
                        .filter(t -> t.getDoktorUnvan().equals("Norolog")).collect(Collectors.toList()));
            } else if (hastaDurumu.contains("Diabet")) {
                System.out.println(hasta.getHastaAdi() + " " + hasta.getHastaSadi() + " doktoru : " + doktorList.stream()
                        .filter(t -> t.getDoktorUnvan().equals("Genel cerrah")).collect(Collectors.toList()));
            } else if (hastaDurumu.contains("Sogukalginligi")) {
                System.out.println(hasta.getHastaAdi() + " " + hasta.getHastaSadi() + " doktoru : " + doktorList.stream()
                        .filter(t -> t.getDoktorUnvan().equals("Cocuk doktoru")).collect(Collectors.toList()));
            } else if (hastaDurumu.contains("Migren")) {
                System.out.println(hasta.getHastaAdi() + " " + hasta.getHastaSadi() + " doktoru : " + doktorList.stream()
                        .filter(t -> t.getDoktorUnvan().equals("Dahiliye")).collect(Collectors.toList()));
            } else if (hastaDurumu.contains("Kalphastaliklari")) {
                System.out.println(hasta.getHastaAdi() + " " + hasta.getHastaSadi() + " doktoru : " + doktorList.stream()
                        .filter(t -> t.getDoktorUnvan().equals("Kardiolog")).collect(Collectors.toList()));
            }

        }
    */
    public static void hastaDurumu(List<String> durumlar) {
        AtomicInteger i = new AtomicInteger();
        durumlar.stream().forEach(t -> System.out.println(i.incrementAndGet() + "-" + t));

    }
    public static void hastaListesi(List<Hasta> hastaList) {
        hastaList.
                stream().forEach(t -> System.out.println(t+"\n"+t.getHastaAdi()+" "+t.getHastaSadi()+" doktoru : "
                        +doktorAta2(t.getHastaDurumu(),doktorList,t.getHastaAdi(),t.getHastaSadi())));
    }
}
