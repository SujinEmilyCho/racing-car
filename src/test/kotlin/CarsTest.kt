import org.amshove.kluent.`should contain all`
import org.amshove.kluent.shouldHaveSize
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

internal class CarsTest {

    // TODO: 2022/05/29 parameterized test 하는 방법?
    @Test
    internal fun `입력받은 이름은 blank 일 수 없다`() {
        assertThrows<IllegalArgumentException> {
            Cars( "")
        }

        assertThrows<IllegalArgumentException> {
            Cars( "   ")
        }
    }

    @Test
    internal fun `입력받은 이름을 ','기준으로 잘라서 Name 객체로 만든다`() {
        val input = "sujin,emily,cho"
        val cars = Cars(input)

        cars.cars shouldHaveSize 3
        cars.cars `should contain all` listOf(Car("sujin"), Car("emily"), Car("cho"))
    }
}