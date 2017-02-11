package com.post_trend.mapper;

import java.util.ArrayList;

import com.post_trend.realtime.Realtime;

public interface RealtimeMapper {
	public int create(Realtime realtime);
	public ArrayList<Realtime> select_naver_realtime();
	public ArrayList<Realtime> select_daum_realtime();
}
