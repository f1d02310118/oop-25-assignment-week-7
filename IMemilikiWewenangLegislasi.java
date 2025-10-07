// Interface digunakan untuk mendefinisikan kontrak perilaku
// yang harus diimplementasikan oleh kelas yang "memiliki wewenang legislasi".
// Dalam hal ini, Presiden memiliki kewenangan untuk mengajukan RUU (Rancangan Undang-Undang).
public interface IMemilikiWewenangLegislasi {
    // Method abstrak (tanpa isi) yang wajib diimplementasikan oleh kelas yang menggunakannya.
    void mengajukanRUU();    
}
