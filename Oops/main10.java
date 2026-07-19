class Parent {
    protected void protect() {
        System.out.println("I'm inside protected method");
    }
}

class child extends Parent {
    private void privateMethod() {
        System.out.println("I'm inside private method");
    }
}

class main10 {
    public static void main(String[] args) {
        child kid = new child();
        System.out.println("Hello World!");
    }
}