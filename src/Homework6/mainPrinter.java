package Homework6;

public class mainPrinter {
    public static void main(String[] args) {
        Printer p1 = new Printer();
        p1.addPages(100);
        p1.addToner(100);
        Printer p2 = new Printer();
        p1.print(8,2);
        System.out.println(p1.printerSummary());
        p2.print(81,0);
        System.out.println(p2.printerSummary());
    }

}
