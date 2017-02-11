package com.post_trend.favorite;

public interface FavoriteService {
	public int createFavorite(Favorite favorite);
	public int updateFavorite(Favorite favorite);
	public int deleteFavoriteByNo(int favorite_no);	
	public Favorite findByFavorite_no(int favorite_no);	
}
