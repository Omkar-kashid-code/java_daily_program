class Codex{
public static void main(String[] args){
char q='A';
char w='a';
for(int i=0;i<4;i++){
for(int j=i;j<4;j++){
if(i%2==0){
System.out.print(" "+q++);
}else{
System.out.print(" "+w++);
}

}
q='A';
w='a';
System.out.println();
}
}
}