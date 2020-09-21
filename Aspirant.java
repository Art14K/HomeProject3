class Aspirant extends Student {
    String work = "Научная работа на тему: Микросхемы";

    void who() {
        System.out.println("Аспирант");
        System.out.println();
    }

    public Aspirant() {
        averageMark = 5.0;
    }

    double getScholarship() {
        if (averageMark == 5) {
            return 200;
        } else {
            return 180;
        }
    }
}