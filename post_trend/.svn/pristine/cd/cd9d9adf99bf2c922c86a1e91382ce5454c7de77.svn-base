package com.post_trend.favorite;

public class FavoriteServiceImpl implements FavoriteService {

	FavoriteDaoImpl favoriteDao;

	public void setFavoriteDao(FavoriteDaoImpl favoriteDao) {
		this.favoriteDao = favoriteDao;
	}

	@Override
	public int createFavorite(Favorite favorite) {
		// TODO Auto-generated method stub
		return favoriteDao.createFavorite(favorite);
	}

	@Override
	public int updateFavorite(Favorite favorite) {
		// TODO Auto-generated method stub
		return favoriteDao.updateFavorite(favorite);
	}

	@Override
	public int deleteFavoriteByNo(int favorite_no) {
		// TODO Auto-generated method stub
		return favoriteDao.deleteFavoriteByNo(favorite_no);
	}

	@Override
	public Favorite findByFavorite_no(int favorite_no) {
		// TODO Auto-generated method stub
		return favoriteDao.findByFavorite_no(favorite_no);
	}

}
