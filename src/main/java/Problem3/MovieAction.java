package Problem3;

public class MovieAction extends Movie {

    private int lateFeePerDayInDollar = 5;

    public MovieAction(String rating, String title) {
        // homework
        // tip: use the 'super' keyword
        super(rating, title);
    }

    public MovieAction(MovieAction anotherMovie) {
        // homework
        // tip: use the 'super' keyword
        super(anotherMovie);
    }

    @Override
    public int getLateFeeInDollar() {
        return lateFeePerDayInDollar;
    }

    @Override
    public int calcLateFees(int numOfDaysPastDue) {
        // homework
        if (numOfDaysPastDue <= 0){
            return 0;
        }
        if(0 < numOfDaysPastDue && numOfDaysPastDue < 5){
            return numOfDaysPastDue * 5;
        }
        else{
            return 2 * (numOfDaysPastDue * 5);
        }
    }
}
