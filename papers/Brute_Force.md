---
title: "[Brute Force] 완전 탐색"
author: "하영수"
date: "2022-05-26"
---
<br>

# **Brute Force 알고리즘**  


브루트포스 알고리즘은 아주 단순한 알고리즘이다.  
예컨데, 캐리어의 비밀번호를 까먹었는데 내게 시간적인 여유가 있다면 000 부터 999까지 하나하나 숫자를 돌려가며 비밀번호를 맞춰볼 수 있다.  
이처럼 모든 경우의 수를 대입하여 탐색하는 알고리즘을 브루트포스 알고리즘이라고 부른다.  

간단하게 구현할 수 있는 것이 장점이지만, 실행시간이 매우 오래 걸린다는 단점이 있다.  

---
## 예제 풀이

[백준 2309번 일곱난쟁이](https://www.acmicpc.net/problem/2309)

![그림1](https://user-images.githubusercontent.com/83005178/170444012-43d02498-71fa-45e5-9902-258102bc8947.png)

![그림2](https://user-images.githubusercontent.com/83005178/170444136-74328600-6193-4956-b0d1-93664a053826.png)


<img width="880" alt="aa" src="https://user-images.githubusercontent.com/83005178/170444424-af5b0c97-6d47-446e-8919-8e9ed436c2b7.PNG">

진짜 난쟁이들의 키를 모두 더하면 100이라는 수가 나오게된다.  
그리고 9명의 키는 서로 다른 수이며, 이들 중 가짜 2명만 찾아내면된다.  

<img src="https://latex.codecogs.com/svg.image?\large&space;_9C_2&space;=&space;36" title="https://latex.codecogs.com/svg.image?\large _9C_2 = 36" />

```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class boj_2309 {

	static int sum = 0;
	static int fake = 0;
	static int[] arr = new int[9];

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for (int i = 0; i < 9; i++) {
			arr[i] = Integer.parseInt(br.readLine()); //[0] 첫번째난쟁이키 [1]두번째로 입력받은 난쟁이키,[2] ..[3]..
			sum += arr[i]; // 모든 난쟁이들의 키를 더한다
		}
		//sum에는 9명(진짜7명 + 가짜 2명)
		
		
		fake = sum - 100; // 가짜 2명의 키를 더한 값 = 9명의 키 합계 - 100
		

		for (int i = 0; i < arr.length-1; i++) { ///난쟁이 1
			for (int j = i+1; j < arr.length; j++) { //난쟁이 2
				if (fake == arr[i] + arr[j]) {		
					arr[i] = arr[j] = 0; //가짜 난쟁이들의 값을 0으로 만듦 
					Arrays.sort(arr); //오름차순 정렬하여 가짜 난쟁이들을 인덱스 0,1에 보내줍니다. [0] 가짜한명 [1] 남은가짜한명/ [2]~[8] 진짜 7명의 키
					for (int k = 2; k < 9; k++) {
						System.out.println(arr[k]);//가짜난쟁이의 인덱스 0,1을 제외하고 출력 
					}
					return; //빠져나감
				}
			}
		}
	}

}
```  
