/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import ui.Main;
import model.Object;

/**
 *
 * @author jepe
 */
public class MainController {
    
    private Main mView;
//    private Object mObject;

    public MainController(Main m) {
        this.mView = m;
    }
    
    public void hitung(Object data){
        double hasil = data.getA() + data.getB();
        data.setHasil(hasil);
        
        mView.showData(data);
    }   
}
