public class DosenMain01 {
    public static void main(String[] args) {
        Dosen01 dos1 = new Dosen01();
        dos1.idDosen = "123";
        dos1.nama = "Dosen 1";
        dos1.statusAktif = true;
        dos1.tahunBergabung = 2015;
        dos1.bidangKeahlian = "Daspro";

        dos1.tampilInformasi();
        dos1.setStatusAktif(false);
        dos1.hitungMasaKerja(2025);
        dos1.ubahKeahlian("KTI");
        dos1.tampilInformasi();

        Dosen01 dos2 = new Dosen01("4567", "Dosen 2", false, 2014, "PAMB");
        dos2.tampilInformasi();
    }
}
