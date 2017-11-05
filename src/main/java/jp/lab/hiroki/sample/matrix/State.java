package jp.lab.hiroki.sample.matrix;

/**
 * 状態パターンEnumクラス(sample)
 *
 * @author HIROKI
 *
 */
public enum State {
    Examin, // 審査中
    Approved, // 承認済
    OnGoing, // 実施中
    Complete, // 終了
    Back, // 差し戻し中
    Suspend, // 中断中
}
