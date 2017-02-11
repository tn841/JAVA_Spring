package com.post_trend.mapper;

import com.post_trend.favorite.Favorite;

public interface FavoriteMapper {
	public int createFavorite(Favorite favorite);
	public int updateFavorite(Favorite favorite);
	public int deleteFavoriteByNo(int favorite_no);	
	public Favorite findByFavorite_no(int favorite_no);	
}
