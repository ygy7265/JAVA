package DB;

public class SQL {

public static final String SELECT_TERMS = "SELECT * FROM `Terms`";
//User	
public static final String INSERT_USER = "INSERT INTO `User` VALUES(?,?,?,?,?,?,null,?,?,?,?,NOW(),null)";
public static final String Login_User = "Select * from `User` where `uid`=? and `pass` = ?";

//Article
public static final String INSERT_ARTICLE = "INSERT INTO `Article`(`cate`,`title`,`content`,`writer`,`regip`,`rdate`) VALUES(?,?,?,?,?,NOW())";
public static final String SELECT_ARTICLE = "SELECT * FROM `Article` where `cate` = ? and `title` is not null ORDER BY `No` desc LIMIT ?,10";
public static final String SELECT_ARTICLE_PAGE = "SELECT COUNT(*) FROM `Article` where `cate` = ? and `title` is not null";
public static final String SELECT_ARTICLE_VIEW_PAGE = "SELECT * FROM `Article` WHERE `no` = ?";
public static final String SELECT_ARTICLE_VIEW_COUNT = "SELECT COUNT(*) FROM `Article` WHERE `parent` = ?";
public static final String SELECT_ARTICLE_COMMENT = "SELECT * FROM `Article` WHERE`parent` = ?";
public static final String INSERT_ARTICLE_COMMENT = "INSERT INTO `Article`(`cate`,`parent`,`content`,`writer`,`regip`,`rdate`) VALUES(?,?,?,?,?,NOW())";
public static final String DELETE_ARTICLE_COMMENT = "DELETE FROM `Article` where `no` = ?";
public static final String DELETE_ARTICLE_VIEW = "DELETE FROM `Article` where `no` = ? or `parent` = ?";

//admin
public final static String INSERT_PRODUCT = "INSERT INTO `Product` SET "
											+ "type = ?,"
											+ "pName = ?,"
											+ "price = ?,"
											+ "delivery = ?,"
											+ "stock = ?,"
											+ "thumb1 = ?,"
											+ "thumb2 = ?,"
											+ "thumb3 = ?,"
											+ "seller = ?,"
											+ "etc = ?,"
											+ "rdate = NOW()";

public final static String SELECT_USER_LIST = "SELECT * FROM `User`";
public final static String SELECT_PRODUCT_LIST = "SELECT * FROM `Product`";
}
