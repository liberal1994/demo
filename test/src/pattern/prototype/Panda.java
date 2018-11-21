package pattern.prototype;

import java.util.Date;

public abstract class Panda implements Cloneable {
    protected String name;
    protected Date birth;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    @Override
    public String toString() {
        return "name:"+this.name+", birth:"+this.birth;
    }

}
