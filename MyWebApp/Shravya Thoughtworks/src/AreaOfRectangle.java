import java.util.Scanner;

class Rectangle{
    private int length;
    private int breadth;

    public Rectangle(int length,int breadth){
        this.length=length;
        this.breadth=breadth;
    }
    public int area(){
        return this.length*this.breadth;
    }
}

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int length=sc.nextInt(), breadth = sc.nextInt();
        Rectangle rectangle = new Rectangle(length,breadth);
        System.out.println(rectangle.area());
    }
}
