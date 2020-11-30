package LsbPackage;
class Board{
	public String[][] board;
	public Board()
	{
		board = new String[19][19];
		for(int i=0;i<board.length;i++)
		{
			for(int j=0;j<board.length;j++)
			{
				board[i][j] = ".";
			}
		}
	}
	
	public void print()
	{
		for(int i=0;i<board.length;i++)
		{
			System.out.print(i<10?i+" ":i);  //»ïÇ×¿¬»êÀÚ¸¦ »ç¿ëÇØ¼­ xÁÂÇ¥ Ãâ·Â i<10ÀÌ¸é ÇÑÄ­ ¶ç¿öÁÜ
			for(int j=0;j<board.length;j++)
			{
				System.out.print(board[i][j]+ " ");
			}
			System.out.println();
		}
		System.out.print("  ");
		for(int i=0;i<board.length;i++)
		{
			System.out.print((char)('a'+i)+" ");  //yÁÂÇ¥ Ãâ·Â
		}
		System.out.println();
	}
	
	public void put(int x, char y, Player player)
	{
		board[x][y-97] = player.getPlayerStone();
	}
	
}
