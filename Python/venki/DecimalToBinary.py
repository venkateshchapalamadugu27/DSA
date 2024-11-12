num=9
res=""
while num>0 :
    rem=num%2
    res=res+str(rem)
    num=num//2
print(res[::-1])