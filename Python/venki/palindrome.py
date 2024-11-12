num=12213
res=0
original=num

def isPalindrome(num,res,original):
    while num>0 :
        rem=num%10
        res=res*10+rem
        num=num//10
    return res==original

print(isPalindrome(num,res,original))