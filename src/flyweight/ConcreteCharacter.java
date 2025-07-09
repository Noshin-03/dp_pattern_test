package flyweight;

class ConcreteCharacter implements Character {
    private final char symbol; // Intrinsic state

    public ConcreteCharacter(char symbol) {
        this.symbol = symbol;
    }

    @Override
    public void display(int x, int y) {
        System.out.println("Displaying '" + symbol + "' at position (" + x + ", " + y + ")");
    }
}
