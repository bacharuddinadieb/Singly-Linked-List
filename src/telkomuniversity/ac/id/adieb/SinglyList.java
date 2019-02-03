package telkomuniversity.ac.id.adieb;

public class SinglyList {
    Node head;

    public SinglyList() {
        head = null;
    }

    public boolean isEmpty() {
        return (head == null);
    }

    public void insertDepan(String nama, int nim, String kelas) {
        Node nd = new Node(nama, nim, kelas);
        nd.next = head;
        head = nd;
        System.out.println("\nBerhasil Tambah Data dari Depan");
    }

    public void insertBelakang(String nama, int nim, String kelas) {
        Node nd = new Node(nama, nim, kelas);
        Node tmp = head;

        while (tmp.next != null) {
            tmp = tmp.next;
        }

        tmp.next = nd;
        System.out.println("\nBerhasil Tambah Data Dari Belakang");
    }

    public void insertTengah(String nama, int nim, String kelas, int id) {
        Node nd = new Node(nama, nim, kelas);
        Node tmp = head;

        while (tmp.nim != id) {
            tmp = tmp.next;
        }

        nd.next = tmp.next;
        tmp.next = nd;
        System.out.println("\nBerhasil Tambah Data Sesudah" + id);
    }

    public Node hapusDepan() {
        if (!isEmpty()) {
            Node tmp = head;
            head = head.next;
            System.out.println("\nData Berhasil Dihapus Dari Depan");
            return tmp;
        } else {
            System.out.println("\nData pada list kosong");
            return null;
        }
    }

    public Node hapusBelakang() {
        if (!isEmpty()) {
            Node tmp = head, tmp2 = null;
            while (tmp.next != null) {
                tmp2 = tmp;
                tmp = tmp.next;
            }

            tmp2.next = null;
            System.out.println("\nData Berhasil Dihapus Dari Belakang");
            return tmp2;
        } else {
            System.out.println("\nData pada list kosong");
            return null;
        }
    }

    public Node hapusTengah(int id) {
        if (!isEmpty()) {
            Node tmp = head, tmp2 = null;
            while (tmp.nim != id) {
                tmp2 = tmp;
                tmp = tmp.next;
            }

            tmp2.next = tmp.next;
            tmp.next = null;
            System.out.println("\nData Berhasil Dihapus Setelah Nim: " + id);
            return tmp2;
        } else {
            System.out.println("\nData pada list kosong");
            return null;
        }
    }

    public void viewData() {
        Node tmp = head;

        if (tmp == null) {
            System.out.println("\nData pada list kososng");
        } else {
            System.out.println("\n List data mahasiswa");
            while (tmp != null) {
                tmp.lihat();
                tmp = tmp.next;
            }
        }
    }
}
