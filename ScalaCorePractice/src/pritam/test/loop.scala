package pritam.test

object loop {
  def main(args: Array[String]): Unit = {
    ///////// FOR LOOP
    for(i <- 1 until 10 by 2)
      println(i)
    // for with filter
      println("The even number are ")
      for ( i <- 1 to 100 if (i %2 == 0))
      {
        println(i)
      }
      // for yeild example
      val collection = for (i <- 1 to 10) yield i
      println("The collection size is: "+collection.size)
      
      
      
      ///////////// WHILE LOOP
      ///////////// DO WHILE
      // break statement 
      for(i <- 1 to 10; j <- 1 to 10)
      {
        print(i,j)
      }
  }
  
}