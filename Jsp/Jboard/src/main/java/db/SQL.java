package db;

public class SQL {
	public static final String INSERT_USER = "insert into `user` values(?,SHA2(?,256),?,?,?,?,null,?,?,?,?,NOW(),null)";
	public static final String SELECT_USER = "select * from `User` where `uid` = ? and `pass` = SHA2(?,256)";
	public static final String SELECT_COUNT_UID = "select count(*) from `User` where `uid` = ?";
	public static final String SELECT_COUNT_NICK= "select count(*) from `User` where `nick` = ?";
	public static final String SELECT_COUNT_EMAIL = "select count(*) from `User` where `email` = ?";
	public static final String SELECT_COUNT_HP = "select count(*) from `User` where `hp` = ?";
	public static final String INSERT_WRITER = "insert into article(title,content,writer,regip,rdate) value(?,?,?,?,now()) ";
	public static final String SELECT_ARTICLES = "select * from `article`";
	
}
