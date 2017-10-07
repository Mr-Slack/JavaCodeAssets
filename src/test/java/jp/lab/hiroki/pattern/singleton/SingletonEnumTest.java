package jp.lab.hiroki.pattern.singleton;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class SingletonEnumTest {

    @Test
    public void SingltonEnumインスタンスが取得できること() throws Exception {
        // Exercise
        SingletonEnum instance = SingletonEnum.enumration;
        // Verify
        assertThat(instance, instanceOf(SingletonEnum.class));
    }

    @Test
    public void 同一スレッド内でSingltonEnumインスタンスを二回取得した場合に同一インスタンスであること()
            throws Exception {
        // Exercise
        SingletonEnum instanceFirst = SingletonEnum.enumration;
        SingletonEnum instanceSecond = SingletonEnum.enumration;
        // Verify
        assertSame(instanceFirst, instanceSecond);
    }

    @Test
    public void 別スレッド内でSingltonEnumインスタンスを二回取得した場合に同一インスタンスであること()
            throws Exception {

        // SetUp
        SubThread sub1 = new SubThread();
        SubThread sub2 = new SubThread();

        // Exercise
        sub1.start();
        sub2.start();
        sub1.join();
        sub2.join();

        // Verify
        String msg = sub1.instance.toString() + ":" + sub2.instance.toString();
        assertSame(msg, sub1.instance, sub2.instance);
    }

    /**
     * マルチ（子）スレッド生成用インナークラス
     *
     * @author HIROKI
     *
     */
    class SubThread extends Thread {
        SingletonEnum instance;

        @Override
        public void run() {
            try {
                this.instance = SingletonEnum.enumration;
                Thread.sleep(250);
            } catch (InterruptedException e) {
                // テスト失敗
                fail(e.getMessage());
            }
        }

    }
}
