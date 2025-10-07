public class Main {
    public static void main(String[] args) {
        Menteri menteri1 = new Menteri("Purbaya Yudhi Sadewa", "Menteri Keuangan", 5, "Kementerian Keuangan");
        Menteri menteri2 = new Menteri("Sjafrie Sjamsoeddin", "Menteri Pertahanan", 5, "Kementerian Pertahanan");
        Menteri menteri3 = new Menteri("Budi Gunadi Sadikin", "Menteri Kesehatan", 5, "Kementerian Kesehatan");

        Menteri[] daftarMenteri = {menteri1, menteri2, menteri3};

        Presiden presiden = new Presiden("Prabowo Subianto", 5, "Mengangkat dan memberhentikan menteri");

        presiden.bentukKabinet(daftarMenteri);

        IO.println("\n=== Informasi Presiden ===");
        presiden.displayInfo();

        IO.println("\n=== Aktivitas Presiden ===");
        presiden.membuatKebijakan();
        presiden.mengajukanRUU();
        presiden.memberikanLaporan();

        IO.println("\n=== Informasi Menteri ===");
        for (Menteri m : daftarMenteri) {
            m.displayInfo();
            m.membuatKebijakan();
            m.memberikanLaporan();
            IO.println();
        }
    }
}