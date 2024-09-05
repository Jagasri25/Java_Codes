import java.util.*;
class Flames{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to Flames");
		System.out.print("Enter your name: ");
		String str1 = scanner.nextLine().toLowerCase();
		System.out.print("Enter your partner name: ");
		String str2 = scanner.nextLine().toLowerCase();
		flamesCal(str1, str2);
	}
	public static void flamesCal(String str1, String str2){
		boolean b1[] = new boolean[str1.length()];
		boolean b2[] = new boolean[str2.length()];
		int count =0;
		char[] ch1 = str1.toCharArray();
		char[] ch2 = str2.toCharArray();
		for(int i=0; i<str1.length(); i++){
			for(int j=0; j<str2.length(); j++){
				if(ch1[i]==ch2[j] && !b1[i] && !b2[j]){
					b1[i] = true;
					b2[j] = true;
					break;
				}
			}
		}
		for(int z=0; z<b1.length; z++){
			if(!b1[z])
			   count++;
		}
		for(int z2=0; z2<b2.length; z2++){
			if(!b2[z2])
			 count++;
		}
		char res[] = new char[count];
		int c =0;
		for(int m =0; m<str1.length(); m++){
			if(!b1[m])
				res[c++] = ch1[m];
		}
		for(int n =0; n<str2.length(); n++){
			if(!b2[n])
				res[c++] = ch2[n];
		}
		countalpha(count,res);
	}	
	public static void	 countalpha(int count, char[] res) {
        char[] ch = {'F', 'L', 'A', 'M', 'E', 'S'};
        int index = 0;

        while (ch.length > 1) {
          index = (index + count - 1) % ch.length;
          ch = removeCharAt(ch, index);
        }
        char c = ch[0];
        switch(c){
           case 'F':{
               System.out.println(c+" -> Friends forever");
               break;
           }
           case 'L':{
               System.out.println(c+" -> GirlFriend And BoyFriend");
               break;
           }
           case 'A':{
               System.out.println(c+" -> Affection");
               break;
           }
           case 'M':{
               System.out.println(c+" -> Husband And Wife");
               break;
           }
           case 'E':{
               System.out.println(c+" -> Sorry, You both are Enemies");
               break;
           }
           case 'S':{
               System.out.println(c+" -> Siblings");
               break;
           }

        }
    }
    private static char[] removeCharAt(char[] arr, int index) {
        char[] newArr = new char[arr.length - 1];
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (i != index) {
             newArr[j++] = arr[i];
            }
        }
        return newArr;
    }

}