package app.netlify.emptywork.Day3module7to10;

import java.io.FileOutputStream;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FileOutputStream fo = null;
        Siswa siswa1 = new Siswa("Arto Kusumo", 16, "Pria", "SD Negeri Luar Angkasa");

        try {
            if(siswa1.nomorInduk == null) {
                throw new NullPointerException();
            }
        } catch (NullPointerException npe) {
            System.out.println("Nomor Induk dari " + siswa1.nama + " Masih belum di masukan");
            System.out.println("Silahkan Masukan nomor Induk baru: ");
            siswa1.nomorInduk = sc.nextLine();
        }

        siswa1.saveToFile(fo, "outputDinamis", "md", "Selamat Makan Siang Kaka!");
        siswa1.view();
    }
}
