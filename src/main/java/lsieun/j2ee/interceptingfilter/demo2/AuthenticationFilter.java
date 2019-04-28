package lsieun.j2ee.interceptingfilter.demo2;

class AuthenticationFilter implements Filter {
    public void execute(String request){
        System.out.println("Authenticating request: " + request);
    }
}
