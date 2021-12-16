package sources.chapter7.coffeOrderDomain;

/**
 * 메뉴항목 객체
 * */

// 이따 not public 으로 바꿔볼것
public class MenuItem {
    private String name;
    private int price;

    public MenuItem(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
