package cmo.cn;

public class TestGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Game[] games=new Game[3];
		games[0]=new Basketball();
		games[1]=new Football();
		games[2]=new Popplong();
		for(int i=0;i<games.length;i++)
		{
			if(games[i]!=null)
				games[i].play();
		}

	}

}
