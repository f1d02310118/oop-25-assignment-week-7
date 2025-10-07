public class Presiden extends PejabatPemerintah implements IMemilikiWewenangLegislasi {
    private String hakPreogratif;
    private Menteri kabinet[];

    public Presiden(String nama, int masaJabatan, String hakPreogratif) {
        this.hakPreogratif = hakPreogratif;
        this.kabinet = new Menteri[0];
        super(nama, "Presiden", masaJabatan);
    }

    @Override
    public void membuatKebijakan() {
        IO.println("Presiden " + nama + " menetapkan kebijakan nasional.");
    }

    @Override
    public void memberikanLaporan() {
        IO.println("Presiden " + nama + " memberikan laporan tahunan kepada rakyat.");
    }

    @Override
    public void mengajukanRUU() {
        IO.println("Presiden " + nama + " mengajukan rancangan undang-undang ke DPR.");
    }

    public void bentukKabinet(Menteri paraMenteri[]) {
        this.kabinet = paraMenteri;
        IO.println("Kabinet telah dibentuk dengan " + paraMenteri.length + " menteri.");
    }

    @Override
    public void displayInfo() {
        IO.println("Nama Presiden: " + nama);
        IO.println("Hak Preogratif: " + hakPreogratif);
        IO.println("Jumlah Menteri: " + kabinet.length);
        if (kabinet.length > 0) {
            IO.print("\n=== Daftar Menteri ===\n");
            for (Menteri m : kabinet) {
                IO.println("- " + m.nama + " (" + m.jabatan + " di " + m.getNamaKementerian() + ")");
            }
        }
    }

    public Menteri[] getKabinet() {
        return kabinet;
    }
}