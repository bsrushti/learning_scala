import scala.util.control.Breaks._
var player1: Array[Int] = Array(0, 1, 2, 4, 7);
var player2: Array[Int] = Array(3, 5, 6, 8);

val winningCombinations =
  Array(Array(3, 4, 5), Array(6, 7, 8),
    Array(0, 3, 6),Array(0, 1, 2), Array(1, 4, 7), Array(2, 5, 8),
    Array(0, 4, 8), Array(2, 4, 6))

def isSubset(subSet: Array[Int], set: Array[Int]) = {
  subSet forall (set contains)
}

def hasWon(playerMoves: Array[Int]) = {
  var msg: String = "player lose";
  breakable( winningCombinations.foreach(
    (combination: Array[Int]) => {
      if (isSubset(combination, playerMoves)) {msg = "player won"; break}
    }))
  println(msg)
}

hasWon(player1);