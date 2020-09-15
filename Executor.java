public class Executor{
	public static void main(String args[]){
	   try{

	      Runtime runtime = Runtime.getRuntime();
	      runtime.exec("./teste.sh");


	   }
	   catch(Exception ex){
	      System.out.println("Deu ruim...");
	      ex.printStackTrace();
	   }
	}
}