package day09;

import java.io.*;

    public class Main {
        static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        public static void main(String[] args) throws Exception {


            int[] scores = null;
            int students = 0;

            while (true) {
                displayMenu(bw);

                int number = Integer.parseInt(br.readLine());

                switch (number) {
                    case 1:
                        bw.write("학생수> ");
                        bw.flush();
                        students = Integer.parseInt(br.readLine());
                        scores = new int[students];
                        break;
                    case 2:
                        if (scores == null) {
                            bw.write("먼저 학생 수를 입력하세요.\n");
                            bw.flush();
                        } else {
                            for (int i = 0; i < scores.length; i++) {
                                bw.write("scores[" + i + "]> ");
                                bw.flush();
                                scores[i] = Integer.parseInt(br.readLine());
                            }
                            bw.flush();
                        }
                        break;
                    case 3:
                        if (scores == null) {
                            bw.write("먼저 학생 수를 입력하세요.\n");
                            bw.flush();
                        } else {
                            bw.write("점수 리스트:\n");
                            for (int i = 0; i < scores.length; i++) {
                                bw.write("scores[" + i + "]: " + scores[i] + "\n");
                            }
                            bw.flush();
                        }
                        break;
                    case 4:
                        if (scores == null) {
                            bw.write("먼저 학생 수를 입력하세요.\n");
                            bw.flush();
                        } else {
                            int max = scores[0];
                            int sum = 0;

                            for (int score : scores) {
                                if (score > max) max = score;
                                sum += score;
                            }

                            double avg = (double) sum / scores.length;
                            bw.write("최고 점수: " + max + "\n");
                            bw.write(String.format("평균 점수: %.2f\n", avg));
                            bw.flush();
                        }
                        break;
                    case 5:
                        bw.write("프로그램을 종료합니다.\n");
                        bw.flush();
                        return;
                    default:
                        bw.write("잘못된 입력입니다. 다시 선택하세요.\n");
                        bw.flush();
                        break;
                }
            }
        }
        private static void displayMenu(BufferedWriter bw) throws IOException {
            bw.write("-----------------------------------------------------\n");
            bw.write("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료\n");
            bw.write("-----------------------------------------------------\n");
            bw.write("선택> ");
            bw.flush();
        }

    }

