package topic_7_object_oriented_programming.TireShoppingComparison;

public class Tire implements Comparable<Tire> {

    // instance variables
    private String name;
    private double price;
    private int warrantyMiles;

    // constructor method
    public Tire(String name, double price, int warrantyMiles) {
        this.name = name; // this keyword is required because of ambiguity
        this.price = price;
        this.warrantyMiles = warrantyMiles;
    }

    public double pricePerThousandMiles() {
        double pricePer1000 = ( this.price / this.warrantyMiles ) * 1000;
        return pricePer1000;
    }

    public double costForSet() {
        return this.price * 4;
    }

    @Override // override default toString method
    public String toString() { // toString method to print object data
        double pricePer1000 = pricePerThousandMiles();
        return String.format("%s costs $%.2f per tire. " +
                        "Cost per 1000 miles is $%.2f.",
                this.name, this.price, pricePer1000);
        //return "This tire is called " + this.name;
    }

    @Override
    public int compareTo(Tire otherTire) {
        return Double.compare(this.pricePerThousandMiles(), otherTire.pricePerThousandMiles());
        /*
        The line above does this:
        if (pricePer1000Miles() > otherTire.pricePer1000Miles()) {
            return 1;
        } else if (pricePer1000Miles() < otherTire.pricePer1000Miles()) {
            return -1;
        } else {
            return 0;
        }
        */
        // sort by name
        //return this.name.compareTo(otherTire.name);
    }

}
