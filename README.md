# 숫자 야구 게임
## 진행 방법
* 숫자 야구 게임 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 과제를 제출한다.

## 과제 제출 과정
* [과제 제출 방법](https://github.com/next-step/nextstep-docs/tree/master/precourse)

## 요구사항 기능 분석
* 1~9까지 서로 다른 3자리 수 입력
* 잘못된 값을 입력하면 illegalAgumentException 발생 후 종료
* 1~9까지 서로 다른 3자리 수 임의 생성
* 입력받은 수의 판정
  * 같은 자리 같은 수 : 스트라이크
  * 다른 자리 같은 수 : 볼
  * 같은 수가 없음    : 낫싱
* 판정된 결과 출력
* 3스트라이크 나올때 까지 반복
* 게임 종료 후 종료,재시작 선택