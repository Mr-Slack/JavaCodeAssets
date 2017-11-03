package jp.lab.hiroki.domain;

/**
 * 数量クラス
 *
 * @author HIROKI
 *
 */
public class Quantity {

    /** 数量 */
    private int quantity;

    /**
     * コンストラクタ
     *
     * @param quantity
     *            数量
     */
    public Quantity(int quantity) {
        validate(quantity);
        this.quantity = quantity;
    }

    /**
     * コンストラクタ
     *
     * @param quantity
     *            数量
     */
    public Quantity(String quantity) {
        int intVal = Integer.parseInt(quantity);
        validate(intVal);
        this.quantity = intVal;
    }

    /**
     * コンストラク時のバリデーション処理を行います。
     *
     * @param value
     *            対象値
     */
    private void validate(int value) {
        if (value < 0) {
            throw new IllegalArgumentException("数量が負の値です。指定値:" + value);
        }
    }

    /**
     * 数量値を返します。
     *
     * @return 数量
     */
    private int getValue() {
        return quantity;
    }

    /**
     * 引数に渡された数量を加えた加算後の数量クラスを取得します。
     *
     * @param value
     *            加算値
     * @return 加算結果の数量クラス
     */
    public Quantity add(Quantity value) {
        return new Quantity(quantity + value.getValue());
    }

}
