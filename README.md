# 자동차 경주 게임 코틀린으로 만들기!

## 요구사항
- [x] 게임에 참여하는 자동차 이름 입력 기능
    - [x] 쉼표(,)를 기준으로 이름 구분
    - [x] 이름은 5자 이하만 가능
- [x] 몇 라운드의 게임을 진행할 지 입력 기능
- [x] 0~9 사이의 랜덤 숫자 생성 기능
- [x] 자동차 이동 기능
  - [x] random 값이 4 이상이면 전진, 3 이하면 정지
- [ ] 각 라운드 별 실행 결과 출력 기능(이름을 같이 출력)
- [ ] 주어진 횟수 동안 게임 반복 진행
- [ ] 게임 완료 후 우승자 출력 기능
  - [ ] 우승자는 한 명 이상일 수 있다.

## 실행결과
```
경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).
pobi,crong,honux
시도할 회수는 몇회인가요?
5

실행 결과
pobi : -
crong : -
honux : -

pobi : --
crong : -
honux : --

pobi : ---
crong : --
honux : ---

pobi : ----
crong : ---
honux : ----

pobi : -----
crong : ----
honux : -----

pobi : -----
crong : ----
honux : -----

pobi, honux가 최종 우승했습니다.
```