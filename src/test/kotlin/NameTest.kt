import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

internal class NameTest {

    @Test
    internal fun `이름은 5글자 이상일 수 없다`() {
        val longName = "여섯글자이름"

        assertThrows<IllegalArgumentException>{
            Name(longName)
        }
        // TODO: 2022/05/29 왜 자바의 JUnit Assertion을 쓰면 컴파일 에러가 나는가?
    }
}