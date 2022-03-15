package mylib;

import org.apache.commons.lang3.StringUtils;

public class Account {
    private String name;

    public void setName(String name) {
        this.name = StringUtils.capitalize(name);
    }
    public String getName() {
        return name;
    }


}
