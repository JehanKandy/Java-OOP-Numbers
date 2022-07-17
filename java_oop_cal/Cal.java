package java_oop_cal;
class Cal {
    public static void main(String[] args) {
        number getnumbers = new number();
        System.out.print("Total is = " + (getnumbers.num1 + getnumbers.num2)  + "\n");
        System.out.print("Sub is = " + (getnumbers.num1 - getnumbers.num2) + "\n");
        System.out.print("Product is = " + (getnumbers.num1 * getnumbers.num2) + "\n");
        System.out.print("Divition is = " + (getnumbers.num1 / getnumbers.num2) + "\n");
    }   
}
