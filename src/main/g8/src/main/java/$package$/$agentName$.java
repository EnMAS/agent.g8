import org.enmas.pomdp.Agent;
import org.enmas.pomdp.Action;
import org.enmas.pomdp.State;

public class $agentName$ extends Agent {

	// See the API docs
	// http://enmas.github.com/api/enmas-core/#org.enmas.pomdp.Agent

	public String name() {
		return "$agentName$";
	}

	public Action policy(observation: State, reward: Float) {
		// inspect your observation
		// consider your reward
		// choose an action
	}

}
