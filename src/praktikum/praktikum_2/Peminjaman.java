package praktikum.praktikum_2;

/*
|--------------------------------------------------------------------------
| Peminjaman Class
|--------------------------------------------------------------------------
|
| Create Peminjaman Class.
| @author Yudas Malabi
|
*/
public class Peminjaman {

    public int id;
    public String namaMember;
    public String namaGame;
    public int lamaSewa;
    public double hargaBayar;

    public void tampilPeminjaman() {
        System.out.println("==========================================");
        System.out.println("Peminjaman");
        System.out.println("Id          : " + this.id);
        System.out.println("Nama Member : " + this.namaMember);
        System.out.println("Nama Game   : " + this.namaGame);
        System.out.println("Lama Sewa   : " + this.lamaSewa);
        System.out.println("Harga Bayar : " + this.hargaBayar);
        System.out.println("==========================================");
    }

    public double hitungTotal(int lamaSewa, double harga) {
        return lamaSewa * harga;
    }

}
