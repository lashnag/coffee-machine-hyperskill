package machine

import java.util.*

fun main(args: Array<String>) {
    val coffeeMachine = CoffeeMachine(400, 540, 120, 9, 550)
    val scanner = Scanner(System.`in`)

    while (true) {
        print("Write action (buy, fill, take, remaining, exit): ")
        when (scanner.next()) {
            "remaining" -> println(coffeeMachine)
            "buy" -> {
                print("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ")
                when (scanner.next()) {
                    "1" -> coffeeMachine.prepare(CoffeeType.ESPRESSO)
                    "2" -> coffeeMachine.prepare(CoffeeType.LATTE)
                    "3" -> coffeeMachine.prepare(CoffeeType.CAPPUCCINO)
                }
            }
            "fill" -> {
                print("Write how many ml of water do you want to add: ")
                val waterToFill = scanner.nextInt()
                print("Write how many ml of milk do you want to add: ")
                val milkToFill = scanner.nextInt()
                print("Write how many grams of coffee beans do you want to add: ")
                val beansToFill = scanner.nextInt()
                print("Write how many disposable cups of coffee do you want to add: ")
                val disposalToFill = scanner.nextInt()
                coffeeMachine.fill(waterToFill, milkToFill, beansToFill, disposalToFill)
            }
            "take" -> {
                val takenMoney = coffeeMachine.take()
                println("I gave you \$$takenMoney")
            }
            "exit" -> {
                return
            }
        }
    }
}