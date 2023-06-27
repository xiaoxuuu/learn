package live.xiaoxu.design.pattern.builder.demo;

/**
 * @author Xiao Xu
 * @date 2021/9/22 下午 03:36
 */
public class MealBuilder {

    public Meal prepareVegMeal() {

        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal() {

        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}