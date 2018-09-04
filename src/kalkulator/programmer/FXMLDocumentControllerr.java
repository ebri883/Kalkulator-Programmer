/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalkulator.programmer;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

/**
 * FXML Controller class
 *
 * @author GokuJawa
 */
public class FXMLDocumentControllerr{

    
    String angka="";
    double jumlah,angka1,angka2;
    int pilih;
    
    @FXML
    private JFXButton id_cr;
    @FXML
    private JFXButton id_0;
    @FXML
    private JFXButton id_9;
    @FXML
    private JFXButton id_8;
    @FXML
    private JFXButton id_7;
    @FXML
    private JFXButton id_6;
    @FXML
    private JFXButton id_5;
    @FXML
    private JFXButton id_4;
    @FXML
    private JFXButton id_3;
    @FXML
    private JFXButton id_2;
    @FXML
    private JFXButton id_1;
    @FXML
    private JFXButton id_eks;
    @FXML
    private JFXTextField hasil2;
    @FXML
    private JFXTextField hasil3;
    @FXML
    private JFXTextField hasil4;
    @FXML
    private JFXTextField hasil1;
    @FXML
    private JFXButton id_hex;
    @FXML
    private JFXButton id_dec;
    @FXML
    private JFXButton id_oct;
    @FXML
    private JFXButton id_bin;
    @FXML
    private JFXButton id_kurang;
    @FXML
    private JFXButton id_modulus;
    @FXML
    private JFXButton id_kali;
    @FXML
    private JFXButton id_bagi;
    @FXML
    private JFXButton id_tambah;
    @FXML
    private JFXTextField isian;
    @FXML
    private JFXButton id_e;
    @FXML
    private JFXButton id_d;
    @FXML
    private JFXButton id_c;
    @FXML
    private JFXButton id_b;
    @FXML
    private JFXButton id_a;
    @FXML
    private JFXButton id_f; 

        //Huruf
    @FXML
    void a(ActionEvent event) {
    angka += "10";
    isian.setText(angka);
    }

    @FXML
    void b(ActionEvent event) {
angka += "11";
    isian.setText(angka);
    }

        @FXML
    void c(ActionEvent event) {
angka += "12";
    isian.setText(angka);
    }
    
    
    @FXML
    void d(ActionEvent event) {
angka += "13";
    isian.setText(angka);
    }
    
    @FXML
    void e(ActionEvent event) {
angka += "14";
    isian.setText(angka);
    }
    
    @FXML
    void f(ActionEvent event) {
        angka += "15";
        isian.setText(angka);
        hasil1.setText(angka);
        String hexa2 = hasil1.getText();
        int outDes2 = Integer.parseInt(hexa2,16);
        
       
        String hasilDes = Integer.toUnsignedString(outDes2);
        int hasilBiner = Integer.parseInt(hasilDes);
        hasil4.setText(Integer.toBinaryString(hasilBiner));
        
        String hexa = hasil1.getText();
        int outDes = Integer.parseInt(hexa,16);
        hasil2.setText(Integer.toUnsignedString(outDes));
        
        String hexa3 = hasil1.getText();
        int outDes3 = Integer.parseInt(hexa3,16);
        String hasilDes2 = Integer.toUnsignedString(outDes3);
        int hasilOktal2 = Integer.parseInt(hasilDes2);
        hasil3.setText(Integer.toOctalString(hasilOktal2));
    }
    
    
    //Operasi
    @FXML
    void bagi(ActionEvent event) {
angka1=Double.parseDouble(angka);
isian.setText("/");
angka="";
pilih=4;
    }

    @FXML
    void jumlah(ActionEvent event) {
        angka1=Double.parseDouble(angka);
isian.setText("+");
angka="";
pilih=1;
    }

    @FXML
    void kali(ActionEvent event) {
angka1=Double.parseDouble(angka);
isian.setText("x");
angka="";
pilih=3;
    }

    @FXML
    void kurang(ActionEvent event) {
angka1=Double.parseDouble(angka);
isian.setText("-");
angka="";
pilih=2;
    }
    
    @FXML
    void modulus(ActionEvent event) {
angka1=Double.parseDouble(angka);
isian.setText("%");
angka="";
pilih=5;
    }

    //Jenis Bilangan
    @FXML
    void bin(ActionEvent event) {

    }

    @FXML
    void hex(ActionEvent event) {

    }

    @FXML
    void oct(ActionEvent event) {

    }

    @FXML
    void dec(ActionEvent event) {

    }
// Angka
    
    @FXML
    void satu(ActionEvent event) {
    angka += "1";
    isian.setText(angka);
    hasil2.setText(angka);
    String desimal1 = hasil2.getText();
    int outOktal9 = Integer.parseInt(desimal1);
    hasil3.setText(Integer.toOctalString(outOktal9));
             
    String desimal3 = hasil2.getText();             
    int outHexa9 = Integer.parseInt(desimal3);
    hasil1.setText(Integer.toHexString(outHexa9));
             
    String desimal2 = hasil2.getText();
    int outBiner9 = Integer.parseInt(desimal2);
    hasil4.setText(Integer.toBinaryString(outBiner9));
    }
    
    @FXML
    void dua(ActionEvent event) {
    angka += "2";
    isian.setText(angka);
   hasil2.setText(angka);
    String desimal1 = hasil2.getText();
    int outOktal9 = Integer.parseInt(desimal1);
    hasil3.setText(Integer.toOctalString(outOktal9));
             
    String desimal3 = hasil2.getText();             
    int outHexa9 = Integer.parseInt(desimal3);
    hasil1.setText(Integer.toHexString(outHexa9));
             
    String desimal2 = hasil2.getText();
    int outBiner9 = Integer.parseInt(desimal2);
    hasil4.setText(Integer.toBinaryString(outBiner9));
    }
    
    @FXML
    void tiga(ActionEvent event) {
        angka += "3";
    isian.setText(angka);
    hasil2.setText(angka);
    String desimal1 = hasil2.getText();
    int outOktal9 = Integer.parseInt(desimal1);
    hasil3.setText(Integer.toOctalString(outOktal9));
             
    String desimal3 = hasil2.getText();             
    int outHexa9 = Integer.parseInt(desimal3);
    hasil1.setText(Integer.toHexString(outHexa9));
             
    String desimal2 = hasil2.getText();
    int outBiner9 = Integer.parseInt(desimal2);
    hasil4.setText(Integer.toBinaryString(outBiner9));
    }

    @FXML
    void empat(ActionEvent event) {
    angka += "4";
    isian.setText(angka);
    hasil2.setText(angka);
    String desimal1 = hasil2.getText();
    int outOktal9 = Integer.parseInt(desimal1);
    hasil3.setText(Integer.toOctalString(outOktal9));
             
    String desimal3 = hasil2.getText();             
    int outHexa9 = Integer.parseInt(desimal3);
    hasil1.setText(Integer.toHexString(outHexa9));
             
    String desimal2 = hasil2.getText();
    int outBiner9 = Integer.parseInt(desimal2);
    hasil4.setText(Integer.toBinaryString(outBiner9));
    }
    
    @FXML
    void lima(ActionEvent event) {
    angka += "5";
    isian.setText(angka);
    hasil2.setText(angka);
    String desimal1 = hasil2.getText();
    int outOktal9 = Integer.parseInt(desimal1);
    hasil3.setText(Integer.toOctalString(outOktal9));
             
    String desimal3 = hasil2.getText();             
    int outHexa9 = Integer.parseInt(desimal3);
    hasil1.setText(Integer.toHexString(outHexa9));
             
    String desimal2 = hasil2.getText();
    int outBiner9 = Integer.parseInt(desimal2);
    hasil4.setText(Integer.toBinaryString(outBiner9));
    }
    
    @FXML
    void enam(ActionEvent event) {
        angka += "6";
    isian.setText(angka);
    hasil2.setText(angka);
    String desimal1 = hasil2.getText();
    int outOktal9 = Integer.parseInt(desimal1);
    hasil3.setText(Integer.toOctalString(outOktal9));
             
    String desimal3 = hasil2.getText();             
    int outHexa9 = Integer.parseInt(desimal3);
    hasil1.setText(Integer.toHexString(outHexa9));
             
    String desimal2 = hasil2.getText();
    int outBiner9 = Integer.parseInt(desimal2);
    hasil4.setText(Integer.toBinaryString(outBiner9));
    }
    
    @FXML
    void tujuh(ActionEvent event) {
        angka += "7";
    isian.setText(angka);
    hasil2.setText(angka);
    String desimal1 = hasil2.getText();
    int outOktal9 = Integer.parseInt(desimal1);
    hasil3.setText(Integer.toOctalString(outOktal9));
             
    String desimal3 = hasil2.getText();             
    int outHexa9 = Integer.parseInt(desimal3);
    hasil1.setText(Integer.toHexString(outHexa9));
             
    String desimal2 = hasil2.getText();
    int outBiner9 = Integer.parseInt(desimal2);
    hasil4.setText(Integer.toBinaryString(outBiner9));
    }
    
    @FXML
    void delapan(ActionEvent event) {
    angka += "8";
    isian.setText(angka);
    hasil2.setText(angka);
    String desimal1 = hasil2.getText();
    int outOktal9 = Integer.parseInt(desimal1);
    hasil3.setText(Integer.toOctalString(outOktal9));
             
    String desimal3 = hasil2.getText();             
    int outHexa9 = Integer.parseInt(desimal3);
    hasil1.setText(Integer.toHexString(outHexa9));
             
    String desimal2 = hasil2.getText();
    int outBiner9 = Integer.parseInt(desimal2);
    hasil4.setText(Integer.toBinaryString(outBiner9));
    }

     @FXML
    void sembilan(ActionEvent event) {
        angka += "9";
    isian.setText(angka);
    hasil2.setText(angka);
    String desimal1 = hasil2.getText();
    int outOktal9 = Integer.parseInt(desimal1);
    hasil3.setText(Integer.toOctalString(outOktal9));
             
    String desimal3 = hasil2.getText();             
    int outHexa9 = Integer.parseInt(desimal3);
    hasil1.setText(Integer.toHexString(outHexa9));
             
    String desimal2 = hasil2.getText();
    int outBiner9 = Integer.parseInt(desimal2);
    hasil4.setText(Integer.toBinaryString(outBiner9));
    }
    
     @FXML
    void nol(ActionEvent event) {
    angka += "0";
    isian.setText(angka);
    hasil2.setText(angka);
    String desimal1 = hasil2.getText();
    int outOktal9 = Integer.parseInt(desimal1);
    hasil3.setText(Integer.toOctalString(outOktal9));
             
    String desimal3 = hasil2.getText();             
    int outHexa9 = Integer.parseInt(desimal3);
    hasil1.setText(Integer.toHexString(outHexa9));
             
    String desimal2 = hasil2.getText();
    int outBiner9 = Integer.parseInt(desimal2);
    hasil4.setText(Integer.toBinaryString(outBiner9));
    }

    //Extra
    @FXML
    void ulang(ActionEvent event) {
    isian.setText("");
    angka1=0.0;
    angka2=0.0;
    jumlah=0.0;
    angka="";

    }
    
    @FXML
    public void eksekusi(ActionEvent event) {
switch(pilih){
        case 1:
            angka2 = Double.parseDouble(angka);
            jumlah = angka1 + angka2;
            angka = Double.toString(jumlah);
            isian.setText(angka);
            break;
        case 2:
            angka2 = Double.parseDouble(angka);
            jumlah = angka1 - angka2;
            angka = Double.toString(jumlah);
            isian.setText(angka);
            break;
        case 3:
            angka2 = Double.parseDouble(angka);
            jumlah = angka1 * angka2;
            angka = Double.toString(jumlah);
            isian.setText(angka);
            break;
        case 4:
            angka2 = Double.parseDouble(angka);
            jumlah = angka1 / angka2;
            angka = Double.toString(jumlah);
            isian.setText(angka);
            break;
            default:
            break;
} 
    }


}
