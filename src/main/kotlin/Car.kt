open class Car
//        var _nameCar: String
//        var _typeCar: String
//        var _numberOfTires: Int
{
    open fun desc()
    {

    }
}

class Mazda: Car()
{
    override fun desc()
    {
        println("Mobil 1")
    }
}

class Lamborgini: Car()
{
    override fun desc()
    {
        println("Mobil 2")
    }
}

class BMW: Car()
{
    override fun desc()
    {
        println("Mobil 3")
    }
}