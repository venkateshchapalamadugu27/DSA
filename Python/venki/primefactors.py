def isPrime(n):
    if n<2 :
        return False
    for i in range(2,n):
        if n%i==0 :
            return False
    return True
num=27
l=[]
for i in range(1,num+1):
    if isPrime(i) and num%i==0 :
          l.append(i)
print(l)