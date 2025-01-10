package day03;

public class Test {
    public static void main(String[] args) {
        String str = "수식을 출력하면 계산 결과가 출력됩니다.";
        int a = 10;
        int b = 5;
        int result = a+b;
        String str1 = "내 생일은 2005년 6월 17일 입니다.";
        System.out.printf("%s%n%d + %d = %d%n%s",str,a,b,result,str1);

       //Java13 부터 텍스트 블록 문법을 제공함
         String str2 = """
                   subject score
                  ==============
                    korean    90
                   english   100
                  computer    80
                  김진수 학생의 점수는\
                  최우수로 졸업하였습니다.
                  """;
        System.out.println(str2);


        byte bb = 10;
        int cc = bb;
        long dd = cc;
        float ff = dd;
        double doub = ff;
        System.out.printf("%f%n",doub);

       char charValue = 'A';
       int  intValue = (int)charValue;
        System.out.println(charValue);
        System.out.println(intValue);

        byte byteValue = 65;
        int charValue3= byteValue;

    }
}
