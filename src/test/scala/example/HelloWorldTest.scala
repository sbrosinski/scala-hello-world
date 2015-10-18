package example

import org.junit.Test
import org.scalatest.Matchers
import org.scalatest.junit.JUnitSuiteLike


class HelloWorldTest extends JUnitSuiteLike with Matchers {

  @Test
  def helloWorldSentToConsole() {
    val hi = new HelloWorld with MockOutput
    hi.hello()
    hi.messages should contain("Hello World!")

  }

  @Test
  def helloPassesSingleMessageToConsole() {
    val hi = new HelloWorld with MockOutput
    hi.hello()
    hi.messages should have length 1
  }


}

trait MockOutput extends Output {
  var messages: Seq[String] = Seq()
  override def print(s: String) = messages = messages :+ s
}
