package Homework6;

public class Printer {

    private static int toner;
    private static int pages;


public void addPages (int pCount) {
    if (pCount>0 && pCount<=100) {
        if (pCount + pages <= 100) {
            pages = pCount + pages;
        } else {
            System.out.println("Pages added over printer capacity");
        }
    }else {
        System.out.println("Invalid pages to add");
    }

}
public void addToner (int tCount){
    if (tCount>0 && tCount<=100) {
        if (tCount + toner <= 100) {
            toner = tCount + toner;
        } else {
            System.out.println("Toner added over printer capacity");
        }
    }else {
        System.out.println("Invalid toner to add");
    }
}

public void print (int singleSided, int doubleSided) {

     if (doubleSided % 2 == 0) {
         toner = toner - doubleSided;
         pages = pages - (doubleSided / 2);
     } else {
         pages = pages - (doubleSided / 2 + 1);
         toner = toner - doubleSided;
     }

         toner = toner - singleSided;
         pages = pages - singleSided;

 }


 public int checkToner() {


        if (toner <= 10) {
            System.out.println("Add Toner");
        }

        return toner;
    }

public String printerSummary(){

        String tonerLevel = "Toner level: " + toner;
        String pagesCount = "\nPages count in tray: " + pages;
        String summery = tonerLevel + pagesCount;
        return summery;
    }

}


