import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner
import org.scalatest.matchers.ShouldMatchers

trait MockOutput extends Output {
    var messages: Seq[String] = Seq()

    override def print(s: String) = messages = messages :+ s
  }


@RunWith(classOf[JUnitRunner])
class HelloWorldSuite extends FunSuite with ShouldMatchers{
  test("hello world is sent to be printed to console"){
    val hi = new HelloWorld with MockOutput
    hi.hello()
    hi.messages should contain ("Hello World!")

  }

  test("hello passes a single message to console") {
     val hi = new HelloWorld with MockOutput
    hi.hello()
    hi.messages should have length (1)
  }
}