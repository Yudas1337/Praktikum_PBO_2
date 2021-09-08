package praktikum.praktikum_2;

/*
|--------------------------------------------------------------------------
| Member Class
|--------------------------------------------------------------------------
|
| Create Member Class.
| @author Yudas Malabi
|
*/
public class Member {

    public int id;
    public String namaMember;

    public void tampilMember() {
        System.out.println("==========================================");
        System.out.println("Member");
        System.out.println("==========================================");
        System.out.println("Id              : " + this.id);
        System.out.println("Nama Member     : " + this.namaMember);
        System.out.println("==========================================");

    }

}
