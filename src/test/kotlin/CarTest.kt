import org.amshove.kluent.`should be`
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

internal class CarTest {

    @Test
    internal fun `이름은 5글자 이상일 수 없다`() {
        val longName = "여섯글자이름"

        assertThrows<IllegalArgumentException>{
            Car(longName)
        }
        // TODO: 2022/05/29 왜 자바의 JUnit Assertion을 쓰면 컴파일 에러가 나는가?
    }
    @Test
    internal fun `전달받은 숫자가 4이상이면 한 칸 이동한다`() {
        val car = Car("sujin")
        car.location `should be` 0

        car.move(4)
        car.location `should be` 1

        car.move(3)
        car.location `should be` 1
    }
}