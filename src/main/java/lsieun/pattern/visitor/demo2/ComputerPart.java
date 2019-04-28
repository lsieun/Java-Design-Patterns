package lsieun.pattern.visitor.demo2;

interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
}
