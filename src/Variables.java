public class Variables {
    public static void main(String[] args) {
        String firstName = "Jan";
        String lastName = "Kowalski";
        final String pesel = "123456789";
        int age = 25;
        double height = 180.5;
        double suma = height + 5;
        char letter = 'a';
        System.out.println(firstName + " " + lastName + " ma " + age + " lat");
        System.out.println("Pan " + lastName + " ma pesel " + pesel);
        System.out.println(firstName + " ma wzrost " + height + "cm");
        System.out.println("jeśli " + firstName + " urośnie o 5cm, to będzie miał " + suma + "cm");
        System.out.println(letter);

        firstName = "Krzysztof";
        System.out.println("Imię po zmianie: " + firstName);


    }
}
