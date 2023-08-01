public class Student {
    char[] name;
    char[] surname;
    int age;
    char[] email;
    int index;

    Students(char[] name, char[] surname, int age, char[] email, int index) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.email = email;
        this.index = index;
    }

    Students(char[] name, char[] surname) {
        this.name = name;
        this.surname = surname;
    }

    void StudentsDisplay() {
        System.out.println("--------------------- DANE STUDENTA ---------------------");
        System.out.print("Imię: ");
        for (char letter : name) {
            System.out.print(letter);
        }
        System.out.println();
        System.out.print("Nazwisko: ");
        for (char letter : surname) {
            System.out.print(letter);
        }
        System.out.println();
        if (age >= 1) {
            System.out.println("Wiek: " + age);
            System.out.print("Email: ");
            for (char letter : email) {
                System.out.print(letter);
            }
            System.out.println();
            System.out.println("Numer indeksu: " + index);
        }
    }
}