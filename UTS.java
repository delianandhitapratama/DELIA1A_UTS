 import java.util.Scanner;

    public class UTS {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Deklarasi variabel untuk menyimpan data transaksi
            String[] kodeBarang = new String[10];
            String[] namaBarang = new String[10];
            int[] qty = new int[10];
            double[] harga = new double[10];
            double[] total = new double[10];
            double totalInvoice = 0;

            // Input data transaksi
            System.out.println("Masukkan data transaksi penjualan:");
            for (int i = 0; i < 10; i++) {
                inputDataTransaksi(i, scanner, kodeBarang, namaBarang, qty, harga, total);
                totalInvoice += total[i];
            }

            // Menampilkan hasil transaksi
            tampilkanTransaksi(kodeBarang, namaBarang, qty, harga, total, totalInvoice);

            // Menutup scanner
            scanner.close();
        }

        private static void inputDataTransaksi(int index, Scanner scanner, String[] kodeBarang, String[] namaBarang, int[] qty, double[] harga, double[] total) {
            System.out.println("Produk ke-" + (index + 1));
            System.out.print("Kode Barang: ");
            kodeBarang[index] = scanner.next();
            System.out.print("Nama Barang: ");
            namaBarang[index] = scanner.next();
            System.out.print("Qty: ");
            qty[index] = scanner.nextInt();
            System.out.print("Harga: ");
            harga[index] = scanner.nextDouble();

            // Menghitung total per item
            total[index] = qty[index] * harga[index];
        }

        private static void tampilkanTransaksi(String[] kodeBarang, String[] namaBarang, int[] qty, double[] harga, double[] total, double totalInvoice) {
            // Menampilkan hasil transaksi
            System.out.println("\nTransaksi Penjualan:");
            System.out.printf("%-15s %-15s %-10s %-15s %-15s\n", "Kode Barang", "Nama Barang", "Qty", "Harga", "Total");
            for (int i = 0; i < 10; i++) {
                System.out.printf("%-15s %-15s %-10d %-15.2f %-15.2f\n", kodeBarang[i], namaBarang[i], qty[i], harga[i], total[i]);
            }
            System.out.println("Total Invoice: " + totalInvoice);
        }
    }


