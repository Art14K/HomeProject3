class Student {
    protected String FirstName = "Иван";
    protected String LastName = "Антонов";
    protected String group = "12D";
    protected double averageMark = 4.6;

    void who() {
        System.out.println("Студент");
        System.out.println();
    }


    double getScholarship() {
        if (averageMark == 5) {
            return 100;
        } else {return 80;}
    }
}