package db;

public class SQL {
	public static final String INSERT_USER = "insert into `User` values(?,SHA2(?,256),?,?,?,?,null,?,?,?,?,NOW(),null)";
	public static final String SELECT_USER = "select * from `User` where `uid` = ? and `pass` = SHA2(?,256)";
	public static final String SELECT_COUNT_UID = "select count(*) from `User` where `uid` = ?";
	public static final String SELECT_COUNT_NICK= "select count(*) from `User` where `nick` = ?";
	public static final String SELECT_COUNT_EMAIL = "select count(*) from `User` where `email` = ?";
	public static final String SELECT_COUNT_HP = "select count(*) from `User` where `hp` = ?";
	public static final String INSERT_WRITER = "insert into Article(title,content,writer,regip,rdate) value(?,?,?,?,now()) ";
	public static final String SELECT_ARTICLES = "SELECT a.*,b.`nick` FROM `Article` AS a "
												+"JOIN `User` AS b ON a.writer = b.uid where `parent` = 0 ORDER BY `no` desc LIMIT ?,10";
	public static final String SELECT_ARPICLE_COUNT = "SELECT COUNT(*) FROM `Article` where `parent` = 0;";
	public static final String SELECT_ARPICLE_NO = "SELECT * FROM `Article` where `no` = ?";
	public static final String SELECT_COMMENTS = "SELECT a.*,b.`nick` FROM `Article` AS a "
												+"JOIN `User` AS b ON a.writer = b.uid where `parent` = ?";
	public static final String INSERT_COMMENT = "insert into Article(parent,content,writer,regip,rdate) value(?,?,?,?,now())";
	public static final String UPDATE_ARTICLE_FOR_COMMENT= "update `Article` set `comment` = `comment` + 1 where `no` = ?";
	public static final String DELETE_COMMENT= "DELETE FROM `Article` WHERE `no` = ?;";
	public static final String SELECT_TERMS= "SELECT * FROM `Terms`";
	
}
