---
title: "[Stack] 스택"
author: "백정훈"
date: "2022-05-30"
---

<br>

# **Stack 알고리즘**

`스택 알고리즘`은 말 그대로 **스택을 이해하느냐**에 초점을 두고 있습니다.

스택의 기본 원칙은 `LIFO : Last in First out (후입선출)` 입니다. 이는 말 그대로 **나중에 들어온 것이 먼저 나가는 방식**을 의미합니다.  
`프링글스 통`으로 이해하시면 쉽습니다.  
<img width="20%" height="20%" alt="프링글스" src="https://user-images.githubusercontent.com/103083251/171011882-9b3c5cee-9859-48d6-8a73-c7a6a569474d.png">  
`(push)가장 나중에 들어간 감자칩부터 (pop)집어 먹을 수 있습니다.`  
이를 조금 바꿔서 얘기하자면, 스택에서의 접근은 언제나 목록의 끝에서만 가능합니다.

그림으로 보면 이렇습니다.  
![스택설명1](https://user-images.githubusercontent.com/103083251/171014412-88eef7d3-1acf-459e-a05f-209302a0cdc3.jpg)  
`먼저 들어온 것은 가장 아래에 있고, 가장 아래에 있으니 가장 나중에 빠져나오게 됩니다.`

이러한 구조는 보통 `뒤로 가기`, `실행 취소(undo)`, `컴퓨터의 Stack Memory` 에서 쓰입니다. 그 이유는 `스택`이 가진 장점에 있습니다. 스택은 `후입선출` 방식인데, 이는 **바로 이전의 데이터를 빠르게 갖고올 수 있다**는 장점을 가지고 있습니다.

<img width="45%" height="45%" alt="스택설명2" src="https://user-images.githubusercontent.com/103083251/171016562-611d8b08-0fc1-4127-80e9-3c1696968012.png">  
기본적으로 Stack 클래스는 `Object[]` 배열을 사용하여 데이터들을 관리하고 있습니다.

- Bottom: **가장 밑에 있는 데이터**, 또는 그 데이터의 인덱스를 의미합니다.
- Top: **가장 위에 있는 데이터**, 또는 그 데이터의 인덱스를 의미합니다.
- Capacity: **데이터를 담기 위한 용적**을 의미합니다.
- size: **데이터의 개수**를 의미합니다.

---

- push: 스택에서 **데이터를 추가하는 작업**을 의미합니다. 이는 top값을 하나 증가시킨 후 새로운 데이터를 삽입하도록 구현합니다.
- pop: 스택에서 **데이터를 삭제(추출)하는 작업**을 의미합니다. 이는 top이 가리키고 있는 자료를 삭제한 후 top값을 하나 감소시키도록 구현합니다.
- peek: 스택에서 **top이 가리키는 데이터를 읽는 작업**을 의미합니다. top값의 변화는 없습니다.

<img width="45%" height="45%" alt="push" src="https://user-images.githubusercontent.com/103083251/171018594-60eb0665-1280-4c49-bf63-2d10f348bc33.png">  
  
<img width="45%" height="45%" alt="pop" src="https://user-images.githubusercontent.com/103083251/171018774-532abbd5-184d-402c-aed3-38f0c1a75a1f.png">  

---

## 예제 풀이

[백준 10828번 스택](https://www.acmicpc.net/problem/10828)

![문제](https://user-images.githubusercontent.com/103083251/171020781-f441b318-f105-4b5b-8062-0c8f4ff876bd.png)

![입출력](https://user-images.githubusercontent.com/103083251/171020984-262e8cf5-7e54-4f1c-b586-e2c270590ee5.png)

<img width="70%" height="70%" alt="예제입출력1" src="https://user-images.githubusercontent.com/103083251/171021308-8314e1a5-dbea-4163-9b42-a634e2c18351.png">  

<img width="70%" height="70%" alt="예제입출력2" src="https://user-images.githubusercontent.com/103083251/171021501-c9ccf894-f652-4c28-8c7a-be3d1b28b0db.png">  

```java
import java.util.Scanner;

public class BOJ_10828 {
	public static int[] stack;
	public static int size = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 제한 시간이 0.5초라서 'print 메서드' 대신 'StringBuilder'를 사용
		StringBuilder sb = new StringBuilder();

		int n = sc.nextInt(); // 입력받는 수 n

		stack = new int[n];

		for(int i=0; i<n; i++) {
			String str = sc.next(); // 입력받은 명령어를 담는 변수

			switch(str) {
			case "push":
				push(sc.nextInt());
				break;

			case "pop":
				sb.append(pop()).append('\n');
				break;

			case "size":
				sb.append(size()).append('\n');
				break;

			case "empty":
				sb.append(empty()).append('\n');
				break;

			case "top":
				sb.append(top()).append('\n');
				break;
			}
		}
		System.out.println(sb);
		sc.close();
	}

	// push: 정수 item을 스택에 넣는 연산입니다.
	public static void push(int item) {
		stack[size] = item; // size칸에 item을 넣고 size를 1증가
		size++;
	}

	// pop: 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력합니다.
	// 만약 스택에 들어있는 정수가 없는 경우는 -1을 출력합니다.
	public static int pop() {
		// 데이터가 1개도 없으면 -1을 반환
		if(size == 0) {
			return -1;
		} else {
			// 인덱스는 0부터 시작하므로 최상단에 있는 요소는 size-1 인덱스에 위치합니다.
			int res = stack[size - 1];
			stack[size - 1] = 0; // 0으로 초기화 해줌
			size--;
			return res;
		}
	}

	// size: 스택에 들어있는 정수의 개수를 출력합니다.
	public static int size() {
		return size; // 요소 개수를 반환합니다.
	}

	// empty: 스택이 비어있으면 1, 아니면 0을 출력합니다.
	public static int empty() {
		if(size == 0) {
			return 1; // 스택이 비어있으면 1을 반환합니다.
		} else {
			return 0;
		}
	}

	// top: 스택의 가장 위에 있는 정수를 출력합니다.
	// 만약 스택에 들어있는 정수가 없는 경우는 -1을 출력합니다.
	public static int top() {
		if(size == 0) {
			return -1; // 데이터가 하나도 없으면 -1을 반환합니다.
		} else {
			return stack[size-1]; // 배열의 최상단(top) 데이터를 반환합니다.
		}
	}

}
```
