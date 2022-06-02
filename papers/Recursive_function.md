---
title: "[Recursive function] 재귀 함수"
author: "곽유진"
date: "2022-05-31"
---
<br>

# **Recursive function 알고리즘**  

재귀함수는 정의 단계에서 자신을 재참조하는 함수를 뜻한다.  
어떤 사건이 자기 자신을 포함하고 다시 자기 자신을 사용하여 정의될 때 재귀적이라고 한다.  

특정 분기까지 자기 자신을 계속해서 호출하는데, 주로 **반복문**을 구현할 때 사용한다.  
우리가 흔히 알고 있는 반복문은 `for`, `while` 등이 있는데,  
이러한 반복문으로 구현가능한 로직은 모두 재귀함수로도 가능하고 그 반대 역시 가능하다.  

재귀함수를 작성할 때는 함수 내에서 다시 자신을 호출한 후 그 함수가 끝날 때까지 함수 호출 이후의 명령문이  
수행되지 않는다는 사실과 종료조건이 꼭 포함되어야한다는 부분을 인지하고 작성하면 **무한루프를 방지**할 수 있다.  

---
## 예제 풀이


[백준 10870번 피보나치 수 5](https://www.acmicpc.net/problem/10870)


![image](https://user-images.githubusercontent.com/102000749/171127667-c58b1e5a-3bd6-4be8-aa34-785ea48541ca.png)



![image](https://user-images.githubusercontent.com/102000749/171113676-0748df5e-e519-4079-8f4d-63c56a492f94.png)
 
피보나치 수열은 숫자의 앞에 값이 뒤에 값에 더하면서 계속해서 증가하는 규칙을 의미한다. 
 
위와 같이 **Fibonacci 함수 안에서 또 Fibonacci 함수를 호출하는 식**으로 재귀를 하는 것이다.  
그리고 재귀를 하다가 `N = 1` 이거나 `N = 0` 이면 더 이상 함수를 호출하지 않고  
`return` 시키면서 가장 안쪽 재귀부터 하나씩 값을 더해 `return` 해주는 방식이다.  

```java
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
public class Main {
	public static void main(String[] args) throws IOException {
  
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
		int N;
    
		N = Integer.parseInt(br.readLine());
    
		System.out.println(fibonacci(N));

	} // end of main

	public static int fibonacci(int N) {
    // 피보나치 수는 첫 번째 항과 두 번째 항은 0과 1로 고정이므로
    // N이 0과 1일 때 각각 0과 1을 return
    
		if (N == 0) return 0; // 재귀 종료 조건
    
		if (N == 1) return 1;
    
		return fibonacci(N - 1) + fibonacci(N - 2); 
    
	} // end of fibonacci
  
} // end of class
```
