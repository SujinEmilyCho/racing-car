data class Car(val name: String) {
    var location: Int = 0

    init {
        require(name.length <= 5)
    }

    fun move(number: Int) {
        if (number >= 4) {
            location += 1
        }
    }
    override fun toString(): String {
        var bars = ""
        for (i in 1 .. location) {
            bars += "-"
        }
        return "$name: $bars"
    }
}