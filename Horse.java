class Horse extends Animal {
    public Horse() {
        food = "Сено";
        location = "Деревня";
    }

    void out_name() {
        System.out.println("Лошадь зовут Зорька");
    }

    void makeNoise() {
        System.out.println("Животное нуждается в медицинской помощи");
    }

    void sleep() {
        System.out.println("Животное не хочет спать");
    }

    void eat() {
        System.out.println("Животное устало и голодно");
    }
}