/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import sisfo.perpustakaan.Aplikasi;
import view.DaftarPeminjam;

/**
 *
 * @author LENOVO
 */
public class ControllerDaftarPeminjaman implements ActionListener {
    private Aplikasi model;
    private DaftarPeminjam view;

    public ControllerDaftarPeminjaman(Aplikasi model) {
        this.model = model;
        view = new DaftarPeminjam();
        view.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
}
