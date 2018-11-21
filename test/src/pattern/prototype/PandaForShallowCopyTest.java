package pattern.prototype;

import java.util.Date;

public class PandaForShallowCopyTest extends Panda {

    public PandaForShallowCopyTest(String name, Date birth) {
        this.name = name;
        this.birth = birth;
    }

    public PandaForShallowCopyTest() {

    }

    @Override
    protected Object clone() throws CloneNotSupportedException {

        Object obj = super.clone();

        return obj;
    }
}
