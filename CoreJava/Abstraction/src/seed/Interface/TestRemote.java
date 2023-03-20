package seed.Interface;
//Driver Code
public class TestRemote {
	public static void main(String[] args) {
		
	  System.out.println("----Television----");
      
	  Remote r = new Television();
      r.Battery();
      r.Volume();
      
      System.out.println("----AC----");
      
      Remote r1 = new Ac();
      r1.Battery();
      
      Ac a = new Ac();
      a.Temperature();
      
      System.out.println("----Music Player----");
      
      Remote r2 = new MusicPlayer();
      r2.Battery();
      
      MusicPlayer m = new MusicPlayer();
      m.Volume();
	}

}
