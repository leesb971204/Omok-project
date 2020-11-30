package LsbPackage;
import java.util.*;
public class Main {
	Scanner sc = new Scanner(System.in);
	Player[] player = new Player[2];
	Board board = new Board();
	CheckWin checkwin = new CheckWin();
	public Main()
	{
		System.out.println("���� ������ �����մϴ�.");
		System.out.print("ù��° �÷��̾�(�浹)�� �̸��� �Է��ϼ���. >>> ");
		String name1 = sc.next();
		player[0] = new Player(name1,"��");
		System.out.print("�ι�° �÷��̾�(�鵹)�� �̸��� �Է��ϼ���. >>> ");
		String name2 = sc.next();
		player[1] = new Player(name2,"��");
	}
	void startTurn()
	{
		for(int i=0;i<player.length;i++)
		{
			play(board, player[0], player[1]);
			System.out.println(player[i].getPlayerName()+ "���� �� �����Դϴ�.");
			System.out.println("x��ǥ �Է�:");
			int x = sc.nextInt();
			System.out.println("y��ǥ �Է�:");
			char y = sc.next().charAt(0);
			
			if(x > 18 || y > 's'){
				System.out.println("������ ������ϴ�. �ٽ� �Է����ּ���.");
				i--;
			}
			else if(board.board[x][y-97] !=  "."){
				System.out.println("�̹� ���� �����ϴ� ��ǥ�Դϴ�. �ٽ� �Է����ּ���.");
				i--;
			}
			else{
				System.out.println();
				System.out.println(player[i].getPlayerName()+"���� " +x+","+y+"�� ���� �����ϴ�.");
				board.put(x, y, player[i]);
				checkwin.board = board.board; //���км��� ���� �������� checkwin�޼ҵ忡�� �־���
				if(checkwin.win1_1(x, y, player[i]) || checkwin.win1_2(x, y, player[i]) || 
						checkwin.win1_3(x, y, player[i]) || checkwin.win1_4(x, y, player[i]) || 
						checkwin.win1_5(x, y, player[i]) || checkwin.win2_1(x, y, player[i]) ||
						checkwin.win2_2(x, y, player[i]) || checkwin.win2_3(x, y, player[i]) ||
						checkwin.win2_4(x, y, player[i]) || checkwin.win2_5(x, y, player[i]) ||
						checkwin.win3_1(x, y, player[i]) || checkwin.win3_2(x, y, player[i]) ||
						checkwin.win3_3(x, y, player[i]) || checkwin.win3_4(x, y, player[i]) ||
						checkwin.win3_5(x, y, player[i]) || checkwin.win4_1(x, y, player[i]) ||
						checkwin.win4_2(x, y, player[i]) || checkwin.win4_3(x, y, player[i]) ||
						checkwin.win4_4(x, y, player[i]) || checkwin.win4_5(x, y, player[i])) //���км�
				{
					board.print();
					System.out.println(player[i].getPlayerName()+ "���� �¸��Ͽ����ϴ�.");
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