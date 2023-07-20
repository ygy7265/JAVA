package test7;
class Artists{
	public String name;
	public String country;
	public int birth;
	
	public Artists(String name,String country,int birth) {
		this.name = name;
		this.country = country;
		this.birth = birth;
	}
	
	public String show() {
		return String.format("%s,%s,%d",name ,country,birth);
	}
	
}
public class Test02 {

	public static void main(String[] args) {
		
		Artists art1 = null;
		// TODO Auto-generated method stub
		Artists[] famousArts = {
		new Artists("레오나르도 다빈치","이탈리아", 1452),
		new Artists("미켈란젤로","이탈리아", 1475),
		new Artists("빈센트 반고흐","네덜란드", 1853),
		new Artists("클로드모네","프랑스", 1840),
		new Artists("파블로피카소","스페인", 1881)
		};
		
		for(Artists art : famousArts) {
				System.out.println(art.show());
		}
	}

}
