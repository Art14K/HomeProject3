class Cat extends Animal {
    public Cat(String name) {
        this.food = food;
        this.location = location;
        this.name = name;
    }

    void out_name() {
        System.out.println("Кошку зовут Мурка");

    }

    void makeNoise() {
        System.out.println("Животное не нуждается в медицинской помощи");
    }

    void sleep() {
        System.out.println("Животное хочет спать");
    }


    void eat() {
        System.out.println("Животное не голодное");
    }
}