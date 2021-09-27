

#### Divide and Conquer 알고리즘
여러 알고리즘의 기본이 되는 해결방법으로, 크고 방대한 문제를 조금씩 나눠서 푼 다음, 그것들을 다시 합쳐서 해결하는 개념이다.
재귀적으로 자신을 호출하면서 그 연산의 단위를 조금씩 줄여간다. 어떤 조건을 만족할 때까지 문제를 쪼개고 쪼개서 값을 구한다.

#### BruteForce 알고리즘
모든 경우의 수를 다 대입하여 답을 찾는 것으로, 무식한 방법이라고 말할 수는 있지만 정확도 100%를 보장한다.



---

#### 정렬(210621)

- BJ2750 - 수 정렬하기

  가장 기본적인 정렬 문제이다. 버블 정렬을 이용하여 풀었다. 시간 제한이나 메모리 제한이 딱히 없었기 때문에 `Scanner`를 통해 입력 받았고, `System.out.println`로 출력할 수 있었다.

- BJ2751 - 수 정렬하기2

  제한 시간이 2초였기 때문에, 입력과 출력 방법을 모두 바꿔야 했다. `BufferedReader`와 `StringBuilder`를 이용하였다. 그리고 `Collectios.sort`를 사용하기 위하여 `ArrayList`에 숫자를 저장하였다.

- BJ10989 - 수 정렬하기3

  이 문제는 제한 시간은 3초였지만, 수 정렬하기2를 그대로 제출해보니 메모리 부족 문제가 있었다. 그래서 `ArrayList`를 사용하지 않고 배열에 숫자를 저장하여, `Arrays.sort`메소드를 사용하였다. 


## PR1 핸드폰번호가리기

### ✏️나의 풀이

```jsx
class Solution {
	public String solution(String phone_number) {
	String answer = "";
	for(int i=0; i<phone_number.length()-4; i++) {
		answer += "*";
	}
	answer += phone_number.substring(phone_number.length()-4);
	//answer += phone_number.substring(phone_number.length()-4, phone_number.length());
	return answer;
	}
}
```

1. 휴대폰 번호 뒤에 4자리 빼고 *로 바꾸고 
2. 뒤에 4자리를 붙였다.
3. ‼️substring()에서 끝 인덱스가 마지막 인덱스랑 일치하면 안써도 됨

### ✏️다른 사람의 풀이

```jsx
class Solution {
  public String solution(String phone_number) {
     char[] ch = phone_number.toCharArray();
     for(int i = 0; i < ch.length - 4; i ++){
         ch[i] = '*';
     }
     return String.valueOf(ch);
  }
}
```

1. 문자열을 char array로 바꾸고
2. 뒤에 4자리 빼고 *로 바꾸고
3. String.valueOf( )를 통해 문자열로 바꿨다.

### ✏️코틀린으로 짠 것

```jsx
var answer = phone_number.toCharArray()
    for(i in 0 until answer.size-4) {
        answer[i] = '*'
    }
    return String(answer)
```

### ✏️다른 사람이 코틀린으로 짠 것

```jsx
class Solution {
    fun solution(phone_number: String): String {
        return "${"".padStart(phone_number.length - 4, '*')}${phone_number.takeLast(4)}"
    }
}
```

**.padStart(length, char)**

**.takeLast(N)**

