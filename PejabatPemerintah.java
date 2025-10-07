// Abstract class ini berfungsi sebagai "template umum" bagi semua pejabat pemerintah.
// Tidak bisa dibuat objek langsung dari kelas ini.
// Kelas turunan (seperti Presiden dan Menteri) wajib mengimplementasikan metode abstraknya.
public abstract class PejabatPemerintah {
    // Protected agar bisa diakses oleh kelas turunan.
    protected String nama;
    protected String jabatan;
    protected int masaJabatan;

    // Constructor untuk inisialisasi atribut umum.
    public PejabatPemerintah(String nama, String jabatan, int masaJabatan) {
        this.nama = nama;
        this.jabatan = jabatan;
        this.masaJabatan = masaJabatan;
    }

    // Method konkrit (dapat langsung digunakan oleh kelas turunan).
    public void displayInfo() {
        IO.println("Nama: " + nama);
        IO.println("Jabatan: " + jabatan);
        IO.println("Masa Jabatan: " + masaJabatan + " tahun");
    }

    // Method abstrak: harus diimplementasikan di setiap kelas turunan.
    public abstract void membuatKebijakan();
    public abstract void memberikanLaporan();
}
