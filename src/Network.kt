/**
 *Класс наследник [ComputerNetwork]
 *Свойства конструктора:

 * @param _dataTransferRate - средняя скорость передачи данных в сети
 */
class Network(_nameOfOrganization: String, _countOfWorkstations: Int, _averageDistanceBetweenStations: Double, _dataTransferRate:Double) : ComputerNetwork(_nameOfOrganization, _countOfWorkstations, _averageDistanceBetweenStations){
    private var dataTransferRate: Double
    init{
        dataTransferRate = _dataTransferRate
    }
    /**
     * Метод для вычисления качества
     *
     * @return возвращает качество перемножая значение метода [Quality] класса [ComputerNetwork] и [dataTransferRate]
     */
    override fun Quality(): Double {
        return super.Quality() * dataTransferRate
    }

    /**
     * Метод для вывода информации
     */
    override fun Info(){
        println("===Network===\nСредняя скорость передачи данных в сети $dataTransferRate\nКачество: ${Quality()}")
    }
}