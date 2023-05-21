ans=4
count=0
while(ans!=11):
    if(count==0):
        ans+=3
        count=1
       
    else:
        ans-=2
        count=0

    print(ans,end=" ")  
