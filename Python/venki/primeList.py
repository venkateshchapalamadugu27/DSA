def isPrime(num):
    for i in range(2,num):
        if num%i==0:
            return False
    return True
def prime(n):
    l=[]
    if n<2 :
        return l
    for i in range(2,n+1):
        if isPrime(i):
            l.append(i)
    return l
print(prime(100))