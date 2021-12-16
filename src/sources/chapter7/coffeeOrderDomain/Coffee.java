package sources.chapter7.coffeeOrderDomain;

/**
 * 커피 객체
 * */

class Coffee {
    private String name;
    private int price;

    public Coffee(MenuItem menuItem) {
        this.name = menuItem.getName();
        this.price = menuItem.getPrice();
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
