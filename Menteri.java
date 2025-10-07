public class Menteri extends PejabatPemerintah {
    private String namaKementrian;

    public Menteri(String nama, String jabatan, int masaJabatan, String namaKementrian) {
        this.namaKementrian = namaKementrian;
        super(nama, jabatan, masaJabatan);
    }

    @Override
    public void membuatKebijakan() {
        IO.println("Menteri " + nama + " membuat kebijakan di Kementerian " + namaKementrian + ".");
    }

    @Override
    public void memberikanLaporan() {
        IO.println("Menteri " + nama + " memberikan laporan tahunan kepada Presiden.");
    }

    @Override
    public void displayInfo() {
        IO.println("Kementerian: " + namaKementrian);
        super.displayInfo();
    }

    public String getNamaKementerian() {
        return namaKementrian;
    }
}