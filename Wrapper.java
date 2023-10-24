class Wrapper{
    public static void main(String args[]){
        int i=5;
        Integer j=new Integer(i);//Boxing-Wrapping
        int k=j.intValue();//Unboxing-Unwrapping
        Integer value=i;//Autoboxing
        int l=value;//Autounboxing
        String str="123";
        int num=Integer.parseInt(str);
        System.out.println(num);
    }
}