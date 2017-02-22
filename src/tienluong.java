import javax.rmi.CORBA.Tie;
import java.util.Scanner;

/**
 * Created by MyPC on 12/02/2017.
 */
public class tienluong {
    String Ten;
    int Tuoi;
    String Diachi;
    double Tienluong;
    int Tonggiolam;
    tienluong () {
        System.out.println("ham tao bat dau ..");
        Ten="Nguyen Manh Quyen";
        Tuoi=21;
        Diachi = "100 pho cho ";
        Tienluong=1000;
        Tonggiolam=1;

    }
    tienluong (String Ten,int Tuoi,String Diachi,double Tienluong,int Tonggiolam)
    {
        this();
        this.Ten=Ten;
        this.Tuoi=Tuoi;
        this.Diachi=Diachi;
        this.Tienluong= Tienluong;
        this.Tonggiolam=Tonggiolam;
    }
    public void inputInfo()
    {
        Scanner input= new Scanner(System.in);
        System.out.println("nhap thong tin ");
        System.out.println("nhap ho ten : ");
        input.nextLine();
        Ten=input.nextLine();
        System.out.println("nhap tuoi : ");
        Tuoi=input.nextInt();
        System.out.println("nhap dia chi  : ");
        input.nextLine();
        Diachi=input.nextLine();
        System.out.println("nhap tien luong : ");
        Tienluong=input.nextDouble();
        System.out.println("nhap tong gio lam : ");
        Tonggiolam=input.nextInt();
    }
    public void outputInfo()
    {
        System.out.println("Ho ten :" + Ten);
        System.out.println("Tuoi :" + Tuoi);
        System.out.println("Dia chi :" + Diachi);
        System.out.println("Tien luong :" + Tienluong);
        System.out.println("Tong gio lam :" + Tonggiolam);


    }
      void getName ()
    {

        System.out.print("Ho ten : "+ Ten);
    }
    public void getAge ()
    {
        System.out.print("Tuoi : "+ Tuoi);
    }
     static class kt extends dateandtime{

    }
    /*public static void main (String[] args)
    {
        tienluong tl = new tienluong("quyen",21,"bac ninh",1000,1);
        kt kethua =new kt();
        kethua.thoigian();

    } */
}


