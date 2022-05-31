package decorator_pattern.classes;

public class BlackTeaWithMint extends DecoratorTea {
    public BlackTeaWithMint(AbstractTea tea) {
        super(tea);
    }

    @Override
    public String getDescription() {
        return "Black tea with mint" + "\n" + super.tea.getDescription();
    }
}
