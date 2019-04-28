package lsieun.j2ee.compositeentity.demo2;

public class CompositeEntityPatternDemo {
    public static void main(String[] args) {

        Client client = new Client();
        client.setData("Test", "Data");
        client.printData();
        System.out.println("======================");
        client.setData("Second Test", "Second Data");
        client.printData();
    }
}
