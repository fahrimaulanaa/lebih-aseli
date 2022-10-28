import java.util.Scanner;

class iyah{
    public static void keterangan(){
        System.out.println("Barang anda akan diproses");
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.print("--Masukkan Barang Anda--");
        System.out.println("\n");
        String kode_barang, nama_barang, kategori;
        int harga, jumlah;
        Scanner input = new Scanner(System.in);
        System.out.print("Kode Barang     :");
        kode_barang = input.next();
        System.out.print("Nama Barang     :");
        nama_barang = input.next();
        System.out.print("Harga Barang    :");
        harga = input.nextInt();
        System.out.print("Jumlah Barang   :");
        jumlah = input.nextInt();
        System.out.print("Kategori Barang :");
        kategori = input.next();
        System.out.println("------Barang Anda------");
        System.out.println("Kode Barang     :" + kode_barang);
        System.out.println("Nama Barang     :" + nama_barang);
        System.out.println("Harga Barang    :" + harga);
        System.out.println("Jumlah Barang   :" + jumlah);
        System.out.println("Kategori Barang :" + kategori);
        System.out.println("-----------------------");
        iyah.keterangan();

    }
}