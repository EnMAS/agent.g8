import org.enmas.pomdp.{Agent, Action, State}
import scala.util.Random
 
class $agentName$ extends Agent {

  // See the API docs at
  // http://enmas.github.com/api/enmas-core/#org.enmas.pomdp.Agent

  def name = "$agentName$"

  def policy(observation: State, reward: Float): Action = {
    // inspect your observation
    // consider your reward
    // choose an action
  }

}
