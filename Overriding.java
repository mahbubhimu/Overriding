class Parent{
    void display(){
        System.out.println("Parent");
    }
    void print(){
        System.out.println("Parent Print Method");
    }
}
class Child extends Parent{
    @Override
    void display(){
        System.out.println("Child");
    }
}
public class Demo{
    public static void main(String[] args) {
        Child objChild = new Child();
        objChild.display();
        //Parent method will be called
        objChild.print();
    }
}
