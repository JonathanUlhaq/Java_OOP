import java.util.Scanner;
public class mainSegitiga{
    public static void main(String[]args){

        Scanner inputan = new Scanner(System.in);    
         
        //Scanner
        SegitigaSiku siku = new SegitigaSiku(4,2) ;

        System.out.println("System Penghitung Alas dan Keliling Segitiga Siku - Siku ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        //Alas
        System.out.print("Alas Segitiga Sama Kaki :");
        siku.setAlas(inputan.nextDouble());

         //Tinggi
         System.out.print("Tinggi Segitiga Sama Kaki :");
         siku.setTinggi(inputan.nextDouble());
        
        //Sisi Miring
        System.out.println("Sisi Miring Segitiga Sama Kaki : "+ siku.getSimir());
        
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");


        //hasil
        System.out.println("Luas Segitiga ="+siku.getLuas());
        System.out.println("Keliling Segitiga  ="+siku.getKeliling());
    }
}