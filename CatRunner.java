public class CatRunner {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Jacky", 12, 30);
        cat1.introduce();
        cat1.printCatInfo();

        Cat cat2 = new Cat("Justin", 6, 20);
        cat2.printCatInfo();
        cat2.introduce();
    }
}
