package Wilderness;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class csQA {

	static void customercenter() throws IOException {
		int num = 0;
		boolean play = true;
				System.out.println(" 1. 홈페이지에서 미리 좌석을 선택할 수 있나요?\n " + "2. 가족 등록 신청, 변경, 삭제는 어떻게 해야 하나요?\n "
						+ "3. 홈페이지에서 가족 마일리지를 합산하는 방법을 알고 싶어요\n " + "4. 홈페이지에서 좌석 선택은 어디에서 할 수 있나요?\n "
						+ "5. 스카이패스 마일리지를 사용하면 어떤 서비스나 상품을 이용할 수 있나요?\n " + "6. 1:1문의하기\n" + " 7. 종료\n");
				while (play) {
					try {
				Scanner sc = new Scanner(System.in);

				System.out.println();
				System.out.print("질문을 선택해주세요> ");
				num = sc.nextInt();

				switch (num) {

				case 1:

					System.out.println("1. 홈페이지에서 미리 좌석을 선택할 수 있나요?");
					System.out.println("네, 가능합니다.");
					break;
				case 2:
					System.out.println("2. 가족 등록 신청, 변경, 삭제는 어떻게 해야 하나요?");
					System.out.println("네, 가능합니다.");
					break;
				case 3:
					System.out.println("3. 홈페이지에서 가족 마일리지를 합산하는 방법을 알고 싶어요.");
					System.out.println("네, 가능합니다.");
					break;
				case 4:
					System.out.println("4. 홈페이지에서 좌석 선택은 어디에서 할 수 있나요?");
					System.out.println("네, 가능합니다.");
					break;
				case 5:
					System.out.println("5. 스카이패스 마일리지를 사용하면 어떤 서비스나 상품을 이용할 수 있나요?");
					System.out.println("네, 가능합니다.");
					break;
				case 6:

					BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
					String str;

					System.out.print("질문을 입력하여 주세요 >");

					str = br.readLine();
					// System.out.println(str);

					BufferedOutputStream bs = null;
					try {
						bs = new BufferedOutputStream(new FileOutputStream("C:\\Temp\\Output.txt"));

						bs.write(str.getBytes()); // Byte형으로만 넣을 수 있음

					} catch (IOException e) {
						System.out.println("잘못된 입력입니다. 다시 선택하여 주세요");
						// e.getStackTrace();

					} finally {
						System.out.println("정상처리되었습니다. ");
						bs.close();
					}
					break;
				case 7:
					play = false;
				}
			} catch (Exception e) {
				System.out.println("잘못된 입력입니다. 다시 입력하세요.");
			}

		}

	}
	public static void main(String[] args) throws IOException {
		customercenter();
	}
}
