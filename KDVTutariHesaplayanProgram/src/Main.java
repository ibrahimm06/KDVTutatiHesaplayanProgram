import javax.sound.midi.Soundbank;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //KDV tutari hesaplayan program:
        //KDV Tutarı:18% olarak alınacak
        //KDV'siz fiyat=10;
        //KDV 'Lİ Fiyat=11.8;
        //KDV tutarı=1.8;

        double  tutar , kdvTutar, kdvliTutar, kdvOran=0.18;

        Scanner input= new Scanner(System.in);
        System.out.println("Ürünün Fiyatını Giriniz: " );
        tutar= input.nextDouble();
        kdvTutar = tutar * kdvOran;
        kdvliTutar = tutar + kdvTutar ;

        System.out.println("ürünün KDV'siz tutarı :"   +tutar );
        System.out.println("KDV Oranı : "              + kdvOran);
        System.out.println("KDV tuarı :"               + kdvTutar);
        System.out.println("KDV 'li  Tutarı :"         + kdvliTutar );




        }


    }
