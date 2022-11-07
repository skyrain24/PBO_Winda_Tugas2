//Winda Adelia 2111521002
public class Asdos extends Mahasiswa {
    private int jamNgasdos;

    public Asdos(String nama, int SKS, int jamNgasdos){
        super (nama, SKS); //downcasting karena mengambil properti dari kelas induknyanya yaitu kelas mahasiswa
        this.jamNgasdos = jamNgasdos + SKS * 3 ;
    }

    public int getJamSibuk(){
        System.out.println(getNama()+" adalah seorang asdos dengan jam sibuk "+jamNgasdos);
        return jamNgasdos;
    }
}