package jp.lab.hiroki.domain;

/**
 * 金額クラス
 *
 * @author HIROKI
 *
 */
public class Amount {

    private int amount;

    /**
     * コンストラクタ
     *
     * @param amount
     *            金額
     */
    public Amount(int amount) {
        validate(amount);
        this.amount = amount;
    }

    /**
     * コンストラクタ
     *
     * @param amount
     *            金額
     */
    public Amount(String amount) {
        int intVal = Integer.parseInt(amount);
        validate(intVal);
        this.amount = intVal;
    }

    /**
     * コンストラク時のバリデーション処理を行います。
     *
     * @param value
     *            対象値
     */
    private void validate(int value) {
        if (value < 0) {
            throw new IllegalArgumentException("金額が負の値です。指定値:" + value);
        }
    }

    /**
     * 金額値を返します。
     *
     * @return 金額
     */
    private int getValue() {
        return amount;
    }

    /**
     * 引数に渡された金額を加えた加算後の金額クラスを取得します。
     *
     * @param value
     *            加算値
     * @return 加算結果の金額クラス
     */
    public Amount add(Amount value) {
        return new Amount(amount + value.getValue());
    }
}
