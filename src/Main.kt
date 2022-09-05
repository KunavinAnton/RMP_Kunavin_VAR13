/**
 * Функция main
 */
fun main(){
    val computerNetwork: ComputerNetwork = ComputerNetwork("Контур", 4, 3.2)
    computerNetwork.Info()

    val network: Network = Network("Контур", 4, 3.2, 17.7)
    network.Info()
}