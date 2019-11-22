package OA;

public class MaximumTime {

	    public static String maxTime(String time){
	        char[] cTime = time.toCharArray(), ans = "23:59".toCharArray();
	        ans[0] = cTime[1] != '?' && cTime[1] > '3' ? '1' : ans[0];
	        ans[1] = cTime[0] != '?' && cTime[0] < '2' ? '9' : ans[1];
	        for(int i = 0; i < cTime.length; ++i){
	            ans[i] = cTime[i] != '?' ? cTime[i] : ans[i];
	        }
	        return new String(ans);
	    }    
	    public static void main(String[] args) {
	        System.out.println(maxTime("?4:5?"));
	        System.out.println(maxTime("?4:??"));
	        System.out.println(maxTime("?3:??"));
	        System.out.println(maxTime("23:5?"));
	        System.out.println(maxTime("2?:22"));
	        System.out.println(maxTime("0?:??"));
	        System.out.println(maxTime("1?:??"));
	        System.out.println(maxTime("??:??"));
	        System.out.println(maxTime("?4:0?"));
	        System.out.println(maxTime("?9:4?"));
	    }

}
