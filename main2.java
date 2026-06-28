class main2{
    public static void main(String[] args) {
        
        int a = 10;
        int b = 5;
        System.out.println("Guess the Answer");

        System.out.println("Urinary Operator" + (a++));
        System.out.println("Urinary Operator" + (b++));
        System.out.println("Binary Operator");
        System.out.println("1 + 2" + 1 + 2);
        System.out.println("1 + 2" + (1 + 2));
        System.out.println(1 + 2 + "= 3");
        int increment = ++a * b++;
        System.out.println(increment);
        System.out.println("Ternary Operator");
        int largestNumber = (a > b) ? a : b;
        System.out.println("Largest of two numbers: " + largestNumber);
    }
}