// cerner_2^5_2019

object Car {
    def go = println("go.")
}

//companion
class Car() {
    def go = println("go!")
    def honk = (msg:String) => println("Honk Honk " + msg)
    def checkTires = (tireTread: List[Int], checkTire: (Int) => Boolean) => tireTread.map( (x:Int) => checkTire(x) )
}

object Main extends App {
    Car.go  //go.
    def aCar : Car = new Car();
    Car.go  //go.
    aCar.go  //go!
    aCar.honk("yo!")  //Honk Honk yo!
    def result = aCar.checkTires(List(5, 6, 3, 1), (x:Int) => x >=2)
    println(result)  //true, true, true, false
}