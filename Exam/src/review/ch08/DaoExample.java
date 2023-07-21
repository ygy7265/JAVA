package review.ch08;

interface DataAccessObject{
	public String select();
	public String insert();
	public String update();
	public String delete();
	
}
class OracleDao implements DataAccessObject{

	@Override
	public String select() {
		// TODO Auto-generated method stub
		return "Oracle DB select";
	}

	@Override
	public String insert() {
		// TODO Auto-generated method stub
		return "Oracle DB insert";
	}

	@Override
	public String update() {
		// TODO Auto-generated method stub
		return "Oracle DB update";
	}

	@Override
	public String delete() {
		// TODO Auto-generated method stub
		return "Oracle DB delete";
	}
	
}
class MysqlDao implements DataAccessObject{
	
	@Override
	public String select() {
		// TODO Auto-generated method stub
		return "Mysql DB select";
	}
	
	@Override
	public String insert() {
		// TODO Auto-generated method stub
		return "Mysql DB insert";
	}
	
	@Override
	public String update() {
		// TODO Auto-generated method stub
		return "Mysql DB update";
	}
	
	@Override
	public String delete() {
		// TODO Auto-generated method stub
		return "Mysql DB delete";
	}
	
}
public class DaoExample {
	public static void dbWork(DataAccessObject dao) {
			System.out.println(dao.select());
	        System.out.println(dao.insert());
	        System.out.println(dao.update());
	        System.out.println(dao.delete());
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dbWork(new OracleDao());
		dbWork(new MysqlDao());
	}

}
