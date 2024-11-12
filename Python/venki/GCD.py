a=20
b=10
def lcm(a,b):
   return int(a*b/gcd(a,b))
def gcd(a,b):
   if a==0 :
      return b
   return gcd(b%a,a)

print("GCD : "+ str(gcd(a,b)))
print("LCM : "+ str(lcm(a,b)))



