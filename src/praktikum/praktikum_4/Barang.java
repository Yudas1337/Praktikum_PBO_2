package praktikum.praktikum_4;

/*
|--------------------------------------------------------------------------
| Barang Class
|--------------------------------------------------------------------------
|
| Create Barang Class.
| @author Yudas Malabi
|
*/
public class Barang {

    public String kode;
    public String namaBarang;
    public int hargaDasar;
    public float diskon;

    public int hitungHargaJual(float diskon, int hargaDasar) {
        return (int) (hargaDasar - (diskon / 100 * hargaDasar));
    }

    public void tampilData() {
        System.out.println("Kode            : " + this.kode);
        System.out.println("Nama Barang     : " + this.namaBarang);
        System.out.println("Harga Dasar     : " + this.hargaDasar);
        System.out.println("Diskon          : " + this.diskon);
        System.out.println("Harga Jual      : " + this.hitungHargaJual(this.diskon, this.hargaDasar));
    }

}
