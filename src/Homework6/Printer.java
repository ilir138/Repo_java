package Homework6;

public class Printer {

    private static int toner;
    private static int pages;


public void addPages (int pCount) {
    if (pCount < 0 || pCount > 100) {
        System.out.println("Pages must be below 100");
    } else {
        pages = pCount;
    }
}
public void addToner (int tCount){
        if (tCount< 0 || tCount> 100) {
            System.out.println("Pages must be below 100");
        } else {
            toner = tCount;
        }
    }

public void print (int singleSided, int doubleSided) {
    toner = toner - doubleSided;
    pages = pages - (doubleSided / 2);
    toner = toner - singleSided;
    pages = pages - singleSided;

}
    public int checkPrinter() {
        if (toner <= 10) {
            System.out.println("Add Toner");
        }
        return toner;
    }

public String printerSummary(){

        String tonerLevel = "Toner level: " + toner + ".";
        String pagesCount = " Pages count in tray: " + pages;
        String summery = tonerLevel + pagesCount;
        return summery;
    }

}


