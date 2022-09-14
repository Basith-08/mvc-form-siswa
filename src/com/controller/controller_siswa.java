/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.controller;

import com.view.form_siswa;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author basith
 */
public interface controller_siswa {
    public void Simpan(form_siswa siswa) throws SQLException;
    public void Ubah(form_siswa siswa) throws SQLException;
    public void Hapus(form_siswa siswa) throws SQLException;
    public void Tampil(form_siswa siswa) throws SQLException;
    public void Baru(form_siswa siswa) throws SQLException;
    public void KlikTabel(form_siswa siswa) throws SQLException;
}
