package lsieun.pattern.observer.demo2;

abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
