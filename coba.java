import java.util.Scanner;
public class coba {
    public static void main(String args[]){
        System.out.print("\n----------------------------------");
        System.out.println("\nApp Hitung Bangun Datar\n");
        int pilihan = 0;
        Scanner scan = new Scanner(System.in);

        // mengambil input
        System.out.println("Persegi             : 1");
        System.out.println("Persegi Panjang     : 2");
        System.out.println("Lingkaran           : 3");
        System.out.print("\nSilakan masukan angka : ");
        pilihan = scan.nextInt();

        

        if (pilihan == 1){
            System.out.println("\nHitung Persegi");
            Scanner input = new Scanner(System.in);
            System.out.print("Masukan sisi = ");
            int Sisi = input.nextInt();
            int luas, keliling;
            luas = Sisi*Sisi;
            keliling = 4*Sisi;
            System.out.println("\nHasil");
            System.out.println("Luas persegi : "+luas);
            System.out.println("Keliling persegi : "+keliling + "\n");
        }

        else if (pilihan == 2){

            Scanner input = new Scanner(System.in);
            int panjang, lebar, luas, keliling;

            System.out.println("\nHitung Persegi Panjang");
            System.out.print("Masukan Panjang   : ");
            panjang = input.nextInt();
            System.out.print("Masukan Lebar     : ");
            lebar = input.nextInt();
            
            System.out.println("\nHasil");
            luas = panjang * lebar;
            System.out.println("Luas : "+luas);
        

            keliling = 2*(panjang + lebar);
            System.out.println("Keliling : "+keliling);
        }

        else if (pilihan == 3){

        }

        else {
            System.out.print("Maaf input anda salah.");
        }
  
      }
}
