package testyJednostkowe;

public class Range {

    private final int upperBound;
    private final int lowerBound;

    public Range (int lowerBound, int upperBound) {

        if (lowerBound>upperBound) {
            throw new IllegalArgumentException ("lower bound should be lower") ;
        }

        this.upperBound = upperBound;
        this.lowerBound = lowerBound;
    }

    public boolean isInRange (int number) {
        return number <= upperBound && number >= lowerBound;



    }

    public  void inRangePrint (int number) {

        boolean inRange;

        if (number >= lowerBound && number <= upperBound) {
            inRange = true;
            System.out.println("Numer w zakresie");
        } else {
            inRange = false;
            System.out.println("Numer poza zakresem");
        }
    }


}
