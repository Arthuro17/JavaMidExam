package application;

import data.*;
import java.util.Scanner;
public class Application {
    public static void main(String[] args) {
        String Nama, Prosesor, Os, Storage;
        int Stok, Core, Ram;
        
        Scanner masukan = new Scanner(System.in);
        
        Lenovo ideapad3 = new Lenovo();
        Xiaomi redmibook = new Xiaomi();
        
        /* Untuk test HP Pavilion 15 */
        ideapad3.lenovoSlogan();
        System.out.print("Nama : "); Nama = masukan.nextLine();
        System.out.print("Prosesor : "); Prosesor = masukan.nextLine();
        System.out.print("Jumlah Core : "); Core = masukan.nextInt();masukan.nextLine();
        System.out.print("Operating System : "); Os = masukan.nextLine();
        System.out.print("Ukuran RAM(GB): "); Ram = masukan.nextInt();masukan.nextLine();
        System.out.print("Jenis Storage : "); Storage = masukan.nextLine();
        System.out.print("Stok : "); Stok = masukan.nextInt();masukan.nextLine();
        System.out.println("");
        ideapad3.setNama(Nama);
        ideapad3.setProsesor(Prosesor);
        ideapad3.setCore(Core);
        ideapad3.setOs(Os);
        ideapad3.setRam(Ram);
        ideapad3.setStorage(Storage);
        ideapad3.setStok(Stok);
        ideapad3.getAllLaptopData();
        System.out.println("Store Position " + ideapad3.getNama() + 
                " adalah " + ideapad3.getStorePositionLaptop());
        System.out.println("==========================================");
                
        // ============================================================== //
        
        /* Untuk test Dell inspiron */
        redmibook.xiaomiSlogan();
        System.out.print("Nama : "); Nama = masukan.nextLine();
        System.out.print("Prosesor : "); Prosesor = masukan.nextLine();
        System.out.print("Jumlah Core : "); Core = masukan.nextInt();masukan.nextLine();
        System.out.print("Operating System : "); Os = masukan.nextLine();
        System.out.print("Ukuran RAM(GB): "); Ram = masukan.nextInt();masukan.nextLine();
        System.out.print("Jenis Storage : "); Storage = masukan.nextLine();
        System.out.print("Stok : "); Stok = masukan.nextInt();masukan.nextLine();
        System.out.println("");
        redmibook.setNama(Nama);
        redmibook.setProsesor(Prosesor);
        redmibook.setCore(Core);
        redmibook.setOs(Os);
        redmibook.setRam(Ram);
        redmibook.setStorage(Storage);
        redmibook.setStok(Stok);
        redmibook.getAllLaptopData();
        System.out.println("Store Position " + redmibook.getNama() + 
                " adalah " + redmibook.getStorePositionLaptop());
        System.out.println("==========================================");       
    }
}