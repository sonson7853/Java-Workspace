package com.kh.practice.dimension;

import java.util.Scanner;

public class DimensionPractice {
	
	public void practice1() {
		//3행 3열짜리 문자열 배열을 선언 및 할당하고
		//인덱스 0행 0열부터 2행 2열까지 차례대로 접근하여 “(0, 0)”과 같은 형식으로 저장 후 출력하세요.
		//ex.
		//(0, 0)(0, 1)(0, 2)
		//(1, 0)(1, 1)(1, 2)
		//(2, 0)(2, 1)(2, 2)
		
		String [][] arr = new String[3][3];
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.printf("(%d, %d)", i,j);
			}
			System.out.println();
		}
	}
	
	public void practice2() {
		//4행 4열짜리 정수형 배열을 선언 및 할당하고
		//1) 1 ~ 16까지 값을 차례대로 저장하세요.
		//2) 저장된 값들을 차례대로 출력하세요.
		//ex.
		//1 2 3 4 
		//5 6 7 8 
		//9 10 11 12 
		//13 14 15 16
		
		int[][] arr = new int[4][4];
		
		int value = 1;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
			arr[i][j] = value++;
			}
		}
		printArray(arr);
	}
	
	public void practice3() {
		//4행 4열짜리 정수형 배열을 선언 및 할당하고
		//1) 16 ~ 1과 같이 값을 거꾸로 저장하세요.
		//2) 저장된 값들을 차례대로 출력하세요.
		//ex.
		//16 15 14 13 
		//12 11 10 9 
		//8 7 6 5 
		//4 3 2 1
		
		int[][] arr = new int[4][4];
		
		int value = 16;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = value--;
			}
		}		
		printArray(arr);
	}
	
	
	public void practice4() {
		//4행 4열 2차원 배열을 생성하여 0행 0열부터 2행 2열까지는 1~10까지의 임의의 정수 값 저장 후
		//아래의 내용처럼 처리하세요.
		//ex.
		//6 6 1 13 
		//4 10 8 22 
		//8 6 5 19 
		//18 22 14 108 
		int[][] arr = new int[4][4];
		
		for(int i=0; i<arr.length-1; i++) {
			for(int j=0; j<arr[i].length-1; j++) {
				arr[i][j] = (int) (Math.random() *10 + 1); 
				arr[i][3] = arr[i][3] + arr[i][j]; //각 행의 모든 값의 합
				arr[3][j] = arr[3][j] + arr[i][j]; //각 열의 모든 값의 합
				arr[3][3] += arr[i][j]* 2;
			}
		}
		printArray(arr);		
	}
	
	
	
	public void practice5() {
		//2차원 배열의 행과 열의 크기를 사용자에게 직접 입력받되, 1~10사이 숫자가 아니면
		//“반드시 1~10 사이의 정수를 입력해야 합니다.” 출력 후 다시 정수를 받게 하세요.
		//크기가 정해진 이차원 배열 안에는 영어 대문자가 랜덤으로 들어가게 한 뒤 출력하세요.
		//(char형은 숫자를 더해서 문자를 표현할 수 있고 65는 A를 나타냄)
		//ex.
		//행 크기 : 5
		//열 크기 : 4
		//T P M B 
		//U I H S 
		//Q M B H 
		//H B I X 
		//G F X I		
		Scanner sc = new Scanner(System.in);
		
		while(true) {			
			System.out.print("행 크기 : ");
			int row = sc.nextInt();
			System.out.print("열 크기 : ");
			int col = sc.nextInt();
			
			if(!(row>=1 && row<=10 && col>=1 && col<=10)) {
				System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다.");
				continue;
			}
			
			char[][] arr = new char[row][col];
			for(int i=0; i<arr.length; i++) {
				for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = (char)(int) (Math.random() * 26 + 65);
				}
			}	
			for(int i=0; i<arr.length; i++) {
				for(int j=0; j<arr[i].length; j++) {
					System.out.printf("%2c ", arr[i][j]);
				}
				System.out.println();
			}
			break;
		}		
	}
	
	
	public void practice6() {
		//String[][] strArr = new String[][] {
		//{"이", "까", "왔", "앞", "힘"}, 
		//{"차", "지", "습", "으", "냅"}, 
		//{"원", "열", "니", "로", "시"}, 
		//{"배", "심", "다", "좀", "다"}, 
		//{"열", "히", "! ", "더", "!! "}};
		//위의 초기화되어 있는 배열을 가지고 아래의 ‘[그림] 실습문제4 흐름’과 같은 방식으로 출력하세요.
		//단, print()를 사용하고 값 사이에 띄어쓰기(“ “)가 존재하도록 출력하세요
		
		String[][] strArr = new String[][] {
			{"이", "까", "왔", "앞", "힘"}, 
			{"차", "지", "습", "으", "냅"}, 
			{"원", "열", "니", "로", "시"}, 
			{"배", "심", "다", "좀", "다"}, 
			{"열", "히", "! ", "더", "!! "}};
		
			for(int i=0; i<strArr[0].length; i++) {
				for(int j=0; j<strArr.length; j++) {
				System.out.print(strArr[j][i] + " ");
				}	
			}						
	}
	
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		//사용자에게 행의 크기를 입력 받고 그 수만큼의 반복을 통해 열의 크기도 받아
		//문자형 가변 배열을 선언 및 할당하세요.
		//그리고 각 인덱스에 ‘a’부터 총 인덱스의 개수만큼 하나씩 늘려 저장하고 출력하세요.
		//ex.
		//행의 크기 : 4
		//0행의 열 크기 : 2
		//1행의 열 크기 : 6
		//2행의 열 크기 : 3
		//3행의 열 크기 : 5
		//a b 
		//c d e f g h 
		//i j k 
		//l m n o p 
		System.out.print("행의 크기 : ");
		int row = sc.nextInt();
		
		char[][] arr = new char[row][];
		for(int i=0; i<arr.length; i++) {
			System.out.print(i + "행의 열 크기 : ");
			int col = sc.nextInt();
			char [] arr2 = new char[col];
			//arr [i] = arr2;
		}	
		char ch = 'a';
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
			arr[i][j] = ch;
			if(ch == 'z') {
				ch = 'a';
			} else {
				ch++;				
			}
		  }	
		}		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.printf("%2c ", arr[i][j]);
			}
			System.out.println();
		}
	}
	
	
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		//1차원 배열에 12명의 학생들을 출석부 순으로 초기화 하고
		//2열 3행으로 2차원 배열 2개를 이용하여 분단을 나눠
		//1분단 왼쪽부터 오른쪽, 1행에서 아래 행 순으로 자리를 배치하세요.
		//<출석부>
		//1. 강건강 2. 남나나 3. 도대담 4. 류라라 5. 문미미 6. 박보배
		//7. 송성실 8. 윤예의 9. 진재주 10. 차천축 11. 피풍표 12. 홍하하
		//ex.
		//== 1분단 ==
		//강건강 남나나
		//도대담 류라라
		//문미미 박보배
		//== 2분단 ==
		//송성실 윤예의
		//진재주 차천축			
		//피풍표 홍하하
		
		String [] arr = {"강건강", "남나나", "도대담", "류라라", "문미미", "박보배", "송성실",  "윤예의", "진재주", "차천축", "피풍표",
						"홍하하"};
		String [][] class1 = new String [3][2];
		String [][] class2 = new String [3][2];
		
		int index = 0;
		System.out.println("== 1분단 ==");
		for(int i=0; i<class1.length; i++) {
			for(int j=0; j<class1[i].length; j++) {
				class1[i][j] = arr[index++]; 
				System.out.print(class1[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("== 2분단 ==");
		for(int i=0; i<class2.length; i++) {
			for(int j=0; j<class2[i].length; j++) {
				class2[i][j] = arr[index++]; 
				System.out.print(class2[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.print("검색할 학생 이름을 입력하세요 : ");
		String name = sc.nextLine();
		
		char [] line = {'첫', '두', '세'};
		for(int i=0; i<class1.length; i++) {
			for(int j=0; j<class1[i].length; j++) {
				if(class1[i][j].equals(name)) {
					System.out.printf("검색하신 %s 학생은 1분단 %c 번째 줄 %s쪽에 있습니다", name, line[i], j==0 ? "왼" : "오른" );
				}
			}
		}
		for(int i=0; i<class2.length; i++) {
			for(int j=0; j<class2[i].length; j++) {
				if(class2[i][j].equals(name)) {
					System.out.printf("검색하신 %s 학생은 2분단 %c 번째 줄 %s쪽에 있습니다", name, line[i], j==0 ? "왼" : "오른" );
				}
			}
		}
	}
	
	
	public void practice9() {
		//위 문제에서 자리 배리 배치한 것을 가지고 학생 이름을 검색하여
		//해당 학생이 어느 자리에 앉았는지 출력하세요.
		//ex.
		//== 1분단 ==
		//강건강 남나나
		//도대담 류라라
		//문미미 박보배
		//== 2분단 ==
		//송성실 윤예의
		//진재주 차천축
		//피풍표 홍하하
		//============================
		//검색할 학생 이름을 입력하세요 : 차천축
		//검색하신 차천축 학생은 2분단 두 번째 줄 오른쪽에 있습니다
	}
	
	public void printArray(int[][] arr) {
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.printf("%2d ", arr[i][j]);
			}
			System.out.println();
		}
	}
}


