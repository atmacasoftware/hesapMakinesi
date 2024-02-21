import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Değişkenlerin tanımlanması
        int sayi1, sayi2, select;
        String errorSonuc;
        double sonuc;

        //Scanner sınıfının import edilmesi
        Scanner input = new Scanner(System.in);

        //Kullanıcıdan sayıların alınması
        System.out.print("Birinci Sayıyı Giriniz : ");
        sayi1 = input.nextInt();

        System.out.print("İkinci Sayıyı Giriniz : ");
        sayi2 = input.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        select = input.nextInt();

        //Switch Döngüsü
        switch (select){
            case 1:
                sonuc = sayi1 + sayi2;
                System.out.println("Toplama İşlem Sonucu : " + sonuc);
                break;
            case 2:
                sonuc = sayi1 - sayi2;
                System.out.println("Çıkarma İşlem Sonucu : " + sonuc);
                break;
            case 3:
                sonuc = sayi1 * sayi2;
                System.out.println("Çarpma İşlem Sonucu : " + sonuc);
                break;
            case 4:
                //BÖlme işleminde 0 kontrolü
                if(sayi2 == 0){
                    errorSonuc = "Math Error";
                    System.out.println(errorSonuc);
                }else{
                    sonuc = sayi1 / sayi2;
                    System.out.println("Bölme İşlem Sonucu : " + sonuc);
                }
                break;
            default:
                System.out.println("Hatalı seçim yaptınız.");
        }

    }
}