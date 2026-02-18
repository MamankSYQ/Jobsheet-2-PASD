public class MataKuliahhMain01 {
    public static void main (String[] args){
        MataKuliah01 matkul1 = new MataKuliah01();

        matkul1.kodeMk = "12345";
        matkul1.nama = "Daspro";
        matkul1.sks = 20;
        matkul1.jumlahJam = 100;

        matkul1.tampilInformasi();
        matkul1.ubahSks(15);
        matkul1.tambahJam(2);
        matkul1.tampilInformasi();
        matkul1.kurangijam(5);
        matkul1.tampilInformasi();

        MataKuliah01 matkul2 = new MataKuliah01("98765", "KTI", 30, 120);
        matkul2.tampilInformasi();
    }
}
