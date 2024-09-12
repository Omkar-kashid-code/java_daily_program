class Demo{
   public static void main(String[] args){
    int a=4;
      for(int i=1;i<=4;i++){
        for(int j=1;j<=i;j++){
          System.out.print(" ");
             }
            for(int j=i;j<=4;j++){
             System.out.print(a);
             }
              a--;
               System.out.println();
         }
     }
}