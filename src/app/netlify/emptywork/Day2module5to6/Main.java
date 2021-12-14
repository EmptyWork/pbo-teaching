package app.netlify.emptywork.Day2module5to6;

public class Main {
    public static void main(String[] args) {
        Manusia albert = new Manusia();
        albert.setNama("Albert Andi");
        albert.setUmur(12);
        albert.setJenisKelamin("Pria");

        System.out.println("Nama\t\t\t:" + albert.getNama());
        System.out.println("Umur\t\t\t:" + albert.getUmur());
        System.out.println("Jenis Kelamin\t:" + albert.getJenisKelamin());
    }
}
