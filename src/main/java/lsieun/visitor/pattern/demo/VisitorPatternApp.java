package lsieun.visitor.pattern.demo;

public class VisitorPatternApp {
    public static void main(String[] args) {
        System.out.println("***Visitor Pattern Demo***\n");
        IVisitor v = new Visitor();
        MyClass myClass = new MyClass();
        myClass.accept(v);
    }
}
