public class Main {
    public static void main(String[] args) {
        char[] chars = {'a', 'o', 'u', 'ü', 'ö', 'ə', 'ı', 'e', 'i'};

        for (char singleChar : chars) {
            switch(singleChar) {
                case 'i', 'ı', 'u', 'ü' -> System.out.println("Qapali sait");
                case 'a', 'o', 'ö', 'ə', 'e' -> System.out.println("Aciq sait");
                default -> System.out.println("Sait deyil");
            }
        }
    }
}