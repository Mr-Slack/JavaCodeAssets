package jp.lab.hiroki.loop;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Javaループ処理サンプルクラス
 *
 * @author HIROKI
 *
 */
public class LoopExpressPattern {

    // ===LIST========================================================

    /**
     * サンプルリスト
     */
    private static List<Integer> array = Arrays.asList(1, 3, 5, 7, 9, 11);

    /**
     * 基本for文
     */
    static void List_基本for文() {
        for (int i = 0; i < array.size(); i++) {
            System.out.println(array.get(i));
        }
    }

    /**
     * 拡張for文
     */
    static void List_拡張for文() {
        for (int i : array) {
            System.out.println(i);
        }
    }

    /**
     * ラムダ式
     */
    static void List_ラムダ式1() {
        array.forEach((Integer t) -> System.out.println(t));
    }

    /**
     * ラムダ式（略式）
     */
    static void List_ラムダ式2() {
        array.forEach(t -> System.out.println(t));
    }

    /**
     * メソッド参照
     */
    static void List_ラムダ式3() {
        array.forEach(System.out::println);
    }

    // ===MAP========================================================

    /** サンプルマップ */
    private static Map<String, String> options = new LinkedHashMap<String, String>() {
        /** シリアライズ.version */
        private static final long serialVersionUID = 1L;
        // 初期化
        {
            put("1", "リンゴ");
            put("2", "ゴリラ");
            put("3", "ラッパ");
        }
    };

    /**
     * 拡張form文
     */
    static void Map_拡張for文() {
        for (String key : options.keySet()) {
            System.out
                    .println("key=" + key + " " + "value=" + options.get(key));
        }
    }

    /**
     * ラムダ式
     */
    static void Map_ラムダ式() {
        options.forEach(
                (k, v) -> System.out.println("key=" + k + " " + "value=" + v));
    }
}
