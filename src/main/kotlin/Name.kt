data class Name(val name: String) {

    init {
        require(name.length <= 5)
    }
}
