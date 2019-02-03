package telkomuniversity.ac.id.adieb;

public class Node {
    String nama, kelas;
    int nim;
    Node next;

    public Node(String nama, int nim, String kelas) {
        this.nama = nama;
        this.kelas = kelas;
        this.nim = nim;
    }

    public void lihat() {
        System.out.println("Nama     : " + nama);
        System.out.println("NIM      : " + nim);
        System.out.println("Kelas    : " + kelas + "\n");
    }
}
