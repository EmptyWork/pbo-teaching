package app.netlify.emptywork.Day2module5to6;

public class Main {
    public static void main(String[] args) {
        // Array
        String[] dataNama = {"Jason", "Arli", "Keyno", "Keylo", "Jacson", "Albert", "Kayla", "Yuna", "Liia", "Risya"};
        int panjangDataNama = dataNama.length;

        System.out.print("Panjang dari dataNama adalah " + panjangDataNama + "\ndan terdiri dari elemen: ");
        for(int i = 0; i < panjangDataNama; i++) {
            if(i == panjangDataNama - 1) {
                System.out.print(dataNama[i] + "\n");
            } else {
                System.out.print(dataNama[i] + ", ");
            }
        }

        // Metode kedua untuk deklarasi array
        int[] datas;
        datas = new int[2];

        datas[0] = 7;
        datas[1] = 4;

        // Foreach data in datas
        for (int data : datas) {
            System.out.println(data);
        }

        // String
        String kalimatSelamatDatang = "Selamat Datang Kesini!";
        if(kalimatSelamatDatang.length() < 20) {
            System.out.println(kalimatSelamatDatang.length() + " lebih kecil dari 20");
        } else {
            System.out.println(kalimatSelamatDatang.length() + " lebih besar dari 20");
        }

        // Pengenalan awal Objek
        Manusia albert = new Manusia();
        albert.setNama("Albert Andi");
        albert.setUmur(12);
        albert.setJenisKelamin("Pria");

        System.out.println("Nama\t\t\t:" + albert.getNama());
        System.out.println("Umur\t\t\t:" + albert.getUmur());
        System.out.println("Jenis Kelamin\t:" + albert.getJenisKelamin());
    }
}
