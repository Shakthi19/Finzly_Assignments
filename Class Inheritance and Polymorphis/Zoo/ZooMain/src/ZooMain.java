// Animal class
class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void makeSound() {
        // This method will be overridden in derived classes
    }
}

// Derived classes
class Lion extends Animal {
    public Lion(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Roar!");
    }
}

class Elephant extends Animal {
    public Elephant(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Trumpet!");
    }
}

class Giraffe extends Animal {
    public Giraffe(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Moo!");
    }
}

// Zoo class
class Zoo {
    private Animal[] animals;

    public Zoo(int capacity) {
        animals = new Animal[capacity];
    }

    public void addAnimal(Animal animal) {
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] == null) {
                animals[i] = animal;
                break;
            }
        }
    }

    public void makeAllSounds() {
        for (Animal animal : animals) {
            if (animal != null) {
                System.out.print(animal.getClass().getSimpleName() + " " + animal.getName() + ": ");
                animal.makeSound();
            }
        }
    }
}

public class ZooMain {
    public static void main(String[] args) {
        Zoo zoo = new Zoo(5);

        Lion lion = new Lion("Simba", 5);
        Elephant elephant = new Elephant("Dumbo", 10);
        Giraffe giraffe = new Giraffe("Gerry", 7);

        zoo.addAnimal(lion);
        zoo.addAnimal(elephant);
        zoo.addAnimal(giraffe);

        zoo.makeAllSounds();
    }
}
