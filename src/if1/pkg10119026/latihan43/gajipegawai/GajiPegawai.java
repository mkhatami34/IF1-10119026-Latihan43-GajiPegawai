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
public class GajiPegawai {
    private String nama, alamat;
    private int uangTransport, uangTunjangan, gajiPokok, totalGaji;
    
    public String getNama(){
        return nama;
    }
    
    public String getalamat(){
        return alamat;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public void setAlamat(String alamat){
        this.alamat = alamat;
    }
    
    public int getUangTransport(){
        return uangTransport;
    }
    
    public void setUangTransport(int uangTransport){
        this.uangTransport = uangTransport;
    }
    
    public int getUangTunjangan(){
        return uangTunjangan;
    }
    
    public void setUangTunjanagn(int uangTunjangan){
        this.uangTunjangan = uangTunjangan;
    }
    
    public int getgajiPokok(){
        return gajiPokok;
    }
    
    public void setGajiPokok(int gajiPokok){
        this.gajiPokok = gajiPokok;
    }
    
    public int getTotalGaji(){
        return totalGaji;
    }
    
    public void setTotalGaji(int totalGaji){
        this.totalGaji = totalGaji;
    }
    
    public int totalGaji(int uangTunjangan, int uangTransport, int gajiPokok){
        return uangTunjangan + uangTransport + gajiPokok;
    }
    
    public void tampildata(String nama, String alamat, int uangTunjangan, int uangTransport, int gajiPokok){
        System.out.println("### Data Gaji Karyawan PT. KAKATU ###");
        System.out.println("Nama Karyawan: ".concat(nama));
        System.out.println("Alamat: ".concat(alamat));
        System.out.println("Uang Transport: " + uangTransport);
        System.out.println("Uang Tunjangan: " + uangTunjangan);
        System.out.println("Gaji Pokok: " + gajiPokok);
        System.out.println("TOTAL GAJI: " + totalGaji);
    }
}
