class RandomNumberGenerator

// TODO: 2022/05/29 range 너는 도대체 무엇이니,,?
// TODO: 2022/05/29 java 객체와 kotlin 객체를 코드에서 섞어 쓰는 건 안티패턴인가?(Math.random, ThreadLocalRandom, SecureRandom)
fun random(): Int = (0..9).random()
