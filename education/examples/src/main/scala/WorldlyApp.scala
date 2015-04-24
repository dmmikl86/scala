/**
 * Created by mdmytiaha on 31-Mar-15.
 */
object WorldlyApp {
  def main(args: Array[String]) {
    val wg = new WorldlyGreeter("Hello")
    wg.greet()
  }
}

// The WorldlyGreeter class
class WorldlyGreeter(greeting: String) {
  def greet() {
    val worldlyGreeting = WorldlyGreeter.worldify(greeting)
    println(worldlyGreeting)
  }
}
// The WorldlyGreeter companion object
object WorldlyGreeter {
  def worldify(s: String) = s + ", world!"
}