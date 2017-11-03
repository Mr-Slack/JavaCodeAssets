package jp.lab.hiroki.domain;

import java.time.LocalDate;

/**
 * 期間クラス
 *
 * @author HIROKI
 *
 */
public class Period {

    /** 開始日 */
    private LocalDate start;
    /** 終了日 */
    private LocalDate end;

    public Period(LocalDate start, LocalDate end) {
        validate(start, end);
        this.start = start;
        this.end = end;
    }

    /**
     * コンストラク時のバリデーション処理を行います。
     *
     */
    private void validate(LocalDate start, LocalDate end) {
        if (start.isAfter(end)) {
            throw new IllegalArgumentException("開始日時に終了日時よりも後の日付が指定されています。");
        }
    }

    /**
     * 開始日から終了日までの日数を取得します。
     *
     * @return 期間日数
     */
    public int getDays() {
        return start.until(end).getDays();
    }

}
