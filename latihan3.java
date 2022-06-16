import java.util.Scanner;
public class latihan3 {
    public static void main (String [] args){

        latihan3 lt = new latihan3();
        Scanner input = new Scanner(System.in);
        System.out.println("\nHitung Persegi");
        System.out.println("-------------------");
        System.out.print("Masukkan sisi = ");
        int Sisi = input.nextInt();
        System.out.println("-------------------");
        int luas, keliling;
        luas = Sisi*Sisi;
        keliling = 4*Sisi;
        System.out.println("Hasil");
        System.out.println("Luas persegi : "+luas);
        System.out.println("Keliling persegi : "+keliling + "\n");
        System.out.println("-------------------");
        persegipanjang pg = lt.new persegipanjang();
        pg.luas_keliling();
        
        Lingkaran ring = lt.new Lingkaran();
        ring.luas_keliling_lingkaran();
        
    }
    
    class persegipanjang{
        Scanner input = new Scanner(System.in);
        
        int panjang, lebar, luas, keliling;
        
        void luas_keliling(){
            System.out.println("Hitung Persegi Panjang");
            System.out.print("\nMasukan Panjang : ");
            panjang = input.nextInt();
            System.out.print("Masukan Lebar   : ");
            lebar = input.nextInt();
            System.out.println("-------------------");
            
            System.out.println("Hasil");
            luas = panjang * lebar;
            System.out.println("Luas : "+luas);
        

            keliling = 2*(panjang + lebar);
            System.out.println("Keliling : "+keliling);
            System.out.println("-------------------");
        }
        
    }

    class Lingkaran{
        Scanner input = new Scanner(System.in);
        int jari2;
        double keliling, luas, phi = 3.14;
        void luas_keliling_lingkaran(){
            System.out.println("Hitung Lingkaran");
            System.out.print("Masukan Jari-Jari: ");
            jari2 = input.nextInt();

            System.out.println("Hasil");

            luas = phi *jari2;
            System.out.println("Luas : "+ luas);

            keliling = 2*phi*jari2;
            System.out.println("Keliling : "+keliling);
        }
    }
}