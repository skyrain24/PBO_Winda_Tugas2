//Winda Adelia 2111521002
public class Simulator {
    public static void main(String[] args) throws Exception {
        Asdos asdos1 = new Asdos("Fairuzikun", 24, 1);
        Dosen dosen1 = new Dosen("Raja Op Damanik",5);
        Elemen asdos2 = new Asdos("Angel-chan", 21, 1); /*polymorphisme karena objek bertipe parent
        kelas yaitu kelas elemen melakukan pemanggilan konstruktornya melalui kelas anak yaitu kelas asdos*/
        Mahasiswa mahasiswa1 = new Mahasiswa("Firman", 20);
        Elemen mahasiswa2 = new Mahasiswa("Nid to pass this sem", 23); /*upcasting
        karena mengambil objek dari kelas anaknya yaitu kelas mahasiswa*/
        Elemen dosen2 = new Dosen("Nivotko", 3); /*upcasting karena
        mengambil objek dari kelas anaknya yaitu kelas dosen */
        
        int a1 = asdos1.getJamSibuk();
        int d1 = dosen1.getJamSibuk();
        int a2 = asdos2.getJamSibuk();
        int m1 = mahasiswa1.getJamSibuk();
        int m2 = mahasiswa2.getJamSibuk();
        int d2 = dosen2.getJamSibuk();

        int total = a1 + d1+ a2 + m1 + m2 + d2;
        System.out.println("Total jam sibuk elemen Fasilkom adalah " +total);
    }
}