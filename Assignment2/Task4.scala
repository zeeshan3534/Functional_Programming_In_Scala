import scala.util.Random
object Main {
  def main(args: Array[String]): Unit = {

def helper(arr:Array[Int],res:Array[Int],pointer:Int):Array[Int]={
    
     if (pointer==arr.length)
     res
     
     else
      helper(arr,if(arr(pointer)%2==0) res :+ arr(pointer) else res,pointer+1)

   }
 def even(arr:Array[Int]):Array[Int]={
   
   
  helper(arr,Array(),0)
 
 }
 println(even(Array.fill(100)(util.Random.nextInt(100))).mkString(","))
  println((Array.fill(100)(util.Random.nextInt(100)).count(_ %2 == 0)))}}