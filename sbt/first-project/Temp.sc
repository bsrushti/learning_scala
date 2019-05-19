trait  Greeting {
  val time:String;
  def greet()
}

trait Events {
  def walk()
}

class Morning extends Greeting with Events {
  override val time = "sometime"
  override def greet(): Unit = print("Good Morning")

  override def walk(): Unit = print("walking")
}


class Evening extends Greeting{
  override val time = "some other time"
  override def greet(): Unit = print("Good Evening")
}

val morning = new Morning;
morning.greet();
print(morning.time);
morning.walk();

val evening = new Evening;
evening.greet();
print(evening.time);