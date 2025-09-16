/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Model.Pengajuan;
import java.util.ArrayList;
import java.util.List;

public class Sistem {
    private List<Pengajuan> daftarPengajuan;

    public Sistem() {
        daftarPengajuan = new ArrayList<>();
        // Tambahkan data default
        daftarPengajuan.add(new Pengajuan("Banner KC", "linkBanner", "Yardan", "08123456789", "14 September 2025"));
        daftarPengajuan.add(new Pengajuan("Plakat GTA", "linkPlakat", "Faris", "08987654321", "17 September 2025"));
        daftarPengajuan.add(new Pengajuan("Poster Produk", "linkPoster", "Danial", "082233445566", "30 September 2025"));
    }

    public void tambahPengajuan(Pengajuan p) {
        daftarPengajuan.add(p);
    }

    public List<Pengajuan> getDaftarPengajuan() {
        return daftarPengajuan;
    }

    public boolean ubahPengajuan(int index, Pengajuan p) {
        if (index >= 0 && index < daftarPengajuan.size()) {
            daftarPengajuan.set(index, p);
            return true;
        }
        return false;
    }

    public boolean hapusPengajuan(int index) {
        if (index >= 0 && index < daftarPengajuan.size()) {
            daftarPengajuan.remove(index);
            return true;
        }
        return false;
    }

    // Search by jenisDesain atau nama
    public List<Pengajuan> cariPengajuan(String keyword) {
        List<Pengajuan> hasil = new ArrayList<>();
        for (Pengajuan p : daftarPengajuan) {
            if (p.jenisDesain.toLowerCase().contains(keyword.toLowerCase())
             || p.nama.toLowerCase().contains(keyword.toLowerCase())) {
                hasil.add(p);
            }
        }
        return hasil;
    }
}
