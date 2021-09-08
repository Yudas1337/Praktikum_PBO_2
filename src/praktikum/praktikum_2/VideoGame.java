package praktikum.praktikum_2;

/*
|--------------------------------------------------------------------------
| VideoGame Class
|--------------------------------------------------------------------------
|
| Create VideoGame Class.
| @author Yudas Malabi
|
*/
public class VideoGame {

    public int id;
    public String namaGame;
    public double harga;

    public void tampilGame() {
        System.out.println("==========================================");
        System.out.println("Video Game");
        System.out.println("==========================================");
        System.out.println("Id          : " + this.id);
        System.out.println("Nama Game   : " + this.namaGame);
        System.out.println("Harga Game  : " + this.harga);
        System.out.println("==========================================");

    }

}
