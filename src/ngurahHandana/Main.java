package ngurahHandana;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ketinggianVila;
        int lamaMenginap;
        int pilihan;
        int pilihanOmbak;

        MountainVila vila1 = new MountainVila("Sugenx",100000,"jl.Bukit Tinggi", 10,0,0);
        BeachVila vila2 = new BeachVila("Tangsaka", 75000, "Jl.Pasir Jarot", 4, 0);

        System.out.println("=======================================");
        System.out.println("|*|       Halo Selamat Datang       |*|");
        System.out.println("=======================================");
        System.out.println("Masukkan pilihan penginapan");
        System.out.println("1. Penginapan Gunung");
        System.out.println("2. Penginapan Pantai");
        System.out.println("Masukkan pilihan penginapan");
        pilihan = scanner.nextInt();
        if(pilihan == 1) {
            System.out.println("=======================================");
            System.out.println("|*|          Informasi Vila         |*|");
            System.out.println("=======================================");
            System.out.println("Nama Vila : " + vila1.namaPenginapan);
            System.out.println("Harga Per Hari : " + vila1.hargaPerHari);
            System.out.println("Alamat : " + vila1.alamat);
            System.out.println("Jumlah Karyawan : " + vila1.jumlah_karyawan);
            vila1.objectUtama();
            System.out.println("=======================================");
            System.out.println("Masukkan Lama anda menginap");
            lamaMenginap = scanner.nextInt();
            vila1.setLamaMenginap(lamaMenginap);
            System.out.println("Masukkan Ketinggian yang Diinginkan ");
            ketinggianVila = scanner.nextInt();
            vila1.ketinggianVila = ketinggianVila;
            System.out.println("=======================================");
            System.out.println("|*|   Pemandangan yang didapatkan   |*|");
            System.out.println("=======================================");
            vila1.pemandangan();
            System.out.println("Total biaya yang harus di bayarkan : " + vila1.hargaMenginap());
        } else if(pilihan == 2) {
            System.out.println("=======================================");
            System.out.println("|*|          Informasi Vila         |*|");
            System.out.println("=======================================");
            System.out.println("Nama Vila : " + vila2.namaPenginapan);
            System.out.println("Harga Per Hari : " + vila2.hargaPerHari);
            System.out.println("Alamat : " + vila2.alamat);
            System.out.println("Jumlah Karyawan : " + vila2.jumlah_karyawan);
            vila2.objectUtama();
            System.out.println("=======================================");
            System.out.println("Masukkan Lama anda menginap");
            lamaMenginap = scanner.nextInt();
            vila2.setLamaMenginap(lamaMenginap);
            System.out.println("Pilih Jenis Ombak yang diinginkan (Default adalah tenang) ");
            System.out.println("1. Tenang");
            System.out.println("2. Tinggi");
            pilihanOmbak = scanner.nextInt();
            if(pilihanOmbak == 2) {
                vila2.ombakPantai = "Deras";
            } else {
                vila2.ombakPantai = "Tenang";
            }
            System.out.println("=======================================");
            System.out.println("|*|   Pemandangan yang didapatkan   |*|");
            System.out.println("=======================================");
            vila2.pemandangan();
            System.out.println("Total biaya yang harus di bayarkan : " + vila2.hargaMenginap());
        } else {
            System.out.println("Pilihan yang anda masukkan tidak ada");
        }
    }
}
