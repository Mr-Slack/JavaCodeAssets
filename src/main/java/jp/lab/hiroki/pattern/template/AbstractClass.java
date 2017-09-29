package jp.lab.hiroki.pattern.template;

/** テンプレートパターン */
public abstract class AbstractClass {

    String result;

    // テンプレート事態は子クラスでの変更を許容しないためfinal修飾子
    // 処理の大枠（template定義）
    public final void templateMethod() {
        this.result = method1() + method2() + method3() + method4();
    }

    // 各処理の実装は子クラスでのみ実装可能とするため、protected
    protected abstract String method1();

    protected abstract String method2();

    protected abstract String method3();

    protected abstract String method4();

}
