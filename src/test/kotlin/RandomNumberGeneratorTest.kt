import org.amshove.kluent.`should be in range`
import org.junit.jupiter.api.Test

internal class RandomNumberGeneratorTest {

    @Test
    internal fun `random 메서드는 0에서 9사이의 숫자를 생성한다`() {
        val generatedNumber = random()

        generatedNumber `should be in range` (0..9)
    }
}