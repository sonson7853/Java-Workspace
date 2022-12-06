package com.kh.practice.list.music.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.kh.practice.list.music.model.compare.AscTitle;
import com.kh.practice.list.music.model.vo.Music;



public class MusicController {

	private List<Music> list = new ArrayList();
	
	public int addList(Music music) {
		// 마지막 리스트에 객체 저장, 1 리턴
		int result = 0;
		try {
			list.add(music);
			result = 1;
		} catch(Exception e) {
			result = 0;
		}
		return result;
	}
	
	public int addAtZero(Music music) {
		// 첫 번째 리스트에 객체 저장, 1 리턴
		int result = 0;
		try {
			list.add(0, music);
			result = 1;
		} catch(Exception e) {
			result = 0;
		}
		return result;
	}
	
	public List printAll() {
		// List 반환
		return list;
	}
	
	public Music searchMusic(String title) {
		// 곡 명으로 객체 검색, 객체가 있으면 객체 정보 리턴, 없으면 null 리턴
		Music m = null;
		for( Music music : list) {
			if(music.getTitle().equals(title)) {
				m = music;
				break;
			}
		}
		return m;
	}
	
	public Music removeMusic(String title) {
		// 곡 명으로 객체 검색, 객체가 있으면 객체 정보 삭제, 없으면 null 리턴
		Music m = null;
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getTitle().equals(title)) {
				//삭제해야함 Music객체
				m = list.remove(i);
				break;
			}
		}
		return m;
	}
	
	public Music setMusic(String title, Music music) {
		// 곡 명으로 객체 검색, 객체가 있으면 객체 정보 수정, 없으면 null 리턴
		Music m = null;
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getTitle().equals(title)) {
				m = list.set(i, music);
			}
		}		
		return m;
	}
	
	public int ascTitle() {
		// 리스트 곡 명 오름차순 정렬, 제목이 같으면 가수 명으로 오름차순 정렬, 1 리턴
		Collections.sort(list);
		return 1;
	}
	
	public int descSinger() {
		// 리스트 가수 명 내림차순 정렬, 1 리턴
		Collections.sort(list, new AscTitle());
		return 1;
	}
		
}
