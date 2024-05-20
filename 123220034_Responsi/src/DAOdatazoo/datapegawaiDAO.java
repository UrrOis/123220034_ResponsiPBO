/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOdatazoo;
import java.sql.*;
import java.util.*;
import koneksi.connector;
import model.*;
import DAOImplement.datapegawaiimplement;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Lab Informatika
 */
public class datapegawaiDAO implements datapegawaiimplement{
       Connection connection;
   
   final String select = "SELECT * FROM hewan";
   final String insert = "INSERT INTO hewan (nama, kelas, jenis_makanan) VALUES (?, ?, ?);";
   final String update = "UPDATE hewan SET nama=?, kelas=?, jenis_makanan=? WHERE id=?;";
   final String delete = "DELETE FROM hewan WHERE id=?";

    @Override
    public void insert(pegawai pgwai) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(pegawai pgwai) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<pegawai> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
}
