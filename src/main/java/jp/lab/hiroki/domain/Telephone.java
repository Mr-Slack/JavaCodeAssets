package jp.lab.hiroki.domain;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 電話番号クラス
 *
 * @author HIROKI
 *
 */
public class Telephone {

    /** 電話番号 */
    private String number;

    /**
     * コンストラクタ
     *
     * @param number
     *            電話番号
     */
    public Telephone(String number) {
        validate(number);
        this.number = number;
    }

    /** 数値文字チェック用正規表現 */
    private static final Pattern pattern = Pattern.compile("^[0-9]*$");

    /**
     * コンストラク時のバリデーション処理を行います。
     *
     * @param number
     *            電話番号
     */
    private void validate(String number) {
        charCheck(number);
    }

    /**
     * 数値文字列のみが使用されているかチェックを行います。
     *
     * @param number
     *            電話番号
     */
    private void charCheck(String number) {
        Matcher matcher = pattern.matcher(number);
        if (!matcher.find()) {
            throw new IllegalArgumentException("電話番号には数値以外の文字列を使用できません。");
        }
    }

}
