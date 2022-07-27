package day19;

public class day19_2 {

	public static void main(String[] args) {

		int[] arrD = { 12, 25, 36, 20, 30, 8, 42 };
		int[] arrH = new int[11];
		
					//해시태그 저장
		
		int i = 0;

		for (i = 0; i < arrD.length; i++) {
			int k = arrD[i] % 11;

			while (true) {
				if (arrH[k] != 0) {
					k = (k + 1) % 11;
				} else {
					arrH[k] = arrD[i];
					break;
				}
			}
		}
		for (int j = 0; j < arrH.length; j++) {
			System.out.print(arrH[j] + " ");

		}
		
				// 해시태그 출력
		
		System.out.println();

		int x = 8;
		int k = x;
		k = k % 11;

		while (arrH[k] != 0) {
			if (arrH[k] == x) {
				System.out.println(x + "의 저장 위치는 " + k + "번째 입니다.");
				break;
			}

			else {
				k = (k + 1) % 11;
			}

		}
		if (arrH[k] == 0) {
			System.out.println(x + "값은 존재하지 않습니다.");
		}

	}
}
