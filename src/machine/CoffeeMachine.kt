package machine

class CoffeeMachine(private var water: Int, private var milk: Int, private var beans: Int, private var disposal: Int, private var money: Int){
    fun prepare(coffeeType: CoffeeType){
        if(this.water < coffeeType.water){
            println("Sorry, not enough water!");
            return
        }
        if(this.milk < coffeeType.milk){
            println("Sorry, not enough milk!");
            return
        }
        if(this.beans < coffeeType.beans){
            println("Sorry, not enough beans!");
            return
        }
        if(this.disposal == 0){
            println("Sorry, not enough disposal!");
            return
        }

        println("I have enough resources, making you a coffee!")
        this.water -= coffeeType.water
        this.milk -= coffeeType.milk
        this.beans -= coffeeType.beans
        this.disposal--
        this.money += coffeeType.price
    }

    fun fill(water: Int, milk: Int, beans: Int, disposal: Int){
        this.water += water
        this.milk += milk
        this.beans +=beans
        this.disposal += disposal
    }

    fun take(): Int{
        val takenMoney = this.money
        this.money = 0
        return takenMoney
    }

    override fun toString(): String {
        return "The coffee machine has:\n" +
                "${this.water} of water\n" +
                "${this.milk} of milk\n" +
                "${this.beans} of coffee beans\n" +
                "${this.disposal} of disposable cups\n" +
                "${this.money} of money"
    }
}