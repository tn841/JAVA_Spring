package com.post_trend.realtime;

import java.util.ArrayList;

import com.post_trend.mapper.RealtimeMapper;

public class RealTimeDaoImpl implements RealTimeDao{
	public RealTimeDaoImpl() {
		System.out.println("Dao 생성자");
	}
	
	private RealtimeMapper realtimeMapper;
	
	
	public RealtimeMapper getRealtimeMapper() {
		return realtimeMapper;
	}

	public void setRealtimeMapper(RealtimeMapper realtimeMapper) {
		this.realtimeMapper = realtimeMapper;
		System.out.println("** setRealtimeMapper() : "+realtimeMapper);
	}

	@Override
	public int create(Realtime realtime) {
		return realtimeMapper.create(realtime);
	}

	@Override
	public Realtime read(int realtime_no) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int update(Realtime realtime, int realtime_no) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int realtime_no) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ArrayList<Realtime> findByStandard(String standard) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Realtime> select_naver_realtime() {
		return realtimeMapper.select_naver_realtime();
	}

	@Override
	public ArrayList<Realtime> select_daum_realtime() {
		return realtimeMapper.select_daum_realtime();
	}
	
}
