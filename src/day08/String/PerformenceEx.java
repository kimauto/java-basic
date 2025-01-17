package day08.String;
//String , StringBuffer, StringBuilder 객체를 선언하고 5만번을 루프하여 "*"문자를 추가한 로직
//duration1, duration2, duration3 변수에 계산하여 비교해 보자
//비교해 보면 싱글쓰레드 환경 스트링 작업은 StringBuilder 성능 월등하다.
public class PerformenceEx {
    public static void main(String[] args) {
        final int lengths = 50000;

// ------------- (1) String의 +연산을 이용해서 50,000개의 *를 이어 붙인다.
        long startTime1 = System.currentTimeMillis(); // 시작시간을 기록 (millisecond단위)

        String str="";
        for(int i=0;i<lengths;i++){
            str=str+"*";
        }

        long endTime1 = System.currentTimeMillis(); // 종료시간을 기록(millisecond단위)


// ------------- (2) StringBuffer를 이용해서 50,000개의 *를 이어붙인다.
        long startTime2 = System.currentTimeMillis();

        StringBuffer sb = new StringBuffer();
        for(int i=0;i<lengths;i++){
            sb.append("*");
        }

        long endTime2 = System.currentTimeMillis();


// ------------- (3) StringBuilder를 이용해서 50,000개의 *를 이어붙인다.
        long startTime3 = System.currentTimeMillis();

        StringBuilder sb2 = new StringBuilder();
        for(int i=0;i<lengths;i++){
            sb2.append("*");
        }

        long endTime3 = System.currentTimeMillis();


// ------------- 방법(1), 방법(2), 방법(3)가 걸린 시간을 비교
        long duration1 = endTime1 - startTime1;
        long duration2 = endTime2 - startTime2;
        long duration3 = endTime3 - startTime3;

        System.out.println("String의 +연산을 이용한 경우 : "+ duration1); // 559
        System.out.println("StringBuffer의 append()을 이용한 경우 : "+ duration2); // 10
        System.out.println("StringBuilder의 append()을 이용한 경우 : "+ duration3); // 3
    }
}
