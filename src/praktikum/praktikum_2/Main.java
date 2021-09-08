package praktikum.praktikum_2;

/*
|--------------------------------------------------------------------------
| Main Class
|--------------------------------------------------------------------------
|
| Create Main Class.
| @author Yudas Malabi
|
*/
public class Main {

    public static void main(String[] args) {
        VideoGame videoGame = new VideoGame();
        Member member = new Member();
        Peminjaman peminjaman = new Peminjaman();

        videoGame.id = 1;
        videoGame.namaGame = "Counter Strike";
        videoGame.harga = 20000;
        videoGame.tampilGame();
        System.out.println();

        member.id = 1;
        member.namaMember = "Yudas Malabi";
        member.tampilMember();
        System.out.println();

        peminjaman.id = 1;
        peminjaman.namaMember = member.namaMember;
        peminjaman.namaGame = videoGame.namaGame;
        peminjaman.lamaSewa = 3;
        peminjaman.hargaBayar = peminjaman.hitungTotal(peminjaman.lamaSewa, videoGame.harga);
        peminjaman.tampilPeminjaman();

    }

}
