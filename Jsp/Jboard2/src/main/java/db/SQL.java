package db;

public class SQL {
	public static final String INSERT_USER = "insert into `User` values(?,SHA2(?,256),?,?,?,?,null,?,?,?,?,NOW(),null)";
	public static final String SELECT_USER = "select * from `User` where `uid` = ? and `pass` = SHA2(?,256)";
	public static final String SELECT_USER_BY_NAME_AND_EMAIL = "select * from `User` where `name` = ? and `email` = ?";
	public static final String SELECT_USER_BY_UID_AND_EMAIL = "select * from `User` where `uid` = ? and `email` = ?";
	public static final String SELECT_USER_UID = "select * from `User` where `uid` = ?";
	public static final String SELECT_COUNT_UID = "select count(*) from `User` where `uid` = ?";
	public static final String SELECT_COUNT_NICK= "select count(*) from `User` where `nick` = ?";
	public static final String SELECT_COUNT_EMAIL = "select count(*) from `User` where `email` = ?";
	public static final String SELECT_COUNT_NAME_EMAIL = "select count(*) from `User` where `name`=? and `email` = ?";
	public static final String SELECT_COUNT_UID_EMAIL = "select count(*) from `User` where `uid` = ? and `email` = ?";
	public static final String SELECT_COUNT_HP = "select count(*) from `User` where `hp` = ?";
	public static final String INSERT_WRITER = "insert into Article(title,content,file,writer,regip,rdate) value(?,?,?,?,?,now()) ";
	public static final String SELECT_ARTICLES = "SELECT a.*,b.`nick` FROM `Article` AS a "
												+"JOIN `User` AS b ON a.writer = b.uid where `parent` = 0 ORDER BY `no` desc LIMIT ?,10";
	public static final String SELECT_ARPICLE_COUNT = "SELECT COUNT(*) FROM `Article` where `parent` = 0;";
	public static final String SELECT_ARPICLE = "SELECT * FROM `Article`";
	public static final String SELECT_ARPICLE_VIEW = "SELECT * FROM `Article` where `no`= ? ";
	public static final String SELECT_ARPICLE_NO = "SELECT a.*,b.oriName FROM `Article` AS a JOIN `File` AS b ON a.`no` = b.ano WHERE `no` = ?";
	public static final String SELECT_ARPICLE_MAX_NO = "SELECT MAX(`no`) FROM `Article`";
	public static final String SELECT_COMMENTS = "SELECT a.*,b.`nick` FROM `Article` AS a "
												+"JOIN `User` AS b ON a.writer = b.uid where `parent` = ?";
	public static final String INSERT_COMMENT = "insert into Article(parent,content,writer,regip,rdate) value(?,?,?,?,now())";
	public static final String UPDATE_ARTICLE_FOR_COMMENT= "update `Article` set `comment` = `comment` + 1 where `no` = ?";
	public static final String UPDATE_USER_PASS= "update `User` set `pass` = SHA2(?,256) where `uid` = ?";
	public static final String UPDATE_ARTICLE= "update `Article` set `title` = ?,`content`= ? where `no` = ?";
	public static final String DELETE_COMMENT= "DELETE FROM `Article` WHERE `no` = ?";
	public static final String SELECT_TERMS= "SELECT * FROM `Terms`";
	public static final String UPDATE_USER_FOR_WITHDRAW= "UPDATE `User` SET "
															+ "`pass`=null,"
															+ "`name`=null,"
															+ "`nick`=null,"
															+ "`email`=null,"
															+ "`hp`=null,"
															+ "`role`=null,"
															+ "`zip`=null,"
															+ "`addr1`=null,"
															+ "`addr2`=null,"
															+ "`leaveDate`=NOW() "
															+ "WHERE `uid`= ?";
	public static final String INSERT_FILE = "INSERT INTO `File` SET "
												+ "`ano`=?,"
												+ "`oriName`=?,"
												+ "`newName`=?,"
												+ "`rdate`=NOW()";
	public static final String SELECT_FILE_NAME_NO = "SELECT * FROM `File` where `ano` = ?";
}
