class Cars(names: String) {
    val cars : MutableList<Car> = mutableListOf()

    init {
        require(names.isNotBlank())

        for (name in names.split(",")) {
            this.cars.add(Car(name))
        }
    }

    fun move() {
        cars.map {
            it.move(random())
        }
    }
}
