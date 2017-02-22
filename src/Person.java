import java.util.Scanner;

/**
 * Created by MyPC on 15/02/2017.
 */
public class Person {
    String name;
    String gioitinh;
    String ngaysinh;
    String diachi;
     Person()
     {
         name="nguyen manh quyen";
         gioitinh="nam";
         ngaysinh="22/3/1995";
         diachi="bk ha noi";
     }
     public void inputInfo()
     {
         Scanner input= new Scanner(System.in);
         System.out.println("nhap thong tin");
         System.out.println("nhap vao ten");
         input.nextLine();
         name=input.nextLine();
         System.out.println("nhap vao dia chi");
         input.nextLine();
         diachi=input.nextLine();
         System.out.println("nhap vao gioi tinh");
         input.nextLine();
         gioitinh=input.nextLine();
         System.out.println("nhap vao ngay sinh");
         input.nextLine();
         ngaysinh=input.nextLine();
     }
     public void showInfo()
     {
         System.out.println("Ten "+name);
         System.out.println("Gio tinh "+gioitinh);
         System.out.println("Ngay sinh "+ngaysinh);
         System.out.println("Dia chi "+diachi);

     }
    public void setName(String name ){this.name=name;}
    public String getName(){return(name);}
    public void setGioTinh(String gioitinh ){this.gioitinh=gioitinh;}
    public String getGioiTinh(){return(gioitinh);}
    public void setNgaysinh(String ngaysinh ){this.ngaysinh=ngaysinh;}
    public String getNgaysinh(){return(ngaysinh);}
    public void setDiachi(String diachi ){this.diachi=diachi;}
    public String getDiachi(){return(diachi);}
    public static void main(String[] args)
    {
        Student hocsinh =new Student("20133190", 7,"manhquyen@gmail.com");
        //hocsinh.showInfo();
        //hocsinh.xethocbong();
        Student1 hocsinh1 = new Student1();
        hocsinh1.printInfo();
        hocsinh1.printsomeInfo();
    }

}
class Student extends Person{
    private String mssv;
    float diem;
    String mail;
    Student()
    {
        super();
        mssv="20133190";
        diem=9;
        mail="quyen@gmail.com";
    }
    Student(String mssv,float diem,String mail){
        super();
        this.diem=diem;
        this.mssv=mssv;
        this.mail=mail;

    }
     @Override public void showInfo(){
        super.showInfo();
        System.out.println("Diem "+diem);
        System.out.println("mssv "+mssv);
        System.out.println("mail "+mail);

    }

    @Override public void inputInfo(){
        Scanner input = new Scanner(System.in);
        super.inputInfo();
        System.out.println("nhap vao mssv ");
        mssv=input.nextLine();
        System.out.println("nhap vao diem ");
        diem=input.nextFloat();
        System.out.println("nhap vao mail ");
        mail=input.nextLine();
    }
    public void xethocbong(){
        if(this.diem>8)
        {
            System.out.print("Duoc hoc bong");
        }
        else System.out.print("K dc hoc bong");
    }
}
class Student1 implements Interface2{
    public void printsomeInfo()
    {
        System.out.println("thuc hien interface 2");
    }
    public void printInfo(){
        System.out.println("thuc hien interface");
    }

}
