
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }

    public int getRooms() {
        return rooms;
    }

    public int getSquares() {
        return squares;
    }

    public int getPrincePerSquare() {
        return princePerSquare;
    }

    public boolean largerThan(Apartment apt) {
        return this.getSquares() > apt.getSquares();
    }

    public int priceDifference(Apartment apt) {
        int difference = (this.princePerSquare * this.squares) - (apt.getPrincePerSquare() * apt.getSquares());

        if (difference < 0) {
            return difference * -1;
        }
        return difference;
    }

    public boolean moreExpensiveThan(Apartment apt) {
        int currentPrice = this.princePerSquare * this.squares;
        int comparePrice = apt.getPrincePerSquare() * apt.getSquares();

        return currentPrice > comparePrice;
    }



}
