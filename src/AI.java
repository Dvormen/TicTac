public class AI {
    public String name = "computer";

    public AI(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "AI{" +
                "name='" + name + '\'' +
                '}';
    }
}
