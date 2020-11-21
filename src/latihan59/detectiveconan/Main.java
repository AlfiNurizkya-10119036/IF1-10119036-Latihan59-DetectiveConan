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
public class Main {

    public static void main(String[] args) {
        Karakter conan = new Karakter("Conan Edogawa", "Laki-Laki", 7, "Cerdas", "Detective Boys");
        conan.siapaSaya();

        Karakter mitsuhiko = new Karakter("Mitsuhiko Tsuburaya", "Laki-Laki", 7, "Cerdas", "Detective Boys");
        mitsuhiko.siapaSaya();

        Karakter ai = new Karakter("Ai Haibara", "Perempuan", 7, "Cerdas, Tenang", "Detective Boys");
        ai.siapaSaya();

        Karakter ayumi = new Karakter("Ayumi Yoshida", "Perempuan", 7, "Ceria", "Detective Boys");
        ayumi.siapaSaya();

        Karakter genta = new Karakter("Genta Kojima", "Laki-Laki", 7, "Kurang Ajar", "Detective Boys");
        genta.siapaSaya();

        KarakterPendukung kogoro = new KarakterPendukung("Kogoro Mouri", "Laki-Laki", 38, "Ayah dari Ran Mouri");
        kogoro.siapaSaya();

        KarakterPendukung ran = new KarakterPendukung("Ran Mouri", "Perempuan", 17, "Putri dari Kogoro Mauri");
        ran.siapaSaya();

        KarakterPendukung sonozo = new KarakterPendukung("Sonozo Suziki", "Perempuan", 17, "Sahabat dari Ran Mauri");
        ran.siapaSaya();

        KarakterPendukung eri = new KarakterPendukung("Eri Kisaki", "Perempuan", 38, "Ibu dari Ran Mauri");
        eri.siapaSaya();

        KarakterPendukung heiji = new KarakterPendukung("Heiji Hattori", "Laki-Laki", 17, "Rival Conan Edogawa");
        heiji.siapaSaya();

        KarakterPendukung kazuha = new KarakterPendukung("Kazuha Toyama", "Perempuan", 17, "Sahabat Heiji Hattori");
        kazuha.siapaSaya();

        KarakterPendukung agasa = new KarakterPendukung("Hiroshi Agasa", "Laki-Laki", 53, "Professor");
        agasa.siapaSaya();
    }
}
