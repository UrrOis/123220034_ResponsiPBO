/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOImplement;

import java.util.List;
import model.*;
/**
 *
 * @author Lab Informatika
 */
public interface datapegawaiimplement {
    public void insert(pegawai pgwai);
    public void update(pegawai pgwai);
    public void delete(int id);
    public List<pegawai> getAll();
}
