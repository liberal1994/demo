package pattern.prototype;

import java.util.Date;

public class PandaForDeepCopyTest extends Panda {

    public PandaForDeepCopyTest(String name, Date birth) {
        this.name = name;
        this.birth = birth;
    }

    public PandaForDeepCopyTest() {

    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Object obj = super.clone();
        PandaForDeepCopyTest panda = (PandaForDeepCopyTest) obj;
        panda.birth = (Date) this.birth.clone();
        return panda;
    }


}
