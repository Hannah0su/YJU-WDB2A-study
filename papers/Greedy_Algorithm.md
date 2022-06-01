---
title: "[Greedy Algorithm] 그리디 알고리즘"
author: "유원규"
date: "2022-05-29"
---

# **Greedy Algorithm**  

**그리디 알고리즘(욕심쟁이 알고리즘, Greedy Algorithm)** 이란 "매 선택에서 지금 이 순간 당장 최적인 답을 선택하여 적합한 결과를 도출하자"라는 모토를 가지는 알고리즘 설계 기법이다.  

예를 들어 5개의 도시를 모두 한번씩만 거쳐서 여행하는 경로 중 기름값을 아끼기 위해 가능하면 짧은 경로를 이용하고 싶다고 가정하자.  
이 문제를 해결하기 위해 몇가지 전략을 사용할 수 있다. 가능한 120가지의 조합을 모두 살펴봐서 그중 가장 짧은 경로를 선택하는 것도 하나의 전략이 될 것이다. 그러한 다양한 방법 중, 그리디 알고리즘을 사용한다는 것은 "지금 내가 있는 도시에서 고를 수 있는 도로 중 가장 짧은 도로를 선택한다"라는 방법이 될 수 있다.  

단, 그리디 알고리즘을 사용하면 매 선택이 그 순간에 대해서는 최적이지만 그걸 종합적으로 봤을 땐 최적이라는 보장은 절대 없다는 것을 명심해야 한다. 위의 예시에서 매 순간 최적을 따라가면 1-1-1-100라는 순서로 가는데, 중간에 1-1-10-10으로 움직이는 것이 전체적으로 더 짧은 길이 될 수 있으니 말이다.  

그리디 알고리즘을 한마디로 설명한다면 그 유명한 마시멜로 실험에 비유할 수 있겠다.  
그리디 알고리즘을 사용한다는 것은 지금 당장 눈 앞에 있는 마시멜로를 먹는 것이다.  
하지만 이 방법을 사용하는 것은 "기다렸다가 2개를 먹는다"라는 최적 해를 보장해주지 못한다.  

그리디 알고리즘은 부분의 최적 해들의 집합이 곧 전체 문제의 해답이 될 때 사용할 수 있다. 위 서술 같은 경우는 그리디 알고리즘으로 해결 할 수 없는 문제에 그리디 알고리즘을 적용한 경우니 당연히 최적해를 보장해주지 못한다.  

---

## 예제 풀이  

### 1. 설탕 배달

![설탕배달](https://user-images.githubusercontent.com/83005178/170991540-51c26f82-08e0-4453-a503-74778caf00f4.png)

![설탕배달2](https://user-images.githubusercontent.com/83005178/170991590-cb9ceeb5-3abc-4114-a186-be7b3078586c.png)  

<br>

#### **문제해석**

먼저 문제에서 요구하는 것은 가장 적은 봉지를 구하는 것이다.  
만약에 입력받은 설탕의 수가 3의 봉지, 5의 봉지를 사용하여 정확하게 딱 나누어 떨어지지않는다면 –1을 출력해야하는 문제이다.  

또한 설탕 18kg의 경우에는 3kg봉지로만 사용한다면 6봉지이다.  
하지만 5kg봉지와 혼용해서 사용한다면 5kg봉지 3개 3kg봉지 1개로 4개만 사용하면된다.  
그렇게 혼용해서 사용했을 때 설탕의 무게를 정확하게 맞추고 최소의 봉지 사용을 해야한다는 것이 문제의 관건이다.  

<br>

#### **코드풀이**

```java

import java.util.Scanner;

public class BOJ_설탕배달_2839_B1 {
	public static void main(String[] args)   {
		//이문제의 핵심 요소는 첫번째 5로 나누어떨어지는경우를 먼저판별해야한다.
		//만일 5로 나누어떨어지지 않을 경우 2가지의 경우로 봐야한다.
		//1. 5와3을 복합적으로 사용해서 나누어떨어지는경우
		//2.3으로만 나누어떨어지는 경우
		//만약 위의 상황에 다 적용되지 않는다면 -1을 출력해야한다. 
			
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int result =0;
		int min =1700;
		if(n%5==0) { //5로나누어 떨어질 경우는 최소값이다.
			min = n/5;
		}else {
			//5로 나누어 떨어지지 않을경우 3으로 나누었을 경우 3과5를 복합적으로 나누었을경우를 살핀다.
			
			for (int i = 0; i<= n/5 ; i++) {
				//초반에 i*5 < n으로 멈추게 하였으나 그럴 경우 안돌아도 되는데 굳이돌아서
				//i <=n/5로 고침 이렇게 하면 필요한 만큼 for문이 실행이됨.
				if((n-i*5)%3==0) {//i=0일때 3으로 나누어 떨어지는지 검사가 가능하다.
					//3으로 나누어 떨어진 경우와 5와3을 섞어서 나누어떨어진경우를 비교하기 위해 min이란 변수를둔다.
					//n의 최대값은 5000이므로 3으로 나눈수가 1666정도이므로 대략 1700정도로 세팅한다.
					
					result=i+(n-i*5)/3;
					//i를 더해주는 이유는 5로 뺀 횟수이며 (n-i*5)/3은 5로빼고 남은 설탕이 3으로 나누어 떨어지는 갯수이다.
					
					if(min > result) {
						//min값이 1700이므로 무조건 min값은 바뀌게 된다. 
						//min값이 변경후 3으로 나누어 떨어지는 경우와 3과5를 복합적으로 섞어나누어 떨어지는 경우가 서로 비교되므로
						//어떤 방법이 더작은지에 대해 비교가능하다.
						min = result;
					}
				}
					
				}
			}
		if(min==1700) {//min이 1700이라는 뜻은 모든 case에 대해서 나누어 떨어지지 않는다는걸의미한다.
			System.out.println(-1);
		}else {//min의 값이 변동이 되었다면 한번이라도 나누어 떨어졌다는 뜻이므로 min값을 말한다.
			System.out.println(min);
		}
	}

}

```  
<br>
<br>

---

### 2. 캠핑

![캠핑](https://user-images.githubusercontent.com/83005178/170992357-6fd223a6-0de0-4f2f-8014-7ba46703fdd2.png)  

![캠핑 예제](https://user-images.githubusercontent.com/83005178/170992371-fff19227-663e-4c66-aa5f-bdccde95f533.png)  


<br>

#### **문제 해석**  


캠핑장을 가능한 날 p  
p일 중에 내가 사용가능한 날 l  
내 휴가의 전체 v  

case1의 경우에는 20일의 휴가중 캠핑장을 한번 사용하면 5일을 사용하고 3일을 사용하지못한다.  
그러면 8일을 2번 가면 16일중 10일은 캠핑장을 사용하였고, 6일은 캠핑장을 이용하지못하게된다.  
20일중 16일을 사용했으므로 남은 4일이 l보다 작으므로 그대로 캠핑을 이용했기에 20일 휴가동안 14일을 캠핑을 사용한 것이다.  






#### **코드풀이**  

```java
import java.util.Scanner;

public class BOJ_캠핑_4796_S5 {
public static void main(String[] args)   {
		
		Scanner sc = new Scanner(System.in);
		int testcase =1; //테스트케이스를 출력하기 위한 변수선언 1부터시작
		while(true) {
		int l = sc.nextInt();//p일 중캠핑장을 사용할 수 있는 날
		int p = sc.nextInt();//캠핑장을 사용가능한 날 
		int v = sc.nextInt();// 휴가날
		int date =v; //v의 날을 date란변수에 복사한다.
		int count =0 ; // 캠핑을 며칠동안했는지 count한다.
		
		if(l==p && p==v && v==0) {break;}//0 0 0 을 입력받으면 멈춘다.
		
		for (int i = 0; i <= v/p; i++) { //총일수/캠핑가능한일을 나눈값만큼 돌아야한다.
			if(date>l) { //캠핑가능한날이 date보다 더 큰경우
				count += l; //l만큼 캠핑을하였다.
				date -= p;// 연속으로 캠핑가능한 날을 date에서 빼준다.
			}else {//만약에 v <=l일 경우
				count+= date; //남은 date의 수를 count에다가 더해준다. 
			}
		}
		System.out.printf("Case %d: %d\n",testcase,count);//출력
		testcase++;//테스트케이스 1증가.
		}

	}
}
```  
<br>
<br>

---

### 3. 동전 0

![동전 0](https://user-images.githubusercontent.com/83005178/170992686-d2f788ca-58db-487d-ba1b-4d9949a772a9.png)  

![동전 0 예제](https://user-images.githubusercontent.com/83005178/170992696-f63a53a3-6473-4564-a863-468d6dcbe594.png)  


<br>

#### **문제해석**  

처음에 10개의 동전 종류가 몇갠지를 입력받고, 내가 가진 금액을 입력받는다.  
그후 2번째 줄부터 동전 종류의 금액에 관해서 입력을 받는다.  
그 동전을 사용해서 내가 가진금액을 환전을할 때 최소 몇 개의 동전이 필요한가? 에 대한 문제이다.  
이 문제는 내가가진 금액을 동전을 사용해서 표기가능하며 그 표기가능한 동전중 가장 큰 동전을 찾아서 0원이 될 때 까지 나누면된다.  
예제입력 1번에서 4200원이므로 천원짜리 4개 100원짜리 2개이므로 필요한 동전의 개수는 6개가된다.  

<br>

#### **코드풀이**  

```java
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class BOJ_µ¿Àü0_11047_S3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int count =0;
		int result =0;
		Integer [] arr = new Integer[n];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr, Collections.reverseOrder());
		while(true) {
			count =0;
			if(k==0) {
				break;
			}
			for (int i = 0; i < arr.length; i++) {
				if( k>=arr[i]) {
					result += k/arr[i];
					k %= arr[i];
				}
			}
		System.out.println(result);
		}
	}

}
```  
