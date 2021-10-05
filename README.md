# 숫자 야구 게임
## 진행 방법
* 숫자 야구 게임 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 과제를 제출한다.

## 과제 제출 과정
* [과제 제출 방법](https://github.com/next-step/nextstep-docs/tree/master/precourse)

## 기능 목록
### 플레이방식
* 플레이어가 임의의 서로다른 3자리 숫자를 입력하고 상대방(컴퓨터)가 생성한 임의의 3자리를 비교한다.
* 상대방(컴퓨터)는 플레이어가 입력한 3자리수와 상대방(컴퓨터)가 생성한 3자리수를 비교하여 결과 출력
* 이 과정을 반복하여 플레이어가 3자리를 모두 맞추면 승리

### 승리조건
* 아래의 힌트들을 이용하여 상대방의 수를 맞추면(3 스트라이크) 승리한다.

### 판정조건
* 같은 자리의 같은 수 = 스트라이크
* 다른 자리의 같은 수 = 볼
* 모두 다른 수 = 포볼, 낫싱

### 사용자 실수
* 숫자만 입력했는지 확인
* 1~9사이의 수만 입력했는지 확인
* 공백인지 확인
* 3자리가 맞는지 확인
* 게임 재시작 및 종료 입력이 1또는 2가 입력되는지 확인

### 승리(게임종료) 후
* 다시 게임을 진행하거나 완전히 종료하여야 한다.