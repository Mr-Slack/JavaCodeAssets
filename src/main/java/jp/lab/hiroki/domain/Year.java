package jp.lab.hiroki.domain;

/**
 * 年（西暦）クラス
 *
 * @author HIROKI
 *
 */
public class Year {

    private final int year;

    public Year(int year) {
        validate(year);
        this.year = year;
    }

    private void validate(final int year) {
        if (1900 > year || 9999 < year) {
            throw new IllegalArgumentException("西暦の指定値が異常です。");
        }
    }

}
