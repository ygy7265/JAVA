package DB;

public class SQL {
public static final String INSERT_USER = "INSERT INTO `User` VALUES(?,?,?,?,?,?,null,?,?,?,?,NOW(),null)";
public static final String Login_User = "Select * from `User` where `uid`=? and `pass` = ?";
public static final String INSERT_ARTICLE = "INSERT INTO `article`(`cate`,`title`,`content`,`writer`,`regip`,`rdate`) VALUES(?,?,?,?,?,NOW())";
}
