package decorator_pattern.classes;

public abstract class DecoratorTea {
    protected AbstractTea tea;

    public DecoratorTea(AbstractTea tea) {
        this.tea = tea;
    }

    public String getDescription() {
        return "Abstract decorator tea";
    }
}
