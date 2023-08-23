public class StaticDemo {
    public static void main(String[] args) {
        Abcd stu=new Abcd();

        stu.a=100;
        stu.b=200;
        stu.print();


        Abcd.display();             //Due To the Static Type it is Accessible.
    }
}
