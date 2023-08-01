public class Main {
    public static void main(String[] args) {
        char[] anna = {'A', 'n', 'n', 'a'};
        char[] bak = {'B', 'ą', 'k'};
        Students s1 = new Students(anna, bak);

        char[] jadzia = {'J', 'a', 'd', 'z', 'i', 'a'};
        char[] nyka = {'N', 'y', 'k', 'a'};
        Students s2 = new Students(jadzia, nyka);

        char[] zofia = {'Z', 'o', 'f', 'i', 'a'};
        char[] ryc = {'R', 'y', 'c'};
        Students s3 = new Students(zofia, ryc);

        char[] ola = {'O', 'l', 'a'};
        char[] lola = {'L', 'o', 'l', 'a'};
        char[] emails4 = {'o', '.', 'l', 'o', 'l', 'a', '@', 'w', 'p', '.', 'p', 'l'};
        Students s4 = new Students(ola, lola, 21, emails4, 36373820);

        char[] ela = {'E', 'l', 'a'};
        char[] nowak = {'N', 'o', 'w', 'a', 'k'};
        char[] emails5 = {'n', 'o', 'w', 'a', 'k', '9', '9', '@', 'u', 'g', '.', 'p', 'l'};
        Students s5 = new Students(ela, nowak, 24, emails5, 84483942);

        s1.StudentsDisplay();
        s2.StudentsDisplay();
        s3.StudentsDisplay();
        s4.StudentsDisplay();
        s5.StudentsDisplay();
    }
}
