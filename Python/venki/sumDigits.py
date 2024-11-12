num=123455
def Sum(n):
    if n>0 :
        rem=n%10
        n=n//10
        return rem+Sum(n)
    else :
        return 0
print(Sum(num))