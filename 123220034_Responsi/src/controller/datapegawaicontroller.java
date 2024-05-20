/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAOImplement.datapegawaiimplement;
import DAOdatazoo.datapegawaiDAO;
import java.util.List;
import model.hewan;
import model.pegawai;
import view.MainView;

/**
 *
 * @author Lab Informatika
 */
public class datapegawaicontroller {
    MainView frame;
    datapegawaiimplement impldatapegawai;
    List<pegawai> pgwai;
    
    public datapegawaicontroller(MainView Frame){
        this.frame = frame;
        impldatapegawai = new datapegawaiDAO();
        pgwai = impldatapegawai.getAll();
}
        public void isitabel(){
        hw = impldatapegawai.getAll();
        modeltabeldatapegawai mp = new modeltabeldatapegawai(pgwai);
        frame.getTabelDatapegawai().setModel(mp);
    }
        public void insert(){
        datapegawai pgwai = new pegawai();
        }
        public void update(){
        datahewan pgwai = new pegawai();
        }
        public void delete(){
        int id = Integer.parseInt(frame.getJTxtid().getText());
        impldatahewan.delete(id);
        }
}
