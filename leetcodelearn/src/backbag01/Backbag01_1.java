package backbag01;
/*
 * 01�����Ķ�̬�滮�ⷨ
 */

public class Backbag01_1 {
    //����������
    private int weight;
    //һ����Ʒ������
    private int[] arrW;
    //��Ӧ��Ʒ������
    private int[] arrV;
    //��ʾ������Ϊj�ǵ�����ֵ
    public int[][] c;
    //��ʼ����Щֵ
    public Backbag01_1(int length,int weight,int[] arrW1,int[] arrV1){
        this.weight =weight;
        arrV = new int[length+1];
        arrW= new int[length+1];
        c = new int[length+1][weight+1];
        //Ϊ��ȷ���������ʱ��1��ʼ�������ڳ�ʼ������ʱ��Ҫע��
        for(int i=1;i<length+1;i++){
            arrV[i]=arrV1[i-1];
            arrW[i] = arrW1[i-1];
        }
    }
    public void solve(){
        //����Ʒ����ѭ��
        for(int i=1;i<arrW.length;i++){
            //����ÿһ������1
            for(int j=1;j<=weight;j++){
                if(arrW[i]<=j){
                    c[i][j]= Math.max(c[i-1][j],c[i-1][j-arrW[i]]+arrV[i]);
                }else{
                    c[i][j] = c[i-1][j];  
                }
            }
        }
    }
//��ӡ���
    public void printResult(){
        for(int i=0;i<arrV.length;i++){
            for(int j=0;j<=weight;j++){
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
//��������
    public static void main(String[] args) {
        int[] v = {60,100,120};
        int[] w = {10,20,30};
        int weight=50;
        Backbag01_1 p = new Backbag01_1(3,weight,w,v);
        p.solve();
        p.printResult();
    }
}