/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author jepe
 */

//Representasi Data
public class ZakatMal {
    /**
     * Zakat Maal Object
     */
    // input
    double inputZmal1 = 0; //Harta dalam bentuk Tabungan/ Giro/ Deposito
    double inputZmal2 = 0; //Harta dalam bentuk Logam Mulia (Emas/ Perak)
    double inputZmal3 = 0; //Harta dalam bentuk Surat Beharga 2)
    double inputZmal4 = 0; //Harta dalam bentuk Properti 3)
    double inputZmal5 = 0; //Harta dalam bentuk Kendaraan 4)
    double inputZmal6 = 0; //Harta dalam bentuk Koleksi Seni & Barang Antik 5)
    double inputZmal7 = 0; //Harta dalam bentuk Stok Barang Dagangan
    double inputZmal8 = 0; //Harta dalam bentuk Lainnya
    double inputZmal9 = 0; //Harta dalam bentuk Piutang Lancar
    double inputZmal10 = 0; //Hutang Jatuh Tempo Saat Membayar Kewajiban Zakat 
    // output
    double outputZmal1 = 0; //Jumlah Harta
    double outputZmal2 = 0; //Jumlah Harta Yang Dihitung Zakatnya
    
    /**
     * Nisab Zakat Mal
     */
    //input
    double inputNmal1 = 0; //Harga Emas saat ini (dalam gram)
    //output
    double outputNmal1 = 0; //Besarnya Nisab Zakat Maal per Tahun
    String outputNmal2; //Apakah Saya Wajib Membayar Zakat Maal ?
    double outputNmal3 = 0; //Jumlah yang Saya Harus Dibayarkan per Tahun
    double outputNmal4 = 0; //Jumlah Bila Saya Bayarkan per Bulan   

    //Getter and Setter
    public double getInputZmal1() {
        return inputZmal1;
    }

    public void setInputZmal1(double inputZmal1) {
        this.inputZmal1 = inputZmal1;
    }

    public double getInputZmal2() {
        return inputZmal2;
    }

    public void setInputZmal2(double inputZmal2) {
        this.inputZmal2 = inputZmal2;
    }

    public double getInputZmal3() {
        return inputZmal3;
    }

    public void setInputZmal3(double inputZmal3) {
        this.inputZmal3 = inputZmal3;
    }

    public double getInputZmal4() {
        return inputZmal4;
    }

    public void setInputZmal4(double inputZmal4) {
        this.inputZmal4 = inputZmal4;
    }

    public double getInputZmal5() {
        return inputZmal5;
    }

    public void setInputZmal5(double inputZmal5) {
        this.inputZmal5 = inputZmal5;
    }

    public double getInputZmal6() {
        return inputZmal6;
    }

    public void setInputZmal6(double inputZmal6) {
        this.inputZmal6 = inputZmal6;
    }

    public double getInputZmal7() {
        return inputZmal7;
    }

    public void setInputZmal7(double inputZmal7) {
        this.inputZmal7 = inputZmal7;
    }

    public double getInputZmal8() {
        return inputZmal8;
    }

    public void setInputZmal8(double inputZmal8) {
        this.inputZmal8 = inputZmal8;
    }

    public double getInputZmal9() {
        return inputZmal9;
    }

    public void setInputZmal9(double inputZmal9) {
        this.inputZmal9 = inputZmal9;
    }

    public double getInputZmal10() {
        return inputZmal10;
    }

    public void setInputZmal10(double inputZmal10) {
        this.inputZmal10 = inputZmal10;
    }

    public double getOutputZmal1() {
        return outputZmal1;
    }

    public void setOutputZmal1(double outputZmal1) {
        this.outputZmal1 = outputZmal1;
    }

    public double getOutputZmal2() {
        return outputZmal2;
    }

    public void setOutputZmal2(double outputZmal2) {
        this.outputZmal2 = outputZmal2;
    }

    public double getInputNmal1() {
        return inputNmal1;
    }

    public void setInputNmal1(double inputNmal1) {
        this.inputNmal1 = inputNmal1;
    }

    public double getOutputNmal1() {
        return outputNmal1;
    }

    public void setOutputNmal1(double outputNmal1) {
        this.outputNmal1 = outputNmal1;
    }

    public String getOutputNmal2() {
        return outputNmal2;
    }

    public void setOutputNmal2(String outputNmal2) {
        this.outputNmal2 = outputNmal2;
    }

    public double getOutputNmal3() {
        return outputNmal3;
    }

    public void setOutputNmal3(double outputNmal3) {
        this.outputNmal3 = outputNmal3;
    }

    public double getOutputNmal4() {
        return outputNmal4;
    }

    public void setOutputNmal4(double outputNmal4) {
        this.outputNmal4 = outputNmal4;
    }
    
    
}
