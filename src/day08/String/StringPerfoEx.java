package day08.String;

public class StringPerfoEx {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer();
        StringBuilder stringBuilder = new StringBuilder();

        new Thread(() -> {
            for (int i = 0; i < 100000; i++) {
                stringBuffer.append(1);
                stringBuilder.append(1);
            }
        }).start();

        new Thread(() -> {
            for (int i = 0; i < 100000; i++) {
                stringBuffer.append(1);
                stringBuilder.append(1);
            }
        }).start();

        new Thread(() -> {
            try {
                Thread.sleep(2000);

                System.out.println("StringBuffer.length :" + stringBuffer.length());
                System.out.println("StringBuilder.length :" + stringBuilder.length());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            }).start();

    }
}
