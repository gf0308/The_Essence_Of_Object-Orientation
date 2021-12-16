package sources.chapter7.coffeOrderDomain;

import java.util.List;

/**
 * 메뉴판 객체
 */

class Menu {
    private List<MenuItem> items;

    public Menu(List<MenuItem> items) {
        this.items = items;
    }

    // Menu객체가 coffeeName에 해당하는 MenuItem을 찾아 선택해내려면 MenuItem을 여러개 보유하고 있는 상태여야 함 -> MenuItem들여러개갖는것을 상태로 가질 것
    public MenuItem choose(String coffeeName) {
        for(MenuItem item : items) {
            if(coffeeName.equals(item.getName())) return item;
        }
        return null;
    }
}
