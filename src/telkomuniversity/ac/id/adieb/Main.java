package telkomuniversity.ac.id.adieb;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int pil, nim, id;
        String nama, kelas;

        Scanner inp = new Scanner(System.in);
        SinglyList dataku = new SinglyList();

        do {
            System.out.println("==================================");
            System.out.println("Data Mahasiswa\n" +
                    "1. Insert Depan\n" +
                    "2. Insert Belakang\n" +
                    "3. Insert Tengah\n" +
                    "4. Hapus Depan\n" +
                    "5. Hapus Belakang\n" +
                    "6. Hapus Tengah\n" +
                    "7. Lihat Data\n" +
                    "8. Keluar");
            System.out.print("Masukkan Pilihan Anda: ");
            pil = inp.nextInt();

            switch (pil) {
                case 1:
                    System.out.print("Masukkan Nama   : ");
                    nama = inp.next();
                    System.out.print("Masukkan NIM    : ");
                    nim = inp.nextInt();
                    System.out.print("Masukkan Kelas  : ");
                    kelas = inp.next();
                    dataku.insertDepan(nama, nim, kelas);
                    break;
                case 2:
                    System.out.print("Masukkan Nama   : ");
                    nama = inp.next();
                    System.out.print("Masukkan NIM    : ");
                    nim = inp.nextInt();
                    System.out.print("Masukkan Kelas  : ");
                    kelas = inp.next();
                    dataku.insertBelakang(nama, nim, kelas);
                    break;
                case 3:
                    System.out.print("Masukkan Nim Yang Mau Ditambahkan Setelahnya: ");
                    id = inp.nextInt();
                    System.out.print("Masukkan Nama   : ");
                    nama = inp.next();
                    System.out.print("Masukkan NIM    : ");
                    nim = inp.nextInt();
                    System.out.print("Masukkan Kelas  : ");
                    kelas = inp.next();
                    dataku.insertTengah(nama, nim, kelas, id);
                    break;
                case 4:
                    dataku.hapusDepan();
                    break;
                case 5:
                    dataku.hapusBelakang();
                    break;
                case 6:
                    System.out.print("Masukkan Nim Yang Mau Dihapus Setelahnya: ");
                    id = inp.nextInt();
                    dataku.hapusTengah(id);
                    break;
                case 7:
                    dataku.viewData();
                    break;
                case 8:

                    break;
                default:
                    System.out.println("Pilihan anda salah");
                    break;
            }
        } while (pil != 8);
    }
}
