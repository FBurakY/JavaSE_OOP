package _02.stringbufferAndstringBuilder;

public class StringBufferTest2 {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("test_java");
		sb.insert( 2, "CONTENT");
		
		System.out.println(sb);
		
		System.out.println(sb.delete(3, 6)); // [ )
		
		System.out.println(sb.reverse());
		
		
		String str = sb.toString();
		//
	}
}
