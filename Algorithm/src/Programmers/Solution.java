package Programmers;

import java.util.*;

public class Solution {
	public String[] solution(String[] players,String[] callings) {
		Map<String, Integer> map = new HashMap<>();
		for(int i=0;i<players.length;i++) {
			String player = players[i];
			
			map.put(player, i);
		}
		
		for(String calling : callings) {
			int grade = map.get(calling); //등수 가져오기
			String forwardCalling = players[grade-1]; //추월당한사람등수
			
			players[grade - 1] = calling; //불린사람 등수 올려주기
			map.put(calling, grade - 1); //이름과 등수 넣어주기
			
			players[grade] = forwardCalling; //추월당한선수 현재 랭크에 넣어주기
			map.put(forwardCalling, grade); //이름과 랭크넣어주기
		}
		return players; //선수리턴
		
	}
}
