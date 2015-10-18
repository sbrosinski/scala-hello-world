package example

trait Output {
  def print(s:String)=println(s)
}

class HelloWorld extends Output {
  def hello()=print("Hello World!")
}
