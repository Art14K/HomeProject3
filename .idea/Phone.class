class Phone (String number, String model, String weight) {
    private this.number = number;
    private this.model = model;
    private this.weight = weight;
    Phone() /*конструкток без параметров */ {
    }
     void out_date(String number, String model, String weight) {
        System.out.println("Данные телефона:");
        System.out.println("-----------------");
        out_date2(number, model); // Вызов конатруктора с двумя параметрами из другого класса
        System.out.println("Вес телефона: " + weight);
    }

     void out_date2(String number, String model) {
        System.out.println("Данные телефона:");
        System.out.println("-----------------");
        System.out.println("Номер телефона: " + number);
        System.out.println("Модель телефона: " + model);
    }

     void receive_call(String number) { //Конструктор с именем звонящего
        System.out.println();
        System.out.println("Вам звонит: " + number);
    }

     void receive_call(String number, String name) {
        System.out.println();
        System.out.println("Вам звонит: " + number + " " + name);
    }

    void SendMessage(String...input) {
        String [] inv = input;
        for (i = 0; i < inv.length; i++) {
            System.out.println("Номер телефона: " + inv[i]);
        }
    }
}