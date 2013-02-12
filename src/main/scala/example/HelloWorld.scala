/**
 * User: ninja
 * Date: 2/11/13
 * Time: 10:28 PM
 */

trait Output {
  def print(s:String)=println(s)
}

class HelloWorld extends Output {
  def hello()=print("Hello World!")
}
