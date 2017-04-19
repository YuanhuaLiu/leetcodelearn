package backbag01;
/*
 * 01背包的动态规划解法
 */

public class Backbag01_1 {
    //背包的容量
    private int weight;
    //一组物品的重量
    private int[] arrW;
    //相应物品的质量
    private int[] arrV;
    //表示当容量为j是的最大价值
    public int[][] c;
    //初始化这些值
    public Backbag01_1(int length,int weight,int[] arrW1,int[] arrV1){
        this.weight =weight;
        arrV = new int[length+1];
        arrW= new int[length+1];
        c = new int[length+1][weight+1];
        //为了确保后面计算时从1开始，我们在初始化矩阵时需要注意
        for(int i=1;i<length+1;i++){
            arrV[i]=arrV1[i-1];
            arrW[i] = arrW1[i-1];
        }
    }
    public void solve(){
        //对物品进行循环
        for(int i=1;i<arrW.length;i++){
            //重量每一次增加1
            for(int j=1;j<=weight;j++){
                if(arrW[i]<=j){
                    c[i][j]= Math.max(c[i-1][j],c[i-1][j-arrW[i]]+arrV[i]);
                }else{
                    c[i][j] = c[i-1][j];  
                }
            }
        }
    }
//打印结果
    public void printResult(){
        for(int i=0;i<arrV.length;i++){
            for(int j=0;j<=weight;j++){
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
//测试用例
    public static void main(String[] args) {
        int[] v = {60,100,120};
        int[] w = {10,20,30};
        int weight=50;
        Backbag01_1 p = new Backbag01_1(3,weight,w,v);
        p.solve();
        p.printResult();
    }
}