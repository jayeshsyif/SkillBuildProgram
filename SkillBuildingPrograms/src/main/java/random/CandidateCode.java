package random;

import java.util.ArrayList;
import java.util.List;
public class CandidateCode 
{ 

	public static int passCount(int input1,int input2,int input3)
	{
		Player prevPlayer=null;
		List<Player> players = new ArrayList<Player>();
		for(int i=1; i<= input1; i++)
		{
			Player p =new Player();
			p.setScore(0);
			p.setNumber(i);
			if(prevPlayer!=null)
			{
				p.setPrevPlayer(prevPlayer);
			}
			prevPlayer = p;
			players.add(p);
		}
		players.get(0).setPrevPlayer(players.get(players.size()-1));

		for(int i=0; i <players.size()-1; i++)
		{
			try
			{
				players.get(i).setNextPlayer(players.get(i+1));
			}catch(Exception e)
			{

			}
		}
		players.get(players.size()-1).setNextPlayer(players.get(0));
		Player player=players.get(0);
		player.setScore(1);
		int count =0;
		do
		{
			if(player ==null)
			{
				player = players.get(0);
			}else
			{
				if(player.getScore() %2 ==0)
				{
					//left
					for(int i=0; i<input3;i++)
					{
						player = player.getNextPlayer();
					}
				}else if(player.getScore() %2 !=0)
				{
					//right 4
					for(int i=0; i<input3;i++)
					{
						player = player.getPrevPlayer();
					}
				}
				player.setScore(player.getScore()+1);
			}

			count++;
		}while(player.getScore() != input2);
		return count;
	}
	static class Player
	{
		int score=0;
		int number = 0;
		Player nextPlayer;
		Player prevPlayer;
		public int getScore() {
			return score;
		}
		public void setScore(int score) {
			this.score = score;
		}
		public int getNumber() {
			return number;
		}
		public void setNumber(int number) {
			this.number = number;
		}
		public Player getNextPlayer() {
			return nextPlayer;
		}
		public void setNextPlayer(Player nextPlayer) {
			this.nextPlayer = nextPlayer;
		}
		public Player getPrevPlayer() {
			return prevPlayer;
		}
		public void setPrevPlayer(Player prevPlayer) {
			this.prevPlayer = prevPlayer;
		}
		@Override
		public String toString() {
			return "Player [score=" + score + ", number=" + number
					+ ", prevPlayer=" + prevPlayer.getNumber() 
					+", NextPlayer "+nextPlayer.getNumber()
					+ "]";
		}

	}
}