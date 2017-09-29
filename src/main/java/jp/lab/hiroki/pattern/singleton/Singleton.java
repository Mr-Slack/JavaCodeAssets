package jp.lab.hiroki.pattern.singleton;

/** シングルトンパターン */
public class Singleton {

    // singletonのためのstaticフィールド クラスロード時にただひとつ生成
    private static Singleton singleton = new Singleton();

    // コンストラクタをprivate化することで他のクラスからのインスタンス生成を制限
    private Singleton() {
    };

    // singletonなインスタンスを返すためのpublicメソッドを用意
    public static Singleton getInstance() {
        return singleton;
    }

}
