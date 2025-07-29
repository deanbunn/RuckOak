package net.ruckoak;

public class Main {
    public static void main(String[] args) {
        
        int nBiggy = 200;

        String sMsg = (nBiggy > 500) ? "Big Money!" : "Little Money :(";

        String sMsg2 = (nBiggy <= 45) ? "Not that much at all" : "Enough to ride out";

        System.out.println(sMsg);
        
        System.out.println(sMsg2);
    }
}