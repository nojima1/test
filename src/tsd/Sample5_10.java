package tsd;

public class Sample5_10 {

	public static void main(String[] args) {
		//↓newによるインスタンス化はできない
		//Run time rt = new Runtime();
		Runtime rt = Runtime.getRuntime();
		System.out.println("JVM free memory before running gc:0"+ rt.freeMemory());
		rt.gc();
		System.out.println("JVM free memory after running gc:"+ rt.freeMemory());

	}

}
