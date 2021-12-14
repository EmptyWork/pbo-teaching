package app.netlify.emptywork.Day3module7to10;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Siswa extends Manusia {
    protected String namaSekolah;
    protected String nomorInduk;
    Siswa(String nama, int umur, String jenisKelamin, String namaSekolah) {
        super(nama, umur, jenisKelamin);
        this.namaSekolah = namaSekolah;
    }

    @Override
    protected void view() {
        super.view();
        System.out.println("Nama Sekolah\t: " + this.namaSekolah);
        System.out.println("Nomor Induk\t:" + this.nomorInduk);
    }

    protected void saveToFile(FileOutputStream fo, String namaFile, String extention, String text) {
        try {
            fo = new FileOutputStream("D://"+ namaFile + "." + extention);
            try {
                for(int i = 0; i < text.length(); i++) {
                    fo.write((int) text.charAt(i));
                }
            } catch (IOException ioe) {
                System.out.println(ioe.getMessage());
            }
        } catch (FileNotFoundException fnfe) {
            System.out.println(fnfe.getMessage());
        }
    }
}