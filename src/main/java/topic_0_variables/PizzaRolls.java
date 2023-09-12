package topic_0_variables;

public class PizzaRolls {
    public static void main(String[] args) {
        // sharing pizza rolls between people
        double pizzaRolls = 16;
        int people = 3;

        double rollsPerPerson = pizzaRolls / people;

        System.out.println("Each person gets " + rollsPerPerson + " pizza rolls.");
        // format to one decimal
        System.out.printf("Each person gets %.1f pizza rolls.", rollsPerPerson);

    }
}
