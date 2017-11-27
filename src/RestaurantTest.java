public class RestaurantTest {
    public static void main(String[] args) {
        RestaurantDish dish = new RestaurantDish();
        dish.costInCents = 200000;
        dish.nameOfDish = "Wild Caught Alaskan Salmon Caviar";
        dish.wouldRecommend = true;
        dish.eat();
        System.out.println(dish.costInCents);
        System.out.println(dish.nameOfDish);
        System.out.println(dish.wouldRecommend);
    }
}
