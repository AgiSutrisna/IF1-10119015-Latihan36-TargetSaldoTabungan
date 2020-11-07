/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119015.latihan36.targetsaldotabungan;

/**
 *
 * @author Agy
 * NAMA     : Agi Sutrisna
 * KELAS    : IF-1
 * NIM      : 10119015
 */
public class TargetSaldoTabungan {
    private static Double jumlahBunga;
    private static int lama;
    
    private static double hitungBunga(double bunga, int saldo){
        jumlahBunga = (bunga / 100) * saldo;
        return jumlahBunga;
    }
    
    public static void tampilSaldo(double bunga, int saldo, int targetSaldo){
        lama = 1;
        while(saldo < targetSaldo){
            saldo += hitungBunga(bunga, saldo);
            System.out.printf("Saldo di bulan ke-" + lama + " Rp. %,d%n", saldo);
            
        }
    }
}
