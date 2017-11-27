public class BurgerTester {
    public static void main(String[] args) {
        BurgerTools.mostPopularTopping = "Truffle";
        BurgerTools.averageDaysBeforeExpiration = 10;
        BurgerTools.temperatureWhenCooked = 155;
        BurgerTools.grill();
        System.out.println(BurgerTools.mostPopularTopping);
        System.out.println(BurgerTools.averageDaysBeforeExpiration);
        System.out.println(BurgerTools.temperatureWhenCooked);
        BurgerTools.grill();
        BurgerTools.mostPopularTopping = "Tomatoes";
        BurgerTools.averageDaysBeforeExpiration = 14;
        BurgerTools.temperatureWhenCooked = 170;
        System.out.println(BurgerTools.mostPopularTopping);
        System.out.println(BurgerTools.averageDaysBeforeExpiration);
        System.out.println(BurgerTools.temperatureWhenCooked);
    }
}
