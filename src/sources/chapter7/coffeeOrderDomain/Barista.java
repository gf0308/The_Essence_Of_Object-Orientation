package sources.chapter7.coffeeOrderDomain;

/**
 * 바리스타 객체
 * */

public class Barista {

    public Coffee makeCoffee(MenuItem menuItem) {
        Coffee coffee = new Coffee(menuItem);
        return coffee;
    }

}
