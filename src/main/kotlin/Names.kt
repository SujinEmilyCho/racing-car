class Names(names: String) {
    val names : MutableList<Name> = mutableListOf()

    init {
        require(names.isNotBlank())

        for (name in names.split(",")) {
            this.names.add(Name(name))
        }
    }
}
