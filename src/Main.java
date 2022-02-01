import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        String mainMenu=
                        "İşlem Numaraları : \n" +
                        "Toplama -> 1 \n" +
                        "Çıkarma -> 2 \n" +
                        "Çarpma -> 3 \n" +
                        "Bölme -> 4 \n" +
                        "Üs Hesaplama -> 5 \n" +
                        "Faktöriyel -> 6 \n" +
                        "Mod Alma -> 7 \n" +
                        "Dikdörtgen Alan Ve Çevre Hesabı -> 8 \n" +
                        "Programdan Çıkış -> 0";
        int vote;
        do {
            System.out.println(mainMenu);
            System.out.print("Yapılacak işlem numarasını yazınız : ");
             vote = scanner.nextInt();
            switch (vote) {
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divided();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    mod();
                    break;
                case 8:
                    rectangular();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Geçersiz değer girildi.");
            }
        } while (vote!=0);
        System.out.println("Çıkış yapıldı.");
    }
    static void plus(){
        System.out.println("Toplama İşlemi.");
        Scanner scanner=new Scanner(System.in);
        System.out.print("Birinci sayıyı giriniz :");
        int a=scanner.nextInt();
        System.out.print("İkinci sayıyı giriniz :");
        int b=scanner.nextInt();
        System.out.println("İşlem sonucu : " +(a+b));
    }
    static void minus(){
        System.out.println("Çıkarma İşlemi.");
        Scanner scanner=new Scanner(System.in);
        System.out.print("Birinci sayıyı giriniz :");
        int a=scanner.nextInt();
        System.out.print("İkinci sayıyı giriniz :");
        int b=scanner.nextInt();
        System.out.println("İşlem sonucu : " +(a-b));
    }
    static void times(){
        System.out.println("Çarpma İşlemi.");
        Scanner scanner=new Scanner(System.in);
        System.out.print("Birinci sayıyı giriniz :");
        int a=scanner.nextInt();
        System.out.print("İkinci sayıyı giriniz :");
        int b=scanner.nextInt();
        System.out.println("İşlem sonucu : " +(a*b));
    }
    static void divided(){
        System.out.println("Bölme İşlemi.");
        Scanner scanner=new Scanner(System.in);
        System.out.print("Birinci sayıyı giriniz :");
        int a=scanner.nextInt();
        System.out.print("İkinci sayıyı giriniz :");
        int b=scanner.nextInt();
        float result=(float)a/b;
        System.out.println("İşlem sonucu : " +new DecimalFormat("##.###").format(result));
    }
    static void power(){
        System.out.println("Üs Alma İşlemi.");
        Scanner scanner=new Scanner(System.in);
        System.out.print("Alt tabanı giriniz :");
        int a=scanner.nextInt();
        System.out.print("Üst tabanı giriniz :");
        int b=scanner.nextInt();
        int result=1;
        for(int i=1;i<=b;i++){
            result*=a;
        }
        System.out.println("İşlem sonucu : " +result);
    }
    static void factorial(){
        System.out.println("Faktöriyel Hesaplama.");
        Scanner scanner= new Scanner(System.in);
        System.out.print("Faktöriyeli hesaplanacak sayıyı giriniz : ");
        int a=scanner.nextInt();
        int result=1;
        for(int i =1;i<=a;i++){
            result*=i;
        }
        System.out.println("Faktöriyel sonucu :"+result);
    }
    static void mod(){
        System.out.println("Mod Alma İşlemi.");
        Scanner scanner= new Scanner(System.in);
        System.out.print("Modu alınacak sayı : ");
        int a=scanner.nextInt();
        System.out.print("Mod değeri : ");
        int b=scanner.nextInt();
        System.out.println("Sonuç :"+(a%b));
    }
    static void rectangular(){
        System.out.println("Dikdörtgen Alan Ve Çevre Hesabı.");
        Scanner scanner= new Scanner(System.in);
        System.out.print("Uzun kenarı giriniz :");
        int a=scanner.nextInt();
        System.out.print("Kısa kenarı giriniz :");
        int b=scanner.nextInt();
        int alan=a*b;
        int cevre=2*(a+b);
        System.out.println("Dikdörtgenin alanı : "+alan+" çevresi : "+cevre);
    }
}
