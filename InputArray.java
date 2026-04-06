public class InputArray {
	public static void main(String args[]) {
		int  [] a={100,200,300};
		System.out.println(a.length);
		System.out.println(a);
		int b[][]={{1},{1,1},{1,2,1},{1,3,3,1},{1,4,6,4,1}};
		System.out.println(b.length);
		System.out.println(b[4][2]);
		b[4]=a;
		System.out.println("\n二维数组b的各一维数组信息：");
		for (int i = 0; i < b.length; i++) {
			System.out.println("b[" + i + "] 的长度：" + b[i].length 
					+ " | 引用地址：" + b[i]);
		}
		System.out.println(b[4][2]);
	}
}