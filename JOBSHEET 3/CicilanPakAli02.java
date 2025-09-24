import java.util.Scanner;

public class CicilanPakAli02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input data
        System.out.print("Masukkan harga motor (Rp): ");
        double hargaMotor = input.nextDouble();

        System.out.print("Masukkan uang muka (Rp): ");
        double uangMuka = input.nextDouble();

        System.out.print("Masukkan lama cicilan (bulan): ");
        int lamaCicilan = input.nextInt();

        // Validasi
        if (hargaMotor <= 0 || uangMuka < 0 || lamaCicilan <= 0 || uangMuka >= hargaMotor) {
            System.out.println("Input tidak valid. Harap masukkan nilai yang benar.");
        
        }

        // Hitung sisa cicilan
        double sisa = hargaMotor - uangMuka;

        // Hitung bunga tetap total
        double bungaTotal = sisa * 0.01 * lamaCicilan;

        // Total cicilan yang harus dibayar
        double totalCicilan = sisa + bungaTotal;

        // Cicilan per bulan
        double cicilanPerBulan = totalCicilan / lamaCicilan;

        // Tampilkan hasil
        System.out.printf("Jumlah cicilan per bulan yang harus dibayar Pak Ali adalah: Rp %.2f\n", cicilanPerBulan);

        input.close();
    }
}
