import scala.io.StdIn._


println("Enter two numbers for operation");
print("Enter first number - ");
val number1 : Int = readInt();

print("Enter second number - ");
val number2 : Int = readInt();

def getChoice (): Int = {
    println("Enter choice");
    println("1.Addition");
    println("2.Substraction");
    println("3.Multiplication");
    println("4.Division");

    val choice : Int = readInt();
    return choice;
}

def calculate (number1:Int, number2:Int, choice:Int) : Int = {
    val result = choice match {
        case 1 => number1 + number2
        case 2 => number1 - number2
        case 3 => number1 * number2
        case 4 => number1 / number2
    }
    return result;
}

println("result =>",calculate(number1,number2, getChoice()));
