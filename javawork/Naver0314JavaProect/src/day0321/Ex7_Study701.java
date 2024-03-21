package day0321;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;

public class Ex7_Study701 {

	public static void main(String[] args) {
		
		Date date = new Date();
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss EEE");
		System.out.println(sdf1.format(date)); // 2024-03-19 16:33:15 화
		
		String []members= {
				"강하윤","공병현","김도훈","김우형","김정호",
				"김창인","민경진","박민지","박보민","박주용",
				"박한경","배동우","서정현","손가원","시바타유니",
				"신완철","우태형","유상곤","이가현","이병현",
				"이장우","이현성","정민석","정상혁","정진욱",
				"정환용","최시현","허승필","황재웅","꽝!!!!"
		};
		
		String [][]arr = new String[6][5];
		

		int []rand = new int[30];
		Loop:
		for(int i = 0; i<rand.length; i++) {
			int n = (int)(Math.random()*30);
			rand[i] = n;
			
			for(int j = 0; j<i; j++) {
				if(rand[i]==rand[j]) {
					i--; // 다시 제자리로 가기 위해서 일단 1을 빼고 이동
					continue Loop; //i++로 이동
				}
			} 
		}
		
		int id = 0;
		for(int i= 0; i<6; i++) {
			for(int j= 0; j<5; j++) {
				arr[i][j] = members[rand[id++]];
			}
			
			System.out.print(i+1 + " 조:   ");
			for(int j= 0; j<5; j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
