public class maxmin{
public static void main(String[] args){

int a=10,b=20,c=30;
int max,min;
if(a>b)
{
max=a;
min=b;
}
else{
max=b;
min=a;
}
if(c>max)
{
max=c;
}
if(c<min)
{
min=c;
}
System.out.printf("max=%d\n",max);
System.out.printf("min=%d\n",min);
}
}