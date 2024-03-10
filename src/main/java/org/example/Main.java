import java.util.Scanner;

class Mahasiswa {
    private String nim;
    private String nama;
    private int umur;

    public void inputDataMahasiswa() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("NIM: ");
        nim = scanner.nextLine();
        while (nim.length() != 15) {
            System.out.println("Panjang NIM harus 15 angka. Silakan input kembali.");
            System.out.print("NIM: ");
            nim = scanner.nextLine();
        }

        System.out.print("Nama: ");
        nama = scanner.nextLine();

        System.out.print("Umur: ");
        umur = scanner.nextInt();
    }

    public void tampilDataMahasiswa() {
        System.out.println("\nDetail Mahasiswa:");
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur + " tahun");
    }

    public static void tampilUniversitas() {
        System.out.println("\nUniversitas Muhammadiyah Malang");
    }
}