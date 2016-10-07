import java.util.BitSet;

public class AlwaysEqual {  // Prints 2^5
	private static Integer TWO_TO_FIFTH = 2*2*2*2*2;
	
	public static void main(String[] args) {
		Integer[] array = {
				4, 1, 6, 5, 1, 0, 4, 6,
				4, 1, 0, 3, 1, 4, 1, 4,
				2, 4, 2, 7, 1, 1, 9, 4};
		
		BitSet bitSet = new BitSet();
		for (Integer i = 0; i < array.length; i++) {
			Integer x = array[i] * TWO_TO_FIFTH;
			Integer y = array[i] * TWO_TO_FIFTH;
			boolean equal = (x == y);
			bitSet.set(i, equal);
		}
		
		String text = new String(bitSet.toByteArray());
		System.out.println(text);
	}
}