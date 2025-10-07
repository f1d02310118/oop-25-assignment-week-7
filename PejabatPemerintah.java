public abstract class PejabatPemerintah {
    protected String nama;
    protected String jabatan;
    protected int masaJabatan;

    public PejabatPemerintah(String nama, String jabatan, int masaJabatan) {
        this.nama = nama;
        this.jabatan = jabatan;
        this.masaJabatan = masaJabatan;
    }

    public void displayInfo() {
        IO.println("Nama: " + nama);
        IO.println("Jabatan: " + jabatan);
        IO.println("Masa Jabatan: " + masaJabatan + " tahun");
    }

    public abstract void membuatKebijakan();
    public abstract void memberikanLaporan();
}