package lsieun.j2ee.interceptingfilter.demo2;

class DebugFilter implements Filter {
    public void execute(String request){
        System.out.println("request log: " + request);
    }
}
