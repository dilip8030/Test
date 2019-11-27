package string;

public class ColorProblem {
	public static void main(String[] args) {
		String colors="YellowRedGreenBlueRedRedYellowRed";
		System.out.println(colors);
		int yellow=getCount(colors, "Yellow");
		int red=getCount(colors, "Red");
		int green=getCount(colors, "Green");
		int blue=getCount(colors, "Blue");
		int megenta=getCount(colors, "Megenta");
		
		System.out.println("red:"+red);
		System.out.println("green:"+green);
		System.out.println("blue:"+blue);
		System.out.println("megenta:"+megenta);
		System.out.println("yellow:"+yellow);
		
	}
	
	public static int getCount(String searchIn,String searchString){
		char[] ch=searchIn.toCharArray();
		char[] s=searchString.toCharArray();
		int totalCount=0;
		for(int i=0;i<ch.length;i++){
			if(s[0]==ch[i]){
				int lc=1;
				for(int j=1;j<s.length;j++){
					if(s[j]==ch[i+j]){
						++lc;
					}
				}
				if(lc==s.length){
					++totalCount;
				}
			}
		}
		return totalCount;
	}
}
