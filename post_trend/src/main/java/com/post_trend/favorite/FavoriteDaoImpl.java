package com.post_trend.favorite;

import com.post_trend.mapper.FavoriteMapper;

public class FavoriteDaoImpl implements FavoriteDao{

	FavoriteMapper favoriteMapper;
	
	public void setFavoriteMapper(FavoriteMapper favoriteMapper) {
		this.favoriteMapper = favoriteMapper;
	}

	@Override
	public int createFavorite(Favorite favorite) {
		// TODO Auto-generated method stub
		return favoriteMapper.createFavorite(favorite);
	}

	@Override
	public int updateFavorite(Favorite favorite) {
		// TODO Auto-generated method stub
		return favoriteMapper.updateFavorite(favorite);
	}

	@Override
	public int deleteFavoriteByNo(int favorite_no) {
		// TODO Auto-generated method stub
		return favoriteMapper.deleteFavoriteByNo(favorite_no);
	}

	@Override
	public Favorite findByFavorite_no(int favorite_no) {
		// TODO Auto-generated method stub
		return favoriteMapper.findByFavorite_no(favorite_no);
	}

}
