//Winda Adelia 2111521002
public class Dosen extends Elemen {
    private int jumlahHariKerja;

    public Dosen(String nama, int jumlahHariKerja){
        super (nama); //downcasting karena mengambil properti dari kelas induknyanya yaitu kelas elemen
        this.jumlahHariKerja = jumlahHariKerja * 8 ;
    }

    public int getJamSibuk(){
        System.out.println(getNama()+" adalah seorang dosen dengan jam sibuk "+jumlahHariKerja);
        return jumlahHariKerja;
    }
}