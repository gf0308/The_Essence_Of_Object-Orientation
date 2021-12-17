package sources.studyProject.restaurantOrderDomain;

import java.util.List;

/**
 * 메뉴(메뉴판) 객체
 * */

class Menu {
    private List<MenuItem> menuItems;

    public MenuItem choose(String mealName) {
        for(MenuItem item : menuItems) {
            if(item.getName().equals(mealName)) return item;
        }
        return null;
    }

    public void setMenuItems(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

}
