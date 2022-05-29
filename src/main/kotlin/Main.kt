fun main(args: Array<String>) {
    println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).")
    val nameInput = readLine()
    val cars = Cars(nameInput!!)

    println("시도할 회수는 몇회인가요?")
    var round = readLine()!!.toInt()

    while (round > 0) {
        cars.move()
        println("실행 결과")
        cars.cars.map {
            println(it.toString())
        }
        round--
    }
}