DROP TABLE keyword CASCADE CONSTRAINTS;
DROP TABLE news CASCADE CONSTRAINTS;
DROP TABLE music CASCADE CONSTRAINTS;
DROP TABLE movie CASCADE CONSTRAINTS;
DROP TABLE realtime CASCADE CONSTRAINTS;
DROP TABLE member CASCADE CONSTRAINTS;
DROP TABLE favorite CASCADE CONSTRAINTS;

/**********************************/
/* Table Name: favorite */
/**********************************/
CREATE TABLE favorite(
		FAVORITE_NO                   		NUMBER(15)		 NOT NULL,
		FAVORITE_NEWS                 		NUMBER(10)		 NULL ,
		FAVORITE_REALTIME             		NUMBER(10)		 NULL ,
		FAVOTIRE_MOVIE                		NUMBER(10)		 NULL ,
		FAVORITE_MUSIC                		NUMBER(10)		 NULL 
);

COMMENT ON TABLE favorite is 'favorite';
COMMENT ON COLUMN favorite.FAVORITE_NO is 'favorite_no';
COMMENT ON COLUMN favorite.FAVORITE_NEWS is 'favorite_news';
COMMENT ON COLUMN favorite.FAVORITE_REALTIME is 'favorite_realtime';
COMMENT ON COLUMN favorite.FAVOTIRE_MOVIE is 'favotire_movie';
COMMENT ON COLUMN favorite.FAVORITE_MUSIC is 'favorite_music';


/**********************************/
/* Table Name: member */
/**********************************/
CREATE TABLE member(
		MEMBER_NO                     		NUMBER(10)		 NOT NULL,
		MEMBER_ID                     		VARCHAR2(50)		 NULL ,
		MEMBER_PW                     		VARCHAR2(50)		 NULL ,
		MEMBER_NAME                   		VARCHAR2(50)		 NULL ,
		MEMBER_AGE                    		NUMBER(10)		 NULL ,
		MEMBER_GENDER                 		VARCHAR2(10)		 NULL ,
		MEMBER_EMAIL                  		VARCHAR2(50)		 NULL ,
		MEMBER_JOB                    		VARCHAR2(20)		 NULL ,
		MEMBER_MARRIED                		NUMBER(10)		 NULL ,
		FAVORITE_NO                   		NUMBER(15)		 NULL 
);

COMMENT ON TABLE member is 'member';
COMMENT ON COLUMN member.MEMBER_NO is 'member_no';
COMMENT ON COLUMN member.MEMBER_ID is 'member_id';
COMMENT ON COLUMN member.MEMBER_PW is 'member_pw';
COMMENT ON COLUMN member.MEMBER_NAME is 'member_name';
COMMENT ON COLUMN member.MEMBER_AGE is 'member_age';
COMMENT ON COLUMN member.MEMBER_GENDER is 'member_gender';
COMMENT ON COLUMN member.MEMBER_EMAIL is 'member_email';
COMMENT ON COLUMN member.MEMBER_JOB is 'member_job';
COMMENT ON COLUMN member.MEMBER_MARRIED is 'member_married';
COMMENT ON COLUMN member.FAVORITE_NO is 'favorite_no';


/**********************************/
/* Table Name: realtime */
/**********************************/
CREATE TABLE realtime(
		REALTIME_NO                   		NUMBER(10)		 NOT NULL,
		REALTIME_KEYWORD              		VARCHAR2(100)		 NULL ,
		REALTIME_URL                  		VARCHAR2(200)		 NULL ,
		REALTIME_RANK                 		NUMBER(10)		 NULL ,
		REALTIME_STANDARD             		VARCHAR2(50)		 NULL ,
		REALTIME_PORTAL               		VARCHAR2(15)		 NULL ,
		realtime_isIncrease           		VARCHAR2(15)		 NULL ,
		realtime_degree               		NUMBER(10)		 NULL ,
		REALTIME_TIMESTAMP            		TIMESTAMP(0)		 NULL 
);

COMMENT ON TABLE realtime is 'realtime';
COMMENT ON COLUMN realtime.REALTIME_NO is 'realtime_no';
COMMENT ON COLUMN realtime.REALTIME_KEYWORD is 'realtime_keyword';
COMMENT ON COLUMN realtime.REALTIME_URL is 'realtime_url';
COMMENT ON COLUMN realtime.REALTIME_RANK is 'realtime_rank';
COMMENT ON COLUMN realtime.REALTIME_STANDARD is 'realtime_standard';
COMMENT ON COLUMN realtime.REALTIME_PORTAL is 'realtime_portal';
COMMENT ON COLUMN realtime.realtime_isIncrease is '»ó½ÂorÇÏ¶ô';
COMMENT ON COLUMN realtime.realtime_degree is '»ó½ÂorÇÏ¶ô Á¤µµ';
COMMENT ON COLUMN realtime.REALTIME_TIMESTAMP is 'realtime_timestamp';


/**********************************/
/* Table Name: movie */
/**********************************/
CREATE TABLE movie(
		MOVIE_NO                      		NUMBER(10)		 NULL ,
		MOVIE_TITLE                   		VARCHAR2(50)		 NULL ,
		MOVIE_COUNT                   		NUMBER(15)		 NULL ,
		MOVIE_RATE                    		VARCHAR2(10)		 NULL ,
		MOVIE_STANDARD                		VARCHAR2(50)		 NULL ,
		MOVIE_TIMESTAMP               		TIMESTAMP(0)		 NULL 
);

COMMENT ON TABLE movie is 'movie';
COMMENT ON COLUMN movie.MOVIE_NO is 'movie_no';
COMMENT ON COLUMN movie.MOVIE_TITLE is 'movie_title';
COMMENT ON COLUMN movie.MOVIE_COUNT is 'movie_count';
COMMENT ON COLUMN movie.MOVIE_RATE is 'movie_rate';
COMMENT ON COLUMN movie.MOVIE_STANDARD is 'movie_standard';
COMMENT ON COLUMN movie.MOVIE_TIMESTAMP is 'movie_timestamp';


/**********************************/
/* Table Name: music */
/**********************************/
CREATE TABLE music(
		MUSIC_NO                      		NUMBER(10)		 NULL ,
		MUSIC_TITLE                   		VARCHAR2(50)		 NULL ,
		MUSIC_SINGER                  		VARCHAR2(50)		 NULL ,
		MUSIC_RANK                    		NUMBER(10)		 NULL ,
		MUSIC_STANDARD                		VARCHAR2(50)		 NULL ,
		MUSIC_TIMESTAMP               		TIMESTAMP(0)		 NULL 
);

COMMENT ON TABLE music is 'music';
COMMENT ON COLUMN music.MUSIC_NO is 'music_no';
COMMENT ON COLUMN music.MUSIC_TITLE is 'music_title';
COMMENT ON COLUMN music.MUSIC_SINGER is 'music_singer';
COMMENT ON COLUMN music.MUSIC_RANK is 'music_rank';
COMMENT ON COLUMN music.MUSIC_STANDARD is 'music_standard';
COMMENT ON COLUMN music.MUSIC_TIMESTAMP is 'music_timestamp';


/**********************************/
/* Table Name: news */
/**********************************/
CREATE TABLE news(
		news_no                       		NUMBER(10)		 NOT NULL,
		news_date                     		VARCHAR2(20)		 NULL ,
		news_company                  		VARCHAR2(20)		 NULL 
);

DROP SEQUENCE news_news_no_SEQ;

CREATE SEQUENCE news_news_no_SEQ NOMAXVALUE NOCACHE NOORDER NOCYCLE;

CREATE TRIGGER news_news_no_TRG
BEFORE INSERT ON news
FOR EACH ROW
BEGIN
IF :NEW.news_no IS NOT NULL THEN
  SELECT news_news_no_SEQ.NEXTVAL INTO :NEW.news_no FROM DUAL;
END IF;
END;

COMMENT ON TABLE news is 'news';
COMMENT ON COLUMN news.news_no is 'news_no';
COMMENT ON COLUMN news.news_date is 'news_date';
COMMENT ON COLUMN news.news_company is 'news_company';


/**********************************/
/* Table Name: keyword */
/**********************************/
CREATE TABLE keyword(
		keyword_no                    		NUMBER(10)		 NOT NULL,
		keywordfrag                   		VARCHAR2(20)		 NULL ,
		news_no                       		NUMBER(10)		 NULL 
);

DROP SEQUENCE keyword_keyword_no_SEQ;

CREATE SEQUENCE keyword_keyword_no_SEQ NOMAXVALUE NOCACHE NOORDER NOCYCLE;

CREATE TRIGGER keyword_keyword_no_TRG
BEFORE INSERT ON keyword
FOR EACH ROW
BEGIN
IF :NEW.keyword_no IS NOT NULL THEN
  SELECT keyword_keyword_no_SEQ.NEXTVAL INTO :NEW.keyword_no FROM DUAL;
END IF;
END;

COMMENT ON TABLE keyword is 'keyword';
COMMENT ON COLUMN keyword.keyword_no is 'keyword_no';
COMMENT ON COLUMN keyword.keywordfrag is 'keywordfrag';
COMMENT ON COLUMN keyword.news_no is 'news_no';



ALTER TABLE favorite ADD CONSTRAINT IDX_favorite_PK PRIMARY KEY (FAVORITE_NO);

ALTER TABLE member ADD CONSTRAINT IDX_member_PK PRIMARY KEY (MEMBER_NO);
ALTER TABLE member ADD CONSTRAINT IDX_member_FK0 FOREIGN KEY (FAVORITE_NO) REFERENCES favorite (FAVORITE_NO);

ALTER TABLE realtime ADD CONSTRAINT IDX_realtime_PK PRIMARY KEY (REALTIME_NO);

ALTER TABLE news ADD CONSTRAINT IDX_news_PK PRIMARY KEY (news_no);

ALTER TABLE keyword ADD CONSTRAINT IDX_keyword_PK PRIMARY KEY (keyword_no);
ALTER TABLE keyword ADD CONSTRAINT IDX_keyword_FK0 FOREIGN KEY (news_no) REFERENCES news (news_no);

