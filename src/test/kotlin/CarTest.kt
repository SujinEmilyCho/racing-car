import org.amshove.kluent.`should be`
import org.junit.jupiter.api.Test

internal class CarTest {

    @Test
    internal fun `전달받은 숫자가 4이상이면 한 칸 이동한다`() {
        val car = Car()
        car.location `should be` 0

        car.move(4)
        car.location `should be` 1

        car.move(3)
        car.location `should be` 1
    }
}