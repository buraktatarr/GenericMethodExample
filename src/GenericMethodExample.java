public class GenericMethodExample {

        // Generic printArray metodumuzu yazıyoruz;

        public static <T> void printArray(T[] array) {
            for (T eleman : array) {
                System.out.print(eleman + " ");
            }
            System.out.println(); // Yeni satıra geç (boşluk bırak)
        }

        public static void main(String[] args) {
            // Integer dizisi;
            Integer[] intArray = {1, 2, 3, 4, 5};

            // String dizisi;
            String[] strArray = {"Java", "Generics", "Ödev"};

            // Generic methodu çağırma;
            printArray(intArray);
            printArray(strArray);
        }
}
