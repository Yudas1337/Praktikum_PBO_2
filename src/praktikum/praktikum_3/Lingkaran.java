package praktikum.praktikum_3;

/*
|--------------------------------------------------------------------------
| Lingkaran Class
|--------------------------------------------------------------------------
|
| Create Lingkaran Class.
| @author Yudas Malabi
|
*/
public class Lingkaran {

    public double phi, r;

    public double hitungLuas(double phi, double r) {
        return phi * r * r;
    }

    public double hitungKeliling(double phi, double r) {
        return 2 * phi * r;
    }

}
