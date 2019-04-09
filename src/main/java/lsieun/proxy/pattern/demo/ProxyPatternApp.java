package lsieun.proxy.pattern.demo;

public class ProxyPatternApp {
    public static void main(String[] args) {
        System.out.println("***Proxy Pattern Demo***\n");
        Proxy px = new Proxy();
        px.doSomeWork();
    }
}
