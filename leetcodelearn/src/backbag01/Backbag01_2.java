package backbag01;

import java.util.Arrays;

/*
 * 01背包回溯法
 */
public class Backbag01_2 {
	//先定义一个类，用来表示物品
    class MyElement implements Comparable{
        //物品重量
        float weight;
        //物品价值
        float value;
        //是否带走物品
        boolean take = false;
        public MyElement(float w,float v){
            this.weight = w;
            this.value = v;
        }
        //比较物品的均值：用来排序
        @Override
        public int compareTo(Object o) {
            MyElement o1 = (MyElement)o;
            float currentR = value/weight;
            float R = o1.value/o1.weight;
            if(currentR<R){
                return 1;
            }else{
                return -1;
            }
        }    
    }

    private MyElement[] myelements;//物品的集合
    private float S;//背包的容量
    private float nowWeight;//记录当前已经装载的物品的总重量
    private float nowPrice;//记录当前已经拿到物品的总价值
    private float betterPrice;//记录当前已经装的物品的最好价格
    public Backbag01_2(float[] w,float[] v,float s){
        int len = w.length;
        this.S = s;
        myelements = new MyElement[len];
        for(int i =0;i<len;i++){
            myelements[i] = new MyElement(w[i],v[i]);
        }
        //默认是从小到大排序，但是我们将其改了。此时排序是从大到小；
        Arrays.sort(myelements);
        System.out.println("物品的价值为："+"  "+"物品重量！");
        for(int i = 0;i<len;i++){
            System.out.print(myelements[i].value+"       "+myelements[i].weight);
            System.out.println();
        }
    }
    /**
     * 用于打印已经装入背包的物品
     * @param myelements
     */
    public void Output(MyElement[] myelements){
        System.out.println("现在装入的物品为(重量)：");
        int len = myelements.length;
        for(int i = 0 ;i<len;i++){  
            if(myelements[i].take){
                System.out.print(myelements[i].weight+"   ");
            }
        }
    } 
    /**
     * 递归搜索这颗树
     * @param t 表示递归树的层数
     */
    public void traceBack(int t){
        if(t>=myelements.length){
            System.out.println("已经找到合适的策略");
            betterPrice = nowPrice;
            Output(myelements);
            return;
        }
        //首先进入左子树
        if(nowWeight+myelements[t].weight<S){
            //进入左子树
            nowWeight += myelements[t].weight;
            nowPrice += myelements[t].value;
            myelements[t].take = true;
            traceBack(t+1);
            nowWeight-=myelements[t].weight;
            System.out.println("恢复现场");
            //恢复现场
            nowPrice -= myelements[t].value;
            myelements[t].take = false;
        }else{
            float rightP=bound(t+1);
            System.out.println("aaaaaaaaaa"+rightP);
            if(rightP>betterPrice){
                traceBack(t+1);
            }
        }
    } 
    /**
     * 查询装载当前节点右子树的节点时的总价值
     * @param i
     * @return
     */
    public float bound(int i){
        //计算当前给右背包留下的容量
        float cleft = S - nowWeight;
        //右子树如果一个节点都装不下时；最好的价值仍然是当前的价值
        float bound = nowPrice;
        int len = myelements.length;
        while(i<len && cleft>myelements[i].weight){
            cleft -=myelements[i].weight;
            bound+= myelements[i].value;
            i++;
            myelements[i].take = true;
        }
        return bound;
    }
    public static void main(String[] args) {
        float[] w = {3.4f,2.5f,6f,4f,9.0f};
        float[] v = {3f,2.5f,5f,9f,6.2f};
        float s = 10;
        Backbag01_2 package1 = new Backbag01_2(w,v,s);
        package1.traceBack(0);
    }
}
