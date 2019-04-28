package lsieun.j2ee.frontcontroller.demo2;

public class FrontControllerPatternDemo {
    public static void main(String[] args) {

        FrontController frontController = new FrontController();
        frontController.dispatchRequest("HOME");
        System.out.println();
        frontController.dispatchRequest("STUDENT");
    }
}
