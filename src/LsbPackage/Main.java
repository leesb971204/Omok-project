package LsbPackage;
import java.util.*;
public class Main {
	Scanner sc = new Scanner(System.in);
	Player[] player = new Player[2];
	Board board = new Board();
	CheckWin checkwin = new CheckWin();
	public Main()
	{
		System.out.println("오목 게임을 시작합니다.");
		System.out.print("첫번째 플레이어(흑돌)의 이름을 입력하세요. >>> ");
		String name1 = sc.next();
		player[0] = new Player(name1,"●");
		System.out.print("두번째 플레이어(백돌)의 이름을 입력하세요. >>> ");
		String name2 = sc.next();
		player[1] = new Player(name2,"○");
	}
	void startTurn()
	{
		for(int i=0;i<player.length;i++)
		{
			play(board, player[0], player[1]);
			System.out.println(player[i].getPlayerName()+ "님이 둘 차례입니다.");
			System.out.println("x좌표 입력:");
			int x = sc.nextInt();
			System.out.println("y좌표 입력:");
			char y = sc.next().charAt(0);
			
			if(x > 18 || y > 's'){
				System.out.println("범위를 벗어났습니다. 다시 입력해주세요.");
				i--;
			}
			else if(board.board[x][y-97] !=  "."){
				System.out.println("이미 돌이 존재하는 좌표입니다. 다시 입력해주세요.");
				i--;
			}
			else{
				System.out.println();
				System.out.println(player[i].getPlayerName()+"님이 " +x+","+y+"에 수를 놓습니다.");
				board.put(x, y, player[i]);
				checkwin.board = board.board; //승패분석을 위해 오목판을 checkwin메소드에도 넣어줌
				if(checkwin.win1_1(x, y, player[i]) || checkwin.win1_2(x, y, player[i]) || 
						checkwin.win1_3(x, y, player[i]) || checkwin.win1_4(x, y, player[i]) || 
						checkwin.win1_5(x, y, player[i]) || checkwin.win2_1(x, y, player[i]) ||
						checkwin.win2_2(x, y, player[i]) || checkwin.win2_3(x, y, player[i]) ||
						checkwin.win2_4(x, y, player[i]) || checkwin.win2_5(x, y, player[i]) ||
						checkwin.win3_1(x, y, player[i]) || checkwin.win3_2(x, y, player[i]) ||
						checkwin.win3_3(x, y, player[i]) || checkwin.win3_4(x, y, player[i]) ||
						checkwin.win3_5(x, y, player[i]) || checkwin.win4_1(x, y, player[i]) ||
						checkwin.win4_2(x, y, player[i]) || checkwin.win4_3(x, y, player[i]) ||
						checkwin.win4_4(x, y, player[i]) || checkwin.win4_5(x, y, player[i])) //승패분석
				{
					board.print();
					System.out.println(player[i].getPlayerName()+ "님이 승리하였습니다.");
					System.exit(0);
				}
			}
		}
	}
	void run()
	{
		while(true)
		{
			startTurn();
		}
	}
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
		
   }
	private static void play(Board board, Player user1, Player user2)
	{
		board.print();
	}
}