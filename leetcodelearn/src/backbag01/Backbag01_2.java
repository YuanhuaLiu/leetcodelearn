package backbag01;

import java.util.Arrays;

/*
 * 01�������ݷ�
 */
public class Backbag01_2 {
	//�ȶ���һ���࣬������ʾ��Ʒ
    class MyElement implements Comparable{
        //��Ʒ����
        float weight;
        //��Ʒ��ֵ
        float value;
        //�Ƿ������Ʒ
        boolean take = false;
        public MyElement(float w,float v){
            this.weight = w;
            this.value = v;
        }
        //�Ƚ���Ʒ�ľ�ֵ����������
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

    private MyElement[] myelements;//��Ʒ�ļ���
    private float S;//����������
    private float nowWeight;//��¼��ǰ�Ѿ�װ�ص���Ʒ��������
    private float nowPrice;//��¼��ǰ�Ѿ��õ���Ʒ���ܼ�ֵ
    private float betterPrice;//��¼��ǰ�Ѿ�װ����Ʒ����ü۸�
    public Backbag01_2(float[] w,float[] v,float s){
        int len = w.length;
        this.S = s;
        myelements = new MyElement[len];
        for(int i =0;i<len;i++){
            myelements[i] = new MyElement(w[i],v[i]);
        }
        //Ĭ���Ǵ�С�������򣬵������ǽ�����ˡ���ʱ�����ǴӴ�С��
        Arrays.sort(myelements);
        System.out.println("��Ʒ�ļ�ֵΪ��"+"  "+"��Ʒ������");
        for(int i = 0;i<len;i++){
            System.out.print(myelements[i].value+"       "+myelements[i].weight);
            System.out.println();
        }
    }
    /**
     * ���ڴ�ӡ�Ѿ�װ�뱳������Ʒ
     * @param myelements
     */
    public void Output(MyElement[] myelements){
        System.out.println("����װ�����ƷΪ(����)��");
        int len = myelements.length;
        for(int i = 0 ;i<len;i++){  
            if(myelements[i].take){
                System.out.print(myelements[i].weight+"   ");
            }
        }
    } 
    /**
     * �ݹ����������
     * @param t ��ʾ�ݹ����Ĳ���
     */
    public void traceBack(int t){
        if(t>=myelements.length){
            System.out.println("�Ѿ��ҵ����ʵĲ���");
            betterPrice = nowPrice;
            Output(myelements);
            return;
        }
        //���Ƚ���������
        if(nowWeight+myelements[t].weight<S){
            //����������
            nowWeight += myelements[t].weight;
            nowPrice += myelements[t].value;
            myelements[t].take = true;
            traceBack(t+1);
            nowWeight-=myelements[t].weight;
            System.out.println("�ָ��ֳ�");
            //�ָ��ֳ�
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
     * ��ѯװ�ص�ǰ�ڵ��������Ľڵ�ʱ���ܼ�ֵ
     * @param i
     * @return
     */
    public float bound(int i){
        //���㵱ǰ���ұ������µ�����
        float cleft = S - nowWeight;
        //���������һ���ڵ㶼װ����ʱ����õļ�ֵ��Ȼ�ǵ�ǰ�ļ�ֵ
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
