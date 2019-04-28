package lsieun.j2ee.interceptingfilter.demo2;

class Target {
    public void execute(String request){
        System.out.println("Executing request: " + request);
    }
}
