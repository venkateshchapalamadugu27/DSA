import math
num=153
original=num
l=len(str(num))
res=0
while num>0 :
    rem=num%10
    res+=math.pow(rem,l)
    num=num//10
print(original==res)
