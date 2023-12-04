import scala.io.StdIn.readInt
object upperTrangularOrNot extends App{
    var A=Array.ofDim[Int](100,100)
    print("Enter The No. of Rows: ")
    var m=scala.io.StdIn.readInt()
    print("Enter The No. of Coloums: ")
    var n=scala.io.StdIn.readInt()
    println("Enter Values to the matrix: ")
    for(i<-0 to m-1){
        for(j<-0 to n-1){
            print("A("+i+")("+j+"): ")
            A(i)(j)=scala.io.StdIn.readInt()
        }
    }
    println("The Given Matrix is: ");
    for(i<- 0 to m-1){
        for(j<-0 to n-1){
            print(A(i)(j)+"\t");
        }
        print("\n\n")
    }
    var isUpper=1;
    for(row<-0 to m-1){
        for(col<-0 to n-1){
            if(col<row && A(row)(col)!=0){
                isUpper=0;
            }
        }
    }
    if(isUpper==1){
        println("\n this is upper trianglular matrix")
        for(row<-0 to m-1){
            for(col<-0 to n-1){
                if(A(row)(col)!=0){
                    print(A(row)(col)+"\t");
                }else{
                    print("\t")
                }
            }
            print("\n\n");
        }
    }else{
        print("\n this is not a upper triangular matrix:\n");
    }
}
