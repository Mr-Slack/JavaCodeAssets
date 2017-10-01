package jp.lab.hiroki.domain;

/**
 * うるう年クラス
 *
 * @author HIROKI
 *
 */
public class LeapYear {

    private LeapYear() {
    }

    /**
     * うるう年かどうかを判定
     *
     * @param year
     *            処理判定西暦
     * @return うるう年の場合 {@code true} そうでない場合 {@code false}
     */
    public static boolean isLeapYear(final Year year) {
        int yearNum = year.getYear();
        if (yearNum % 4 == 0) {
            // うるう年の例外
            if (yearNum % 100 == 0 && yearNum % 400 != 0) {
                return false;
            }
            return true;
        }
        return false;
    }

}
