package ss7_abstract_and_interface.thuc_hanh.animal_and_edible.animal;

import ss7_abstract_and_interface.thuc_hanh.animal_and_edible.endible.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken: cluck-cluck!";
    }
    public String howToEat() {
        return "could be fried";
    }
}
