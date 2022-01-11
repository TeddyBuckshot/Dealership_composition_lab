package components;

public enum Tyres{
    SOFT("soft"),
    MEDIUM("medium"),
    HARD("hard");

    private final String tyres;

    Tyres(String tyres) {
        this.tyres = tyres;
    }

    public String getTyres() {
        return tyres;
    }

}
