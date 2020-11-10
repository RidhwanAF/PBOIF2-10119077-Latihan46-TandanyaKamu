/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119077.latihan46.tandanyakamu;

import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author RAF
 * Nama     : Ridhwan Anwar Fuazan
 * NIM      : 10119077
 * Kelas    : IF - 2
 * Deskripsi: Perhitungan Umur
 */
public class PBOIF210119077Latihan46TandanyaKamu {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Age objAge = new Age(Calendar.getInstance().get(Calendar.YEAR));
        
        System.out.print("Masukkan Tahun Lahir Anda : ");
        objAge.setYearBirth(input.nextInt());
        System.out.println("");
        
        System.out.println("======Hasil Perhitungan Umur======");
        System.out.println("Tahun lahir anda : "+objAge.getYearBirth());
        System.out.println("Hari ini tahun : "+objAge.getYearNow());
        System.out.println("Umur kamu sampai hari ini adalah "+objAge.hitungUmur()+" tahun");
        System.out.println("Tandanya Kamu "+objAge.tandanyaKamu(objAge.hitungUmur()));
    }
    
}
