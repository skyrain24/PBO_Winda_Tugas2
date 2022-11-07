//Winda Adelia 2111521002
public class Mahasiswa extends Elemen{
    private int SKS;

    public Mahasiswa(String nama, int SKS){
        super(nama); //downcasting karena mengambil properti dari kelas induknyanya yaitu kelas elemen
        this.SKS = SKS*3;
    }

    public int getJamSibuk(){
        System.out.println(getNama()+" adalah seorang mahasiswa dengan jam sibuk "+SKS);
        return SKS;
    }
}