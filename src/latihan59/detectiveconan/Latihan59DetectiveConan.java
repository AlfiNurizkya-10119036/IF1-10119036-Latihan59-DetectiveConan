/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan59.detectiveconan;

/**
 *
 * @author Alfi Nurizkya
 * Nama     : Alfi Nurizkya
 * NIM      : 10119036
 * Kelas    : IF-1
 * Deskripsi Program : Program Memasukan Data Karakter
 */
public class Latihan59DetectiveConan {

   protected String nama, jenisKelamin;
    protected int umur;

    public Latihan59DetectiveConan(String nama, String jenisKelamin, int umur) {
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.umur = umur;
    }

    public String getNama() {
        return nama;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public int getUmur() {
        return umur;
    }

    public void siapaSaya() {
        System.out.println("Nama : ".concat(nama));
        System.out.println("Jenis Kelamin : ".concat(jenisKelamin));
        System.out.println("Umur : " + umur);
    }
}