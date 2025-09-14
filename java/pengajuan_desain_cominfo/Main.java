/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package pengajuan_desain_cominfo;

import Model.Pengajuan;
import Service.Sistem;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Sistem service = new Sistem();

        int pilihan = 0;
        while (pilihan != 6) {
            System.out.println("\n===== PENGAJUAN DESAIN COMINFO =====");
            System.out.println("1. Ajukan Desain");
            System.out.println("2. Lihat Daftar Desain");
            System.out.println("3. Ubah/Perbaiki Pengajuan");
            System.out.println("4. Hapus Pengajuan");
            System.out.println("5. Cari Pengajuan");
            System.out.println("6. Keluar");
            System.out.print("Pilih menu = ");
            pilihan = input.nextInt();
            input.nextLine();

            if (pilihan == 1) {
                System.out.println("\n===== MENGAJUKAN DESAIN =====");
                System.out.print("Jenis Desain: "); String jenis = input.nextLine();
                System.out.print("Link Referensi: "); String link = input.nextLine();
                System.out.print("Nama: "); String nama = input.nextLine();
                System.out.print("Kontak: "); String kontak = input.nextLine();
                System.out.print("Deadline (contoh: 9 Desember 2025): "); String deadline = input.nextLine();
                service.tambahPengajuan(new Pengajuan(jenis, link, nama, kontak, deadline));
                System.out.println("Desain berhasil diajukan!");

            } else if (pilihan == 2) {
                List<Pengajuan> daftar = service.getDaftarPengajuan();
                if (daftar.isEmpty()) System.out.println("Belum ada desain yang diajukan.");
                else {
                    System.out.println("\n===== DAFTAR PENGAJUAN DESAIN =====");
                    for (int i=0; i<daftar.size(); i++) {
                        Pengajuan p = daftar.get(i);
                        System.out.println("\nDesain " + (i+1));
                        System.out.println("Jenis Desain   : " + p.getJenisDesain());
                        System.out.println("Link Referensi : " + p.getLinkReferensi());
                        System.out.println("Nama           : " + p.getNama());
                        System.out.println("Kontak         : " + p.getKontak());
                        System.out.println("Deadline       : " + p.getDeadline());
                    }
                }

            } else if (pilihan == 3) {
                System.out.println("\n===== MENGUBAH PENGAJUAN DESAIN =====");
                System.out.print("Masukkan nomor pengajuan yang ingin diubah: ");
                int idxUbah = input.nextInt()-1; input.nextLine();
                if (idxUbah >= 0 && idxUbah < service.getDaftarPengajuan().size()) {
                    System.out.print("Jenis Desain: "); String jenis = input.nextLine();
                    System.out.print("Link Referensi: "); String link = input.nextLine();
                    System.out.print("Nama: "); String nama = input.nextLine();
                    System.out.print("Kontak: "); String kontak = input.nextLine();
                    System.out.print("Deadline (contoh: 9 Desember 2025): "); String deadline = input.nextLine();
                    service.ubahPengajuan(idxUbah, new Pengajuan(jenis, link, nama, kontak, deadline));
                    System.out.println("Pengajuan berhasil diubah!");
                } else {
                    System.out.println("Nomor tidak valid.");
                }

            } else if (pilihan == 4) {
                System.out.println("\n===== MENGHAPUS PENGAJUAN DESAIN =====");
                System.out.print("Masukkan nomor pengajuan yang ingin dihapus: ");
                int idxHapus = input.nextInt()-1; input.nextLine();
                if (service.hapusPengajuan(idxHapus)) System.out.println("Pengajuan berhasil dihapus!");
                else System.out.println("Nomor tidak valid.");

            } else if (pilihan == 5) {
                System.out.println("\n===== CARI PENGAJUAN DESAIN =====");
                System.out.print("Masukkan keyword pencarian (jenis/nama): ");
                String keyword = input.nextLine();
                List<Pengajuan> hasil = service.cariPengajuan(keyword);
                if (hasil.isEmpty()) System.out.println("Tidak ditemukan.");
                else {
                    for (Pengajuan p : hasil) {
                        System.out.println("\nJenis Desain   : " + p.getJenisDesain());
                        System.out.println("Nama           : " + p.getNama());
                        System.out.println("Link Referensi : " + p.getLinkReferensi());
                        System.out.println("Kontak         : " + p.getKontak());
                        System.out.println("Deadline       : " + p.getDeadline());
                    }
                }

            } else if (pilihan == 6) {
                System.out.println("Terima kasih sudah berkunjung!");

            } else {
                System.out.println("Pilihan tidak tersedia.");
            }
        }

        input.close();
    }
}

