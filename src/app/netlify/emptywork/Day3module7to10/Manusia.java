package app.netlify.emptywork.Day3module7to10;

public class Manusia {
    protected String nama;
    protected int umur;
    protected String jenisKelamin;

    protected void view() {
        System.out.println("Nama\t\t:" + this.nama);
        System.out.println("Umur\t\t: " + this.umur);
        System.out.println("Jenis Kelamin\t:" + this.jenisKelamin);
    }

    Manusia(String nama, int umur, String jenisKelamin) {
        this.nama = nama;
        this.umur = umur;
        this.jenisKelamin = jenisKelamin;
    }
}