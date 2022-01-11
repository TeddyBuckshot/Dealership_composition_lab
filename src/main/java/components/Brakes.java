package components;

public enum Brakes{
    DRUM("drum"),
    DISC("disc"),
    CARBON("carbon");

    private String brakes;

    private Brakes(String brakes) {
        this.brakes = brakes;
    }

    public String getCustomString(){return brakes;}

}
