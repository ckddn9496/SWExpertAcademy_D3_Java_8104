# SWExpertAcademy_D3_Java_8104

## SW Expert Academy D3 8104. 조 만들기

### 1. 문제설명

출처: https://swexpertacademy.com/main/code/problem/problemList.do

input으로 두 정수 `N`, `K` 를 받는다. `N`명으로 구성된 조 `K`개를 만들 때 `1`등부터 `K`등 학생을 `1`번 조에서 `K`번 조까지 들어가고 `K+1`등부터 `2K`등인 학생은 역순으로 `1`번 조에서 `K`번 조까지 들어간다.

조의 실력은 조를 이루고 있는 사람들의 등수의 합이다. `1`번 조에서 `K`번 조까지 실력을 순서대로 모두 출력하는 문제.

[입력]
> 첫 번째 줄에 테스트 케이스의 수 `T`가 주어진다.
> 각 테스트 케이스의 첫 번째 줄에는 두 정수 `N`, `K` `(1 ≤ N, K ≤ 20)`가 공백 하나로 구분되어 주어진다.

[출력]

> 각 테스트 케이스마다 `#x`(`x`는 테스트케이스 번호를 의미하며 `1`부터 시작한다)를 출력하고,
> 각 테스트 케이스마다 `1`번 조의 실력에서 `K`번 조의 실력을 나타내는 `K`개의 정수를 순서대로 공백 하나로 구분하여 출력한다.

### 2. 풀이

`N`과 `K`에 대하여 조의 실력을 계산할 수 있다. `q = N/2`, `r = N%2`라고 할때 `r == 0`을(`N`이 짝수) 만족한다면, 모든 조가 같은 실력을 가진다. `r == 1`을 (`N`이 홀수) 만족한다면, `1`조 부터 `K`조 까지 1씩 실력이 증가하게된다. `1`번 조의 실력을 알 수 있다면 모든 조의 실력을 계산할 수 있다. `1`조의 실력은 `q`와 `k`로 구성된 일반식으로 표현할 수 있어 출력해주었다.

`String`에 더하기 연산을 이용할 때 반복문에서는 효율이 좋지않기 때문에 `StringBuilder`를 사용하여 메모리 낭비를 줄였다.


```java
String[] NK = sc.nextLine().split(" ");
int N = Integer.parseInt(NK[0]);
int K = Integer.parseInt(NK[1]);

int q = N/2;
int r = N%2;

StringBuilder result = new StringBuilder();
int num;

if (r == 0) {
  num = 2*q*q*K + q;
  result.append("#"+test_case+" ");
  for (int i = 0; i < K; i++) {
    result.append(Integer.toString(num)+" ");
  }
  System.out.println(result.toString());
} else {
  num = 2*q*q*K + q + 2*q*K + 1;
  result.append("#"+test_case+" ");
  for (int i = 0; i < K; i++) {
    result.append(Integer.toString(num++)+" ");
  }
  System.out.println(result.toString());
}
```
