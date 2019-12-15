/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

/**
 *
 * @author jepe
 */
public class KonversiMataUang {
    
    private double mataUang;
    private DecimalFormat kursIndonesia;
    private DecimalFormatSymbols formatRp;

    public void setMataUang(double mataUang) {
        this.mataUang = mataUang;
        this.kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        this.formatRp = new DecimalFormatSymbols();
    }

    public String getKonversi(){
        String konversi = "";
        formatRp.setCurrencySymbol("Rp. ");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');
        
        kursIndonesia.setDecimalFormatSymbols(formatRp);
        
        konversi = kursIndonesia.format(mataUang);
        
        return konversi;
    }
}
