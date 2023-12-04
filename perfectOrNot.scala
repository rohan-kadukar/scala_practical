import scala.io.StdIn.readInt
object perfectOrNot extends App{
    var r=scala.util.Random;
    var sum=0;
    for(i <- 1 to 5)
    {
        var n = r.nextInt(50)
        for(j <- 1 to n-1)
        {
            if(n % j == 0)
            {
                sum += j
            }
        }
        if(sum == n){
            println(n +" is a perfect number")
        }else{
            println(n +" is not a perfect number")
        }
    }
}