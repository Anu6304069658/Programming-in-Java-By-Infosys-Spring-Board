class MovieTicket {
    private int movieId;
    private int noOfSeats;
    private double costPerTicket;

    public MovieTicket(int movieId, int noOfSeats) {
        this.movieId = movieId;
        this.noOfSeats = noOfSeats;
    }

    public double calculateTotalAmount() {

        if (movieId == 111) {
            costPerTicket = 7.0;
        } else if (movieId == 112) {
            costPerTicket = 8.0;
        } else if (movieId == 113) {
            costPerTicket = 8.5;
        } else {
            costPerTicket = 0;
        }
        double total = costPerTicket * noOfSeats ;
        double tax=total*0.02;
        double finalAmount=total+tax;
        return Math.round(finalAmount * 100.0) / 100.0;
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public int getNoOfSeats() {
        return noOfSeats;
    }

    public void setNoOfSeats(int noOfSeats) {
        this.noOfSeats = noOfSeats;
    }

    public double getCostPerTicket() {
        return costPerTicket;
    }

    public void setCostPerTicket(double costPerTicket) {
        this.costPerTicket = costPerTicket;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        MovieTicket movieTicket = new MovieTicket(112, 3);
        double amount = movieTicket.calculateTotalAmount();
        if (amount == 0)
            System.out.println("Sorry! Please enter valid movie Id and number of seats");
        else
            System.out.println("Total amount for booking : $" + amount);
    }
}
