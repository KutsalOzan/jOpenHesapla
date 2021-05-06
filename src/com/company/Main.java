package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        String vize = JOptionPane.showInputDialog("Sınav Notunuzu Giriniz");
        int v1 = Integer.parseInt(vize);
        while(v1 < 0 || v1 > 100){
            vize = JOptionPane.showInputDialog("Sınav Notunuzu Tekrar Giriniz");
            v1 = Integer.parseInt(vize);
        }
        String finalNotu = JOptionPane.showInputDialog("Final Sınav Notunuzu Giriniz");
        int f1 = Integer.parseInt(finalNotu);
        while(f1 <0 || f1 > 100){
            finalNotu = JOptionPane.showInputDialog("Final Sınav Notunuzu Tekrar Giriniz");
            f1 = Integer.parseInt(finalNotu);
        }
        int not = (int) (v1 * 0.3 + f1 * 0.7);
        String sonuc = "Notunuz : " + not;

        JOptionPane.showMessageDialog(null,sonuc,"Notunuz",JOptionPane.INFORMATION_MESSAGE);
    }
}
