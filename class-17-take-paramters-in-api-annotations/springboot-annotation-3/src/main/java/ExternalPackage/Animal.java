package ExternalPackage;

import org.springframework.stereotype.Component;

@Component
public class Animal {
    private boolean isMammal;

    public Animal(boolean isMammal) {
        this.isMammal = isMammal;
    }

    public Animal() {
        System.out.println("Just created an object of Animal class");
    }

    public boolean isMammal() {
        return isMammal;
    }

    public void setMammal(boolean mammal) {
        isMammal = mammal;
    }
}
