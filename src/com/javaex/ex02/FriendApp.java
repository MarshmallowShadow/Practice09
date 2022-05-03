package com.javaex.ex02;
import java.util.*;

public class FriendApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inputLine;
		String[] inputArray;
		ArrayList<Friend> fArray = new ArrayList<>();
		
		System.out.println("친구 3명을 입력하세요:");
		
		for(int i=0; i<3; i++) {
			inputLine = sc.nextLine();
			inputArray = inputLine.split(" ");
			fArray.add(new Friend(inputArray[0], inputArray[1], inputArray[2]));
		}
		
		for(Friend i: fArray) {
			i.showInfo();
		}
		
		sc.close();
	}

}
