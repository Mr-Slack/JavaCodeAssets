package jp.lab.hiroki.sample.matrix;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 状態遷移管理クラス(sample)
 *
 * @author HIROKI
 *
 */
public class StateTransitions {

    // 状態遷移管理Map
    Map<State, Set<State>> allowed;

    {
        allowed = new HashMap<>();
        allowed.put(State.Examin, EnumSet.of(State.Approved, State.Back));
        allowed.put(State.Back, EnumSet.of(State.Examin, State.Complete));
        allowed.put(State.Approved, EnumSet.of(State.OnGoing, State.Complete));
        allowed.put(State.OnGoing, EnumSet.of(State.Suspend, State.Complete));
        allowed.put(State.Suspend, EnumSet.of(State.OnGoing, State.Complete));
    }
}
