package app.netlify.emptywork.Day1module1to4;

public class Main {
    public static void main(String[] args) {
        int angkaDua = 2;
        char karakterA = 'a';
        String hurufJ = "ini huruf j";
        boolean benar = true;

        // tipe data string
        String nama, golDarah;
        nama = "Albert";
        golDarah = "O";

        // tipe data int
        int angkaPertama, angkaKedua, jumlah;
        angkaPertama = 3;
        angkaKedua = 4;
        jumlah = angkaPertama + angkaKedua;

        int a=10, b=10, c=0, d=0;
        int step=3;
        a++;
        b--;
        c+=step;
        d-=step;
        System.out.println("a = a + 1 ->" + a);
        System.out.println("b = b - 1 ->" + b);
        System.out.println("c = c + step ->" + c);
        System.out.println("d = d - step ->" + d);

        if(a == 11 && b == 9) {
            System.out.println("Kondisi 1 dan Kondisi 2 benar");
        }

        if(a == 12 || b == 9) {
            System.out.println("Salah satu kondisi benar");
        }

        for(int i = 0; i < 5; i++) {
            System.out.println("ini perulangan ke-" + (i+1));
        }

        int w = 0;
        while(w < 5) {
            System.out.println("ini perulangan menggunakan while, ke-" + (w+1));
            w++;
        }

        int wd= 0;
        do{
            System.out.println("ini perulangan menggunakan do-while, ke-" + (wd+1));
            wd++;
        } while (wd < 5);


        System.out.println("Hello World!");
    }
}
