#include<stdio.h>
#include<stdlib.h> 
#define bucketSize 512
int bktInput(int a,int b) {
if(a>bucketSize) 
printf("\n\t\tBucket overflow");
else {
sleep(2);
 
while(a>b){


printf("\n\t\t bytes outputted."); 
a-=b; 
sleep(2);
}
if (a>0)
printf("\n\t\tLast %d bytes sent\t",a); 
printf("\n\t\tBucket output successful");
}
}
int main() {
int op,i,pktSize; 
rand();
printf("Enter output rate : "); 
scanf("%d",&op); 
for(i=1;i<=5;i++)
{
sleep(2); 
pktSize=rand();
printf("\nPacket no:%d \tPacket size:%d ",i,pktSize); 
bktInput(pktSize,op);
}
}
