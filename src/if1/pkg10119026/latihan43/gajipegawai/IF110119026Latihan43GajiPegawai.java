/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119026.latihan43.gajipegawai;

/**
 *
 * @author Asus
 * NAMA         : Muhammad Khatami
 * KELAS        : IF-1
 * NIM          : 10119026
 * Deskripsi Program : program ini untuk menghitung gaji pegawai
 */
public class IF110119026Latihan43GajiPegawai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GajiPegawai pegawai = new GajiPegawai();
        pegawai.setNama("Muhammad Khatami");
        pegawai.setAlamat("Jalan Maleber utara");
        pegawai.setGajiPokok(4500000);
        pegawai.setUangTunjangan(250000);
        pegawai.getUangTransport(300000);
        pegawai.setTotalGaji(
                pegawai.totalGaji(
                        pegawai.getUangTunjangan(),
                        pegawai.getUangTransport(),
                        pegawai.getgajiPokok(),
                        
        );
        pegawai.tampildata(
                pegawai.getNama(),
                pegawai.getalamat(),
                pegawai.getUangTunjangan(),
                pegawai.getUangTransport(),
                pegawai.getgajiPokok(),
                pegawai.getTotalGaji()
        );
    }
    
}
