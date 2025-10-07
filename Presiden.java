// Kelas Presiden merupakan turunan (child class) dari PejabatPemerintah
// dan juga mengimplementasikan interface IMemilikiWewenangLegislasi.
// Contoh dari konsep: Inheritance + Interface Implementation dalam satu kelas.
public class Presiden extends PejabatPemerintah implements IMemilikiWewenangLegislasi {
    private String hakPreogratif;
    private Menteri[] kabinet; // Array of Object → menyimpan kumpulan objek Menteri.

    // Constructor: memanggil constructor superclass untuk inisialisasi atribut umum.
    public Presiden(String nama, int masaJabatan, String hakPreogratif) {
        super(nama, "Presiden", masaJabatan);
        this.hakPreogratif = hakPreogratif;
        this.kabinet = new Menteri[0]; // Inisialisasi array kosong.
    }

    // Override dari method abstrak membuatKebijakan().
    @Override
    public void membuatKebijakan() {
        IO.println("Presiden " + nama + " menetapkan kebijakan nasional.");
    }

    // Override dari method abstrak memberikanLaporan().
    @Override
    public void memberikanLaporan() {
        IO.println("Presiden " + nama + " memberikan laporan tahunan kepada rakyat.");
    }

    // Implementasi method dari interface IMemilikiWewenangLegislasi.
    @Override
    public void mengajukanRUU() {
        IO.println("Presiden " + nama + " mengajukan rancangan undang-undang ke DPR.");
    }

    // Method untuk membentuk kabinet berisi array objek Menteri.
    // Contoh penggunaan array of object di OOP Java.
    public void bentukKabinet(Menteri[] paraMenteri) {
        this.kabinet = paraMenteri;
        IO.println("Kabinet telah dibentuk dengan " + paraMenteri.length + " menteri.");
    }

    // Override displayInfo untuk menampilkan data Presiden beserta daftar menterinya.
    @Override
    public void displayInfo() {
        IO.println("Nama Presiden: " + nama);
        IO.println("Hak Preogratif: " + hakPreogratif);
        IO.println("Jumlah Menteri: " + kabinet.length);

        // Menampilkan daftar seluruh objek Menteri di kabinet.
        if (kabinet.length > 0) {
            IO.print("\n=== Daftar Menteri ===\n");
            for (Menteri m : kabinet) {
                IO.println("- " + m.nama + " (" + m.jabatan + " di " + m.getNamaKementerian() + ")");
            }
        }
    }

    // Getter untuk mengakses array kabinet.
    public Menteri[] getKabinet() {
        return kabinet;
    }
}
