package components;

public enum Engine{
    ICE("combustion"),
    ELECTRIC("electric"),
    HYBRID("hybrid");

    private final String engine;

    Engine(String engine) {
        this.engine = engine;
    }

    public String getCustomString(){return engine;}

}
