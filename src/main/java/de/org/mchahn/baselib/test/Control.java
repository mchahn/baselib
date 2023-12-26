package de.org.mchahn.baselib.test;

public class Control {
    public final static boolean quick() {
        String flag = System.getenv("DE_ORG_MCHAHN_BASELIB_TEST_QUICK");
        return flag != null && flag.equals("1");
    }
}
