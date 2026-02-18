public class MataKuliah01 {
    String kodeMk;
    String nama;
    int sks;
    int jumlahJam;
    
    public MataKuliah01(){
    }
    
    public MataKuliah01(String kodeMk, String nm, int sks, int jmlJam){
        this.kodeMk = kodeMk; 
        nama = nm;
        this.sks = sks;
        jumlahJam = jmlJam;
    }

    void tampilInformasi(){
        System.out.println("Kode Mata Kuliah : "+kodeMk);
        System.out.println("Nama Mata Kuliah : "+nama);
        System.out.println("Jumlah SKS : "+sks);
        System.out.println("Jumlah jam : "+jumlahJam);
    }
    void ubahSks(int sksBaru){
        sks = sksBaru;
        System.out.println("SKS telah diubah.");
    }
    void tambahJam(int jam){
        jumlahJam += jam;
    }
    void kurangijam(int jam){
        jumlahJam -= jam;
        if (jumlahJam <= 0){
            System.out.println("Pengurangan tidak dapat dilakukan.");
            System.exit(0);
        }
        System.out.println("Jumlah jam sudah diupdate.");
        System.out.println("Jumlah jam : "+jumlahJam);
    }
}

