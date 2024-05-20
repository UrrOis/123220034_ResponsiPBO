/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import java.util.List;
import java.util.ArrayList;
import DAOdatazoo.datahewanDAO;
import DAOImplement.datahewanimplement;
import model.*;
import view.MainView;

/**
 *
 * @author Lab Informatika
 */
public class datahewancontroller {
    MainView frame;
    datahewanimplement impldatahewan;
    List<hewan> hw;
    
    public datahewancontroller(MainView Frame){
        this.frame = frame;
        impldatahewan = new datahewanDAO();
        hw = impldatahewan.getAll();
}
        public void isitabel(){
        hw = impldatahewan.getAll();
        modeltabeldatahewan mh = new modeltabeldatahewan(hw);
        frame.getTabelDatahewan().setModel(mh);
    }
        public void insert(){
        hewan hw = new hewan();
        }
        public void update(){
        hewan hw = new hewan();
        }
        public void delete(){
        int id = Integer.parseInt(frame.getJTxtid().getText());
        impldatahewan.delete(id);
        }
}

