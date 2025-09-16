/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

public class Pengajuan {
    // Properties dibuat public
    public String jenisDesain;
    public String linkReferensi;
    public String nama;
    public String kontak;
    public String deadline;

    // Constructor
    public Pengajuan(String jenisDesain, String linkReferensi, String nama, String kontak, String deadline) {
        this.jenisDesain = jenisDesain;
        this.linkReferensi = linkReferensi;
        this.nama = nama;
        this.kontak = kontak;
        this.deadline = deadline;
    }
}
