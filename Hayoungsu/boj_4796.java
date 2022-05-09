import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class boj_4796 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    StringTokenizer st;
	    
	    int caseNum=1;  //출력 case 번호를 매기기 위함.
	    
	    while(true) {
	    	st = new StringTokenizer(br.readLine()," ");
	    	int l = Integer.parseInt(st.nextToken()); //캠핑 사용가능일
	    	int p = Integer.parseInt(st.nextToken());	//캠핑장 오픈일
	    	int v = Integer.parseInt(st.nextToken());	//총 휴가일수
	    	
	    	if(l==0) {
	    		break;
	    		}
	    	
	        System.out.printf("Case %d: %d\n",caseNum,(v/p)*l + Math.min(l,(v%p))); //min을 이용해서 총 휴가일을 넘어서는 경우는 배제
	        caseNum++;
	    }
	    br.close();
	    

	}

}
