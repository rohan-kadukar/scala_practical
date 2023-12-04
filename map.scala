import scala.collection.immutable
object map extends App{
    var map=Map(1->"Rohan",2->"Rohit",3->"Rohan",4->"pankaj",5->"sagar");
    for((k1,v1)<-map)
    {
        for((k2,v2)<-map)
        {
            if(v1==v2 && k1!=k2)
            {
                println(" Roll No: "+ k1+" Firstname:"+v1);
            }
        }
    }
}