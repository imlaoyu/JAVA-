public class MainClass {
    public static void main(String args[]) {
        TV haierTV = new TV();


        System.out.println("haierTV 的频道是" + haierTV.getChannel());

        Family zhangSanFamily = new Family();

        zhangSanFamily.buyTV(haierTV);

        System.out.println("zhangSanFamily 开始看电视节目");
        zhangSanFamily.seeTV();

        int m = 2;
        System.out.println("zhangSanFamily 将电视更换到" + m + "频道");
        zhangSanFamily.remoteControl(m);

        System.out.println("haierTV 的频道是" + haierTV.getChannel());
        System.out.println("zhangSanFamily 再看电视节目");
        zhangSanFamily.seeTV();


    }

}


