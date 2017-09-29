package jp.lab.hiroki.pattern.template;

/** テンプレートパターン */
public class ConcreteClass extends AbstractClass {

    // 子クラスにて親クラスの抽象メソッドを実装する
    @Override
    protected String method1() {
        return "method1";
    }

    @Override
    protected String method2() {
        return "method2";
    }

    @Override
    protected String method3() {
        return "method3";
    }

    @Override
    protected String method4() {
        return "method4";
    }

}
