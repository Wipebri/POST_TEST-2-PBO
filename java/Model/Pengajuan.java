/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

public class Pengajuan {
    // Properties
    private String jenisDesain;
    private String linkReferensi;
    private String Nama;
    private String Kontak;
    private String Deadline;

        public Pengajuan(String jenisDesain, String linkReferensi, String Nama, String Kontak, String Deadline) {
            this.jenisDesain = jenisDesain;
            this.linkReferensi = linkReferensi;
            this.Nama = Nama;
            this.Kontak = Kontak;
            this.Deadline = Deadline;
        }

    public String getJenisDesain() {
        return jenisDesain;
    }

    public void setJenisDesain(String jenisDesain) {
        this.jenisDesain = jenisDesain;
    }

    public String getLinkReferensi() {
        return linkReferensi;
    }

    public void setLinkReferensi(String linkReferensi) {
        this.linkReferensi = linkReferensi;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public String getKontak() {
        return Kontak;
    }

    public void setKontak(String Kontak) {
        this.Kontak = Kontak;
    }

    public String getDeadline() {
        return Deadline;
    }

    public void setDeadline(String Deadline) {
        this.Deadline = Deadline;
    }

    }


