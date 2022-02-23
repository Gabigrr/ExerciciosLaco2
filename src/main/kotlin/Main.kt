fun main() {

    print("Para verificar sua categoria, digite sua idade:")
    val idade = readLine()!!.toInt()

    when (idade){
        in 10..14 -> println("Sua categoria é: Infantil.")
        in 15..17 -> println("Sua categoria é: Juvenil.")
        in 18..25 -> println("Sua categoria é: Adulto.")
        else -> println("Não existe categoria para sua idade")
    }
}