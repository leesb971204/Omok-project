package LsbPackage;

class CheckWin extends Board{ //�޼ҵ� _ ���� ���ڴ� ���� 1(��),2(��),3(��),4(��) �� ��Ÿ���� _���� ���ڴ� 5���� �� �� ������ �ϼ��������� ������ ���� �ڸ����ڸ� ��Ÿ����
	boolean win1_1(int x, char y, Player player) //ù��° ������ ��
	{
		try {
			if(board[x][y-97] == player.getPlayerStone() && board[x][y-96] == player.getPlayerStone() && board[x][y-95] == player.getPlayerStone() && board[x][y-94] == player.getPlayerStone() && board[x][y-93] == player.getPlayerStone())
			{
				return true;
			}
			else
				return false;
		}catch(ArrayIndexOutOfBoundsException e)
		{
			return false;
		}
	}
	boolean win1_2(int x, char y, Player player) //�ι�° ������ ��
	{
		try {
			if(board[x][y-97] == player.getPlayerStone() && board[x][y-96] == player.getPlayerStone() && board[x][y-98] == player.getPlayerStone() && board[x][y-99] == player.getPlayerStone() && board[x][y-100] == player.getPlayerStone())
			{
				return true;
			}
			else
				return false;
		}catch(ArrayIndexOutOfBoundsException e)
		{
			return false;
		}
	}
	boolean win1_3(int x, char y, Player player) //��� ������ ��
	{
		try {
			if(board[x][y-97] == player.getPlayerStone() && board[x][y-98] == player.getPlayerStone() && board[x][y-99] == player.getPlayerStone() && board[x][y-96] == player.getPlayerStone() && board[x][y-95] == player.getPlayerStone())
			{
				return true;
			}
			else
				return false;
		}catch(ArrayIndexOutOfBoundsException e)
		{
			return false;
		}
	}
	boolean win1_4(int x, char y, Player player) //�׹�° ������ ��
	{
		try {
			if(board[x][y-97] == player.getPlayerStone() && board[x][y-98] == player.getPlayerStone() && board[x][y-96] == player.getPlayerStone() && board[x][y-95] == player.getPlayerStone() && board[x][y-94] == player.getPlayerStone())
			{
				return true;
			}
			else
				return false;
		}catch(ArrayIndexOutOfBoundsException e)
		{
			return false;
		}
	}
	boolean win1_5(int x, char y, Player player) //������ ������ ��
	{
		try {
			if(board[x][y-97] == player.getPlayerStone() && board[x][y-98] == player.getPlayerStone() && board[x][y-99] == player.getPlayerStone() && board[x][y-100] == player.getPlayerStone() && board[x][y-101] == player.getPlayerStone())
			{
				return true;
			}
			else
				return false;
		}catch(ArrayIndexOutOfBoundsException e)
		{
			return false;
		}
	}
	/////////////////������� ����////////////////
	boolean win2_1(int x, char y, Player player) //ù��° ������ ��
	{
		try {
			if(board[x][y-97] == player.getPlayerStone() && board[x+1][y-97] == player.getPlayerStone() && board[x+2][y-97] == player.getPlayerStone() && board[x+3][y-97] == player.getPlayerStone() && board[x+4][y-97] == player.getPlayerStone())
			{
				return true;
			}
			else
				return false;
		}catch(ArrayIndexOutOfBoundsException e)
		{
			return false;
		}
	}
	boolean win2_2(int x, char y, Player player) //�ι�° ������ ��
	{
		try {
			if(board[x][y-97] == player.getPlayerStone() && board[x-1][y-97] == player.getPlayerStone() && board[x+1][y-97] == player.getPlayerStone() && board[x+2][y-97] == player.getPlayerStone() && board[x+3][y-97] == player.getPlayerStone())
			{
				return true;
			}
			else
				return false;
		}catch(ArrayIndexOutOfBoundsException e)
		{
			return false;
		}
	}
	boolean win2_3(int x, char y, Player player) //����° ������ ��
	{
		try {
			if(board[x][y-97] == player.getPlayerStone() && board[x-1][y-97] == player.getPlayerStone() && board[x-2][y-97] == player.getPlayerStone() && board[x+1][y-97] == player.getPlayerStone() && board[x+2][y-97] == player.getPlayerStone())
			{
				return true;
			}
			else
				return false;
		}catch(ArrayIndexOutOfBoundsException e)
		{
			return false;
		}
	}
	boolean win2_4(int x, char y, Player player) //�׹�° ������ ��
	{
		try {
			if(board[x][y-97] == player.getPlayerStone() && board[x-1][y-97] == player.getPlayerStone() && board[x-2][y-97] == player.getPlayerStone() && board[x-3][y-97] == player.getPlayerStone() && board[x+1][y-97] == player.getPlayerStone())
			{
				return true;
			}
			else
				return false;
		}catch(ArrayIndexOutOfBoundsException e)
		{
			return false;
		}
	}
	boolean win2_5(int x, char y, Player player) //������ ������ ��
	{
		try {
			if(board[x][y-97] == player.getPlayerStone() && board[x-1][y-97] == player.getPlayerStone() && board[x-2][y-97] == player.getPlayerStone() && board[x-3][y-97] == player.getPlayerStone() && board[x-4][y-97] == player.getPlayerStone() && board[x-5][y-97] == player.getPlayerStone())
			{
				return true;
			}
			else
				return false;
		}catch(ArrayIndexOutOfBoundsException e)
		{
			return false;
		}
	}
	/////////////////������� ����////////////////
	boolean win3_1(int x, char y, Player player) //ù��° ������ ��
	{
		try {
			if(board[x][y-97] == player.getPlayerStone() && board[x-1][y-98] == player.getPlayerStone() && board[x-2][y-99] == player.getPlayerStone() && board[x-3][y-100] == player.getPlayerStone() && board[x-4][y-101] == player.getPlayerStone())
			{
				return true;
			}
			else
				return false;
		}catch(ArrayIndexOutOfBoundsException e)
		{
			return false;
		}
	}
	boolean win3_2(int x, char y, Player player) //�ι�° ������ ��
	{
		try {
			if(board[x][y-97] == player.getPlayerStone() && board[x-1][y-98] == player.getPlayerStone() && board[x+1][y-96] == player.getPlayerStone() && board[x+2][y-95] == player.getPlayerStone() && board[x+3][y-94] == player.getPlayerStone())
			{
				return true;
			}
			else
				return false;
		}catch(ArrayIndexOutOfBoundsException e)
		{
			return false;
		}
	}
	boolean win3_3(int x, char y, Player player) //����° ������ ��
	{
		try {
			if(board[x][y-97] == player.getPlayerStone() && board[x-1][y-98] == player.getPlayerStone() && board[x-2][y-99] == player.getPlayerStone() && board[x+1][y-96] == player.getPlayerStone() && board[x+2][y-95] == player.getPlayerStone())
			{
				return true;
			}
			else
				return false;
		}catch(ArrayIndexOutOfBoundsException e)
		{
			return false;
		}
	}
	boolean win3_4(int x, char y, Player player) //�׹�° ������ ��
	{
		try {
			if(board[x][y-97] == player.getPlayerStone() && board[x-1][y-98] == player.getPlayerStone() && board[x-2][y-99] == player.getPlayerStone() && board[x-3][y-100] == player.getPlayerStone() && board[x+1][y-96] == player.getPlayerStone())
			{
				return true;
			}
			else
				return false;
		}catch(ArrayIndexOutOfBoundsException e)
		{
			return false;
		}
	}
	boolean win3_5(int x, char y, Player player) //������ ������ ��
	{
		try {
			if(board[x][y-97] == player.getPlayerStone() && board[x+1][y-96] == player.getPlayerStone() && board[x+2][y-95] == player.getPlayerStone() && board[x+3][y-94] == player.getPlayerStone() && board[x+4][y-93] == player.getPlayerStone())
			{
				return true;
			}
			else
				return false;
		}catch(ArrayIndexOutOfBoundsException e)
		{
			return false;
		}
	}
	/////////////////������� ��////////////////
	boolean win4_1(int x, char y, Player player) //ù��° ������ ��
	{
		try {
			if(board[x][y-97] == player.getPlayerStone() && board[x-1][y-96] == player.getPlayerStone() && board[x-2][y-95] == player.getPlayerStone() && board[x-3][y-94] == player.getPlayerStone() && board[x-4][y-93] == player.getPlayerStone())
			{
				return true;
			}
			else
				return false;
		}catch(ArrayIndexOutOfBoundsException e)
		{
			return false;
		}
	}
	boolean win4_2(int x, char y, Player player) //�ι�° ������ ��
	{
		try {
			if(board[x][y-97] == player.getPlayerStone() && board[x+1][y-98] == player.getPlayerStone() && board[x-1][y-96] == player.getPlayerStone() && board[x-2][y-95] == player.getPlayerStone() && board[x-3][y-94] == player.getPlayerStone())
			{
				return true;
			}
			else
				return false;
		}catch(ArrayIndexOutOfBoundsException e)
		{
			return false;
		}
	}
	boolean win4_3(int x, char y, Player player) //����° ������ ��
	{
		try {
			if(board[x][y-97] == player.getPlayerStone() && board[x+1][y-98] == player.getPlayerStone() && board[x+2][y-99] == player.getPlayerStone() && board[x-1][y-96] == player.getPlayerStone() && board[x-2][y-95] == player.getPlayerStone())
			{
				return true;
			}
			else
				return false;
		}catch(ArrayIndexOutOfBoundsException e)
		{
			return false;
		}
	}
	boolean win4_4(int x, char y, Player player) //�׹�° ������ ��
	{
		try {
			if(board[x][y-97] == player.getPlayerStone() && board[x-1][y-96] == player.getPlayerStone() && board[x+1][y-98] == player.getPlayerStone() && board[x+2][y-99] == player.getPlayerStone() && board[x+3][y-100] == player.getPlayerStone())
			{
				return true;
			}
			else
				return false;
		}catch(ArrayIndexOutOfBoundsException e)
		{
			return false;
		}
	}
	boolean win4_5(int x, char y, Player player) //������ ������ ��
	{
		try {
			if(board[x][y-97] == player.getPlayerStone() && board[x+1][y-98] == player.getPlayerStone() && board[x+2][y-99] == player.getPlayerStone() && board[x+3][y-100] == player.getPlayerStone() && board[x+4][y-101] == player.getPlayerStone())
			{
				return true;
			}
			else
				return false;
		}catch(ArrayIndexOutOfBoundsException e)
		{
			return false;
		}
	}
	////////////////������� ��/////////////////
}


