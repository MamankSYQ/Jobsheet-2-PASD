public class Dosen01 {
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;

    public Dosen01(){
    }

    public Dosen01(String id, String nm, boolean status, int thnGabung, String bidangKeahlian){
        idDosen = id;
        nama = nm;
        statusAktif = status;
        tahunBergabung = thnGabung;
        this.bidangKeahlian = bidangKeahlian;
    }

    void tampilInformasi(){
        System.out.println("ID Dosen : "+idDosen);
        System.out.println("Nama : "+nama);
        if (statusAktif == true){
            System.out.println("Status : Aktif");
        }
        else {
            System.out.println("Status : Tidak aktif");
        }
        System.out.println("Tahun bergabung : "+tahunBergabung);
        System.out.println("Bidang keahlian : "+bidangKeahlian);
    }
    void setStatusAktif(boolean sts){
        statusAktif = sts;
    }
    int hitungMasaKerja(int thnSkrg){
        int masaKerja;
        masaKerja = thnSkrg - tahunBergabung;
        System.out.println("Masa kerja : "+masaKerja);
        return masaKerja;
    }
    void ubahKeahlian(String bidang){
        bidangKeahlian = bidang;
    }
}
