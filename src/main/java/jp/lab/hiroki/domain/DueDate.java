package jp.lab.hiroki.domain;

import java.time.LocalDate;

/**
 * 予定日クラス
 *
 * @author HIROKI
 *
 */
public class DueDate {

    /** 予定日 */
    private LocalDate dueDate;

    /**
     * コンストラクタ
     *
     * @param date
     *            予定日
     */
    public DueDate(LocalDate date) {
        validate(date);
        this.dueDate = date;
    }

    /**
     * コンストラク時のバリデーション処理を行います。
     *
     * @param date
     */
    private void validate(LocalDate date) {
        if (date.compareTo(LocalDate.now()) < 0) {
            throw new IllegalArgumentException("本日よりも前の日付が予定日として指定されています。");
        }
    }

    /**
     * 予定日までの残り日数を取得します。
     *
     * @return 残り日数
     */
    public int until() {
        return LocalDate.now().until(dueDate).getDays();
    }
}
