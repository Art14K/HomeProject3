import java.util.*;
// тестовый комментарий




















//------------------------------------------------
public class HomeProject3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите название класса (для выхода введите exit) : ");
        String set = scan.nextLine();
        switch (set) {
            case "Phone":
                Phone telephone1 = new Phone("891056693", "Nokia", "120 г.");
                Phone telephone2 = new Phone("89045669122", "Samsung", "190 г.");
                Phone telephone3 = new Phone("89013905499", "IPhone", "156 г.");
                telephone1.receive_call("89140034590", "Иван");
                telephone1.receive_call("89037775490", "Татьяна");
                telephone3.receive_call("89056779021", "Виктор");

                System.out.println("Номера телефонов, которым будет отправлено сообщение: ");

                telephone1.SendMessage("890128644", "89013458864", "843200035", "8566007777", "89105431200", "89156667021");
                break;
//----------------------------------------------------------------------------------------------------------------------------------------------

            case "Animal":
                    veterinar doc = new veterinar();
                    Dog dog = new Dog();
                    Cat cat = new Cat("Кошачий корм фрискис", "Москва", "Мурка");
                    Horse horse = new Horse();
                    Animal [] massive = {dog, cat, horse};

                    for (int i = 0; i < massive.length; i++) {
                        System.out.println();
                        massive[i].out_name();
                        doc.threatAnimal(massive[i]);
                        massive[i].makeNoise();
                        massive[i].sleep();
                        massive[i].eat();
                    }
                break;
 //-----------------------------------------------------------------------------
            case "Student":
                Student stud  = new Aspirant();
                Student stud1 = new Student();
                Aspirant asp = new Aspirant();
                Student [] std = {stud1, asp};

                for (int i = 0; i < std.length; i++) {
                    double stipendia = std[i].getScholarship();
                    std[i].who();
                    System.out.println("Стипендия составляет: " + stipendia);
                }
                break;
//---------------------------------------------------------------------------------------------------------
            case "test":

                Systemrst;hioarguobhaefu;bahdj/DLVNKLDNV. /
    }
}
