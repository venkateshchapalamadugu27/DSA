num=1001001100
def isBinary(num):
    while num>0 :
        rem=num%10
        if rem!=1 and rem!=0 :
            return False
        num=num//10
    return True
print(isBinary(num))