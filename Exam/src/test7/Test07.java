package test7;
interface Player{
	public abstract void play();
}
class BaseBallPlayer implements Player{
	public void play() {
		System.out.println("baseball play");
	}
}
class FootBallPlayer implements Player{
	public void play() {
		System.out.println("Football play");
	}
}
public class Test07 {
	public static void main(String[] args) {
		Player p1 = new BaseBallPlayer(); 
		Player p2 = new FootBallPlayer();
		
		playGame(p1);
		playGame(p2);
	}
	
	public static void playGame(Player p) {
		p.play();
	}
}
