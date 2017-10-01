package jp.lab.hiroki.domain;

import org.junit.Test;

public class YearTest {

    @Test(expected = IllegalArgumentException.class)
    public void 西暦クラスを引数1899で生成した場合例外が送出されること() throws Exception {
        // Exercise
        Year instance = new Year(1899);
    }

    @Test
    public void 西暦クラスを引数1900で生成した場合例外が送出されないこと() throws Exception {
        // Exercise
        Year instance = new Year(1900);
    }

    @Test(expected = IllegalArgumentException.class)
    public void 西暦クラスを引数10000で生成した場合例外が送出されること() throws Exception {
        // Exercise
        Year instance = new Year(10000);
    }

    @Test
    public void 西暦クラスを引数9999で生成した場合例外が送出されないこと() throws Exception {
        // Exercise
        Year instance = new Year(9999);
    }
}
