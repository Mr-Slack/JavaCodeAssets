package jp.lab.hiroki.pattern.template;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ConcreteClassTest {

    AbstractClass sut;

    @Before
    public void テスト対象Instanceの生成() {
        AbstractClass sut = new ConcreteClass();
        this.sut = sut;
    }

    @Test
    public void 実装メソッド１の結果method1が返ること() throws Exception {
        // Exercise
        String expected = "method1";
        String actual = sut.method1();
        // Verify
        assertThat(actual, is(expected));
    }

    @Test
    public void 実装メソッド３の結果method3が返ること() throws Exception {
        // Exercise
        String expected = "method3";
        String actual = sut.method3();
        // Verify
        assertThat(actual, is(expected));
    }

    @Test
    public void 親クラス定義メソッドtemplateMethodの結果期待値と一致すること() throws Exception {
        // Exercise
        sut.templateMethod();
        String expected = "method1method2method3method4";
        String actual = sut.result;
        // Verify
        assertThat(actual, is(expected));
    }
}
