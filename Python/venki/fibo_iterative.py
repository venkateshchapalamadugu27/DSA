def fibo(n):
    a=0
    b=1
    l=[]
    l.append(a)
    l.append(b)
    if n==1 :
        return l[0]
    if n==2 :
        return l
    for i in range(0,n-2):
        c=a+b
        l.append(c)
        a=b
        b=c
    return l
print(fibo(50))
