public class FunnyFence {

	public static void main(String[] args) {
		String fence0 = "|-|-|";		
		System.out.println(getLength(fence0));
		String fence1 = "-|-|-|-";
		System.out.println(getLength(fence1));
		String fence2 = "||||||";
		System.out.println(getLength(fence2));
		String fence3 = "|-||-|-";
		System.out.println(getLength(fence3));
		String fence4 = "|-|---|-|---|-|";
		System.out.println(getLength(fence4));
		String fence5 = "|||-||--|--|---|-||-|-|-|--||---||-||-||-|--||";
		System.out.println(getLength(fence5));
	}	

	public static int getLength(String str)
	{
		int length = 1;
		int ltmp = 1;
		for (int i = 0; i < str.length() - 1; i ++) {
			if (str.charAt(i) != str.charAt(i+1))	{
				ltmp ++;
			}
			else
			{
				ltmp = 1;
			}
			length = ltmp > length ? ltmp : length;
		}
		return length;
	}
}