//TIP 要<b>运行</b>代码，请按 <shortcut actionId="Run"/> 或
// 点击装订区域中的 <icon src="AllIcons.Actions.Execute"/> 图标。
public class GreekAlphabet {
	public static void main(String[] args) {
		
		int z=(byte)128;
		System.out.println("变量Z的值是："+ z);
		int startPosition=0,endPosition=0;      		char cStart='α',cEnd='ω';
		startPosition=cStart;
		endPosition=cEnd;
		System.out.println("希腊字母在unicode表中的顺序位置："+startPosition);
		System.out.println("希腊字母表：");
		for(int i=startPosition;i<=endPosition;i++){
			char c='\0';
			c=(char)i;
			System.out.print(""+c +" ");
			if((i-startPosition+1)%10==0)
				System.out.println("");
		}
		
			}
}