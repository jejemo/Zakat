/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import ui.Zakat;
import model.ZakatMal;


/**
 *
 * @author jepe
 */
public class ZakatController {
    
    private Zakat mViewZakat;

    //contruktor, agar dapat memanggil/menggunakan class view
    public ZakatController(Zakat mZakat) {
        this.mViewZakat = mZakat;
    }
    
    public void hitungJumlahHarta(ZakatMal mZakat){
        //menjumlahkan total harta
        double jumlahHarta = mZakat.getInputZmal1() + 
                        mZakat.getInputZmal2() +
                        mZakat.getInputZmal3() +
                        mZakat.getInputZmal4() +
                        mZakat.getInputZmal5() +
                        mZakat.getInputZmal6() +
                        mZakat.getInputZmal7() +
                        mZakat.getInputZmal8() +
                        mZakat.getInputZmal9() ;
        //menjumlahkan total harta yang telah dizakatkan
        double jumlahHartaZakat = jumlahHarta - mZakat.getInputZmal10();
        
        //memasukan data kedalam model
        mZakat.setOutputZmal1(jumlahHarta);
        mZakat.setOutputZmal2(jumlahHartaZakat);
        //tampil hasil zakat maal
        mViewZakat.tampilZakatMal(mZakat);
        //menghitung biaya nisab zakat
        double hitungNisabMal = hitungNisabMal(mZakat.getInputNmal1());
        //mengecek apakah total harta lebih besar dari biaya nisab atau tidak
        if (jumlahHartaZakat >= hitungNisabMal) {            
            double hitungPertahun = hitungPertahun(jumlahHartaZakat);
            double hitungPerbulan = hitungPerbulan(hitungPertahun);
            //memasukan data kedalam model
            mZakat.setOutputNmal1(hitungNisabMal);
            mZakat.setOutputNmal2("YA");
            mZakat.setOutputNmal3(hitungPertahun);
            mZakat.setOutputNmal4(hitungPerbulan); 
            
            mViewZakat.tampilBayarZakat(mZakat);
        } else{
            
            mZakat.setOutputNmal1(hitungNisabMal);
            mZakat.setOutputNmal2("TIDAK");
            mZakat.setOutputNmal3(0);
            mZakat.setOutputNmal4(0);
            
            mViewZakat.tampilBayarZakat(mZakat);
        }
    }
    
    private double hitungNisabMal(double hargaEmas){
        //hitung biaya nisab, harga emas saat ini * 85 gram emas
        return hargaEmas * 85;
    }

    private double hitungPertahun(double zakatPertahun) {
        //menghitung zakat pertahun total harta yang telah dizakatkan * 2,5%
        return zakatPertahun * 0.025;
    }

    private double hitungPerbulan(double hartaPertahun) {
        //menghitung hasil zakat pertahun / 12 bulan
        return hartaPertahun / 12;
    }
    
}
