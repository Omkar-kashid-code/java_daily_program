class Demo{
public static void main(String[] args){
   int a=10;
   int b=20;
   int c=30;
  if ((a > b && a < c) || (a > c && a < b)) {
           System.out.println("secondLargest=" + a);
        } else if ((b > a && b < c) || (b > c && b < a)) {
        
           System.out.println("secondLargest=" + b);
        } else {
            
           System.out.println("secondLargest=" + c);
        }
}
}