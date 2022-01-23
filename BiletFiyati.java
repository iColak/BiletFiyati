package kosulluIfadeler;
import java.util.Scanner;

public class BiletFiyati {
    public static void main(String[] args) {
        int mesafe, yas, yolculukTipi;
        double normalTutar, toplamTutar, indirim = 0;

        Scanner scanner = new Scanner (System.in);
        System.out.print("Mesafeyi km türünden giriniz: ");
        mesafe = scanner.nextInt();
        System.out.print("Yaşınızı giriniz: ");
        yas = scanner.nextInt();
        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön, 2 => Gidiş Dönüş): ");
        yolculukTipi = scanner.nextInt();

        normalTutar = mesafe * 0.10;
        if (!((yas >=0 && mesafe > 0) && (yolculukTipi == 1 || yolculukTipi == 2 )) ){
            System.out.println("Hatalı veri girdiniz");
        }else{
            if (yas < 12){
                indirim = normalTutar*0.50;
            }else if (yas < 25) {
                indirim = normalTutar*0.10;
            }else if (yas > 65) {
                indirim = normalTutar*0.30;
            }
            toplamTutar = normalTutar - indirim;

            if (yolculukTipi == 2) {
                indirim = toplamTutar * 0.20;
            }

            toplamTutar = toplamTutar - indirim;
            System.out.println(toplamTutar);
        }



    }
}
