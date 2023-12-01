package topic_7_object_oriented_programming.KnockoutDiceGame;

public class Player {

    private String name;
    private boolean knockedOut; // are they still in game or not?
    private int knockoutNumber;

    public Player(String name) {
        this.name = name;
        this.knockedOut = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isKnockedOut() {
        return knockedOut;
    }

    public void setKnockedOut(boolean knockedOut) {
        this.knockedOut = knockedOut;
    }

    public int getKnockoutNumber() {
        return knockoutNumber;
    }

    public void setKnockoutNumber(int knockoutNumber) {
        this.knockoutNumber = knockoutNumber;
    }
}
