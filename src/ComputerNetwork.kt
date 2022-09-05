/**
 * @author Kunavin Anton PR-33
 *Базовый класс [ComputerNetwork]
 *Свойства конструктора:
 * @param _nameOfOrganization - название организации
 * @param _countOfWorkstations - кол-во рабочих станций
 * @param _averageDistanceBetweenStations - расстояние между станциями
 */
open class ComputerNetwork (_nameOfOrganization: String, _countOfWorkstations: Int, _averageDistanceBetweenStations: Double){
    private var nameOfOrganization:String
    private var countOfWorkstations:Int
    private var averageDistanceBetweenStations: Double

    init{
        nameOfOrganization = _nameOfOrganization
        countOfWorkstations = _countOfWorkstations
        averageDistanceBetweenStations = _averageDistanceBetweenStations
    }

    /**
     * Метод для вычисления качества
     *
     * @return возвращает качество перемножая [countOfWorkstations] и [averageDistanceBetweenStations]
     */
    open fun Quality():Double{
        return countOfWorkstations * averageDistanceBetweenStations
    }

    /**
     * Метод для вывода информации
     */
    open fun Info(){
        println("===ComputerNetwork===\nНазвание организации: $nameOfOrganization\nЧисло рабочих станций: $countOfWorkstations\nСреднее расстояние между станциями: $averageDistanceBetweenStations\nКачество: ${Quality()}")
    }
}