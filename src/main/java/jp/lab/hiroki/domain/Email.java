package jp.lab.hiroki.domain;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Emailクラス
 *
 * @author HIROKI
 *
 */
public class Email {

    /** ローカル部 */
    private String local;
    /** ドメイン部 */
    private String domain;
    /** @ */
    private static final String separater = "@";

    /**
     * コンストラクタ
     *
     * @param local
     *            ローカル部
     * @param domain
     *            ドメイン部
     */
    Email(String local, String domain) {
        validate(local, domain);
        this.local = local;
        this.domain = domain;
    }

    /**
     * コンストラクタ
     *
     * @param fullAddress
     *            メールアドレス
     */
    Email(String fullAddress) {
        String[] pieces = fullAddress.split(separater);
        if (pieces.length == 2) {
            throw new IllegalArgumentException("メールアドレスの形式が不正です。");
        }
        validate(pieces[0], pieces[1]);
        this.local = pieces[0];
        this.domain = pieces[1];
    }

    /**
     * コンストラク時のバリデーション処理を行います。
     *
     * @param local
     *            ローカル部
     * @param domain
     *            ドメイン部
     */
    private void validate(String local, String domain) {
        // TODO メールアドレスの形式チェック
        availableCharCheck(local, domain);
    }

    /**
     * ローカル部使用可能文字チェック用パターン
     */
    private static final Pattern availableCharsPattern = Pattern
            .compile("[A-Z0-9a-z._%+-]+");

    /**
     * 使用可能文字列かどうかをチェックします。
     *
     * @param local
     *            ローカル部
     * @param domain
     *            ドメイン部
     */
    private void availableCharCheck(String local, String domain) {
        Matcher matcher = availableCharsPattern.matcher(local);
        if (!matcher.matches()) {
            throw new IllegalArgumentException("メールアドレスの形式が不正です。");
        }
    }

    /**
     * メールアドレス（文字列）を取得します。
     *
     * @return メールアドレス文字列
     */
    public String getFullAddress() {
        StringBuilder sb = new StringBuilder();
        return sb.append(local).append(separater).append(domain).toString();
    }
}
