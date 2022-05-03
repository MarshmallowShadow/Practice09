package com.javaex.ex03;
import java.util.*;

public class GoodsApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Goods> gArray = new ArrayList<>();
        String[] input;
        
        while(true) {
        	input = sc.nextLine().split(",");
        	if(input[0].equals("q")) {
        		break;
        	}
        	gArray.add(new Goods(input[0], Integer.parseInt(input[1]), Integer.parseInt(input[2])));
        }
        
        Iterator<Goods> it = gArray.iterator();
        while(it.hasNext()) {
        	it.next().showInfo();
        }
        
        Goods.showTotal();
        
        sc.close();
    }

}
