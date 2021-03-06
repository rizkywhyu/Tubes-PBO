/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sisfo.perpustakaan;

import database.database;
import java.sql.*;
import java.util.ArrayList;
import java.awt.*;

/**
 *
 * @author LENOVO
 */
public class Anggota extends Orang {

    private String nim;
    private String kelas;
    private String jurusan;
    private int thnMasuk;
    ArrayList<Peminjaman> daftarPeminjaman = new ArrayList<>();
    private int nPeminjaman;
    private Statement stat;
    private Connection conn;
    private ResultSet rs;

    public Anggota() {
        super();
    }

    public Anggota(String nama, String password, String jenisKelamin, String nim, String kelas, String jurusan, int thnMasuk) {
        super(nama, password, jenisKelamin);
        this.nim = nim;
        this.kelas = kelas;
        this.jurusan = jurusan;
        this.thnMasuk = thnMasuk;

    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public void setThnmasuk(int thnMasuk) {
        this.thnMasuk = thnMasuk;
    }

    public String getNim() {
        return nim;
    }

    public String getKelas() {
        return kelas;
    }

    public String getJurusan() {
        return jurusan;
    }

    public int getThnmasuk() {
        return thnMasuk;
    }

    public void addPeminjaman(Peminjaman pe) {
        daftarPeminjaman.add(pe);
//        daftarPeminjaman.size();
//        if (nPeminjaman<10){
//            peminjaman[nPeminjaman] = new Peminjaman(idPeminjaman, jum);
//            nPeminjaman++;
//        }else {
//            System.out.println("Hanya boleh meminjam maksimal 10 buku");
//        }
    }

    public Peminjaman getPeminjaman(long n) {
        for (Peminjaman peminjaman : daftarPeminjaman) {
            if (peminjaman.getIdPeminjaman() == n) {
                return peminjaman;
            }
        }
        return null;
    }

    public int getNPeminjaman() {
        return nPeminjaman;
    }

    public void displayPinjaman() {
        System.out.println("Nama Anggota: " + this.getNama());
        for (int i = 0; i < this.getNPeminjaman(); i++) {
            System.out.println("Peminjaman " + (i + 1) + ":");
            System.out.println("ID Peminjaman: " + this.getPeminjaman(i).getIdPeminjaman());
            for (int j = 0; j < this.getPeminjaman(i).getNBuku(); j++) {
                System.out.println("Buku " + (j + 1) + ": " + this.getPeminjaman(i).getBuku(j).getJudul());
            }
        }
    }

    @Override
    public String toString() {
        String info = "";
        info += "Nama: " + super.getNama() + "\n";
        info += "NIM: " + this.getNim() + "\n";
        info += "Jenis Kelamin: " + super.getJenisKelamin() + "\n";
        info += "Kelas: " + this.getKelas() + "\n";
        info += "Jurusan: " + this.getJurusan() + "\n";
        info += "Tahun Masuk : " + this.getThnmasuk() + "\n";
        return info; //To change body of generated methods, choose Tools | Templates.
    }

   
   
}
