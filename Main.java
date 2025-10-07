// Kelas Main berfungsi sebagai titik awal (entry point) program.
// Di sinilah objek-objek dibuat dan konsep OOP seperti polymorphism dan array of object dijalankan.
public class Main {
    public static void main(String[] args) {

        // Membuat tiga objek Menteri (instansiasi kelas turunan dari PejabatPemerintah).
        Menteri menteri1 = new Menteri("Purbaya Yudhi Sadewa", "Menteri Keuangan", 5, "Kementerian Keuangan");
        Menteri menteri2 = new Menteri("Sjafrie Sjamsoeddin", "Menteri Pertahanan", 5, "Kementerian Pertahanan");
        Menteri menteri3 = new Menteri("Budi Gunadi Sadikin", "Menteri Kesehatan", 5, "Kementerian Kesehatan");

        // Array of Object → menyimpan beberapa objek Menteri dalam satu variabel.
        Menteri[] daftarMenteri = {menteri1, menteri2, menteri3};

        // Membuat objek Presiden (juga turunan dari PejabatPemerintah dan implementasi interface).
        Presiden presiden = new Presiden("Prabowo Subianto", 5, "Mengangkat dan memberhentikan menteri");

        // Presiden membentuk kabinet dengan daftar menteri yang sudah dibuat.
        presiden.bentukKabinet(daftarMenteri);

        // ======= Demonstrasi Polymorphism dan Override =======
        IO.println("\n=== Informasi Presiden ===");
        presiden.displayInfo(); // Memanggil versi displayInfo() milik Presiden.

        IO.println("\n=== Aktivitas Presiden ===");
        presiden.membuatKebijakan();  // Override dari PejabatPemerintah.
        presiden.mengajukanRUU();     // Dari interface IMemilikiWewenangLegislasi.
        presiden.memberikanLaporan(); // Override dari PejabatPemerintah.

        IO.println("\n=== Informasi Menteri ===");
        // Loop melalui array objek Menteri (contoh nyata Array of Object + Polymorphism)
        for (Menteri m : daftarMenteri) {
            m.displayInfo();        // Memanggil versi method dari Menteri.
            m.membuatKebijakan();   // Override method abstrak.
            m.memberikanLaporan();  // Override method abstrak.
            IO.println();
        }
    }
}
