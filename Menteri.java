// Kelas Menteri mewarisi (extends) PejabatPemerintah
// sehingga mendapatkan semua atribut dan method non-abstrak dari kelas induknya.
public class Menteri extends PejabatPemerintah {
    private String namaKementrian;

    // Constructor kelas Menteri memanggil constructor superclass (PejabatPemerintah)
    // menggunakan 'super' untuk menginisialisasi atribut warisan.
    public Menteri(String nama, String jabatan, int masaJabatan, String namaKementrian) {
        super(nama, jabatan, masaJabatan); // HARUS diletakkan di baris pertama.
        this.namaKementrian = namaKementrian;
    }

    // Override: implementasi khusus method abstrak dari PejabatPemerintah.
    @Override
    public void membuatKebijakan() {
        IO.println("Menteri " + nama + " membuat kebijakan di Kementerian " + namaKementrian + ".");
    }

    // Override method abstrak kedua.
    @Override
    public void memberikanLaporan() {
        IO.println("Menteri " + nama + " memberikan laporan tahunan kepada Presiden.");
    }

    // Override displayInfo untuk menambah informasi kementerian, lalu memanggil versi superclass.
    @Override
    public void displayInfo() {
        IO.println("Kementerian: " + namaKementrian);
        super.displayInfo(); // Memanggil method displayInfo() milik PejabatPemerintah.
    }

    // Getter untuk mengakses nama kementerian secara aman.
    public String getNamaKementerian() {
        return namaKementrian;
    }
}
