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
 * Deskripsi Program : Program Memasukan Data Karakyer Pendukung
 */
public class KarakterPendukung extends Latihan59DetectiveConan{

    private String status;
    
    public KarakterPendukung(String nama, String jenisKelamin, int umur, String status) {
        super(nama, jenisKelamin, umur);
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public void siapaSaya() {
        System.out.println("Saya Karakter Pendukung.");
        super.siapaSaya();
        System.out.println("Status : ".concat(status).concat("\n"));
    }
}
