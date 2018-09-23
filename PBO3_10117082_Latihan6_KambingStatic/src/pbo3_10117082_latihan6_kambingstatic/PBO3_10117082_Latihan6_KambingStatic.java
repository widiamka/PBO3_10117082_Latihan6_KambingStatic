/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3_10117082_latihan6_kambingstatic;

/**
 *
 * @author Nama : WIDIAMEGA K
 *         Kelas : IF3
 *         NIM    : 10117082
 */
public class PBO3_10117082_Latihan6_KambingStatic {
    
    //NAMA_KAMBING sebagai konstanta
    public static final String NAMA_KAMBING = "MIDUN ";
   
    public static void main(String[] args) {
       Mamalia.jumlahKambing = 485000;
        System.out.println(NAMA_KAMBING + "Memiliki Kambing Sebanyak " + 
                Mamalia.jumlahKambing);
    }
    
}
