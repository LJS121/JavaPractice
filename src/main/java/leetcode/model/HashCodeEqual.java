package leetcode.model;

import java.util.HashMap;

class Apple {
    public String color;

    public Apple(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object obj) {
        if(! (obj instanceof Apple))
            return false;
        if(obj == this)
            return true;
        return this.color.equals(((Apple)obj).color);
    }
}
