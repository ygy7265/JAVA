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
			int grade = map.get(calling); //��� ��������
			String forwardCalling = players[grade-1]; //�߿����ѻ�����
			
			players[grade - 1] = calling; //�Ҹ���� ��� �÷��ֱ�
			map.put(calling, grade - 1); //�̸��� ��� �־��ֱ�
			
			players[grade] = forwardCalling; //�߿����Ѽ��� ���� ��ũ�� �־��ֱ�
			map.put(forwardCalling, grade); //�̸��� ��ũ�־��ֱ�
		}
		return players; //��������
		
	}
}
