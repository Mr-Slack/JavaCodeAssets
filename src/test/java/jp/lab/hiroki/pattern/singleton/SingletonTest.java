package jp.lab.hiroki.pattern.singleton;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class SingletonTest {

    @Test
    public void Singltonインスタンスが取得できること() throws Exception {
        // Exercise
        Singleton instance = Singleton.getInstance();
        // Verify
        assertThat(instance, instanceOf(Singleton.class));
    }

    @Test
    public void 同一スレッド内でSingltonインスタンスを二回取得した場合に同一インスタンスであること()
            throws Exception {
        // Exercise
        Singleton instanceFirst = Singleton.getInstance();
        Singleton instanceSecond = Singleton.getInstance();
        // Verify
        assertSame(instanceFirst, instanceSecond);
    }

    @Test
    public void 別スレッド内でSingltonインスタンスを二回取得した場合に同一インスタンスであること()
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
        Singleton instance;

        @Override
        public void run() {
            try {
                this.instance = Singleton.getInstance();
                Thread.sleep(250);
            } catch (InterruptedException e) {
                // テスト失敗
                fail(e.getMessage());
            }
        }

    }
}
