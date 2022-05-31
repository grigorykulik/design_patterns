package decorator_pattern;

import decorator_pattern.classes.BlackTea;
import decorator_pattern.classes.BlackTeaWithMint;
import decorator_pattern.classes.DecoratorTea;

public class DecoratorMain {
    public static void main(String[] args) {
        BlackTea tea = new BlackTea();
        BlackTeaWithMint btwm = new BlackTeaWithMint(tea);
        System.out.println(btwm.getDescription());
    }
}
