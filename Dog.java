class Dog extends Animal {
    public Dog() {
        food = "Кости";
        location = "Тверь";
    }
    void out_name() {
        System.out.println("Собаку зовут Тузик");

    }


    void makeNoise() {
        System.out.println("Животное не нуждается в медицинской помощи");
    }

    void sleep() {
        System.out.println("Животное не хочет спать");
    }

    void eat() {
        System.out.println("Животное не голодное");
    }
}