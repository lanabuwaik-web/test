import java.util.Scanner;
public class nestedUjianSkripsi02 {
    public static void main(String[] args) {
        String pesan;
        Scanner sc = new Scanner(System.in);
        System.out.println("Apakah mahasiswa sudah bebas kompen? (ya/tidak)");
        String bebasKompen = sc.nextLine().trim();
        System.out.println("Masukkan jumlah log bimbingan pembimbing 1");
        int bimbinganp1 = sc.nextInt();
        System.out.println("Masukkan jumlah log bimbingan pembimbing 2");
        int bimbinganp2 = sc.nextInt();

        if (bebasKompen.equalsIgnoreCase("ya")) {
            if (bimbinganp1 >= 8 && bimbinganp2 >= 4) {
                pesan = "Semua syarat terpenuhi. Mahasiswa boleh mendaftar ujian skripsi";
            } else if (bimbinganp1 < 8 && bimbinganp2 < 4) {
                pesan = "Gagal log bimbingan p1 kurang dari 8 kali dan p2 kurang dari 4 kali";
            } else if (bimbinganp1 < 8) {
                pesan = "Gagal log bimbingan p1 kurang dari 8 kali";
            } else {
                pesan = "Gagal log bimbingan p2 kurang dari 4 kali";
            }
        } else {
            pesan = "Gagal! Mahasiswa masih memiliki tanggungan kompen";
        }
    }
    
}
