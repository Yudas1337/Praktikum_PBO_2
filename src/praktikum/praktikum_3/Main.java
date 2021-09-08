package praktikum.praktikum_3;

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
        Lingkaran obj1 = new Lingkaran();
        obj1.phi = 3.14;
        obj1.r = 14;

        System.out.println("Luas Lingkaran adalah       : " + obj1.hitungLuas(obj1.phi, obj1.r));
        System.out.println("Keliling Lingkaran adalah   : " + obj1.hitungKeliling(obj1.phi, obj1.r));
    }

}
