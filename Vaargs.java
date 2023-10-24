class Vaargs{
    public int add(int ... i){
        int sum=0;
        for(int x:i){
            sum+=x;
        }
        return sum;
    }
    public static void main(String args[]){
        Vaargs obj=new Vaargs();
        System.out.println(obj.add(1,2,3,4,5,6,7,8,9,10));
    }
}