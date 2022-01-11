package components;

public enum Brakes{
    DRUM("drum"),
    DISC("disc"),
    CARBON("carbon");

    private final String brakes;

    Brakes(String brakes) {
        this.brakes = brakes;
    }

    public String getBrakes() {
        return brakes;
    }
}
