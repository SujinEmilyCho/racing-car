class Car {
    var location: Int = 0

    fun move(number: Int) {
        if (number >= 4) {
            location += 1
        }
    }
}