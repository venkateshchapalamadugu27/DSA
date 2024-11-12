a=10
b=20
def normal(a,b):
    for i in range(1,a+1):
       b=b+1
    print(b)
def add(a,b):
    while b!=0 :
        carry= a&b
        a=a^b
        b=carry << 1
    print(a)




normal(a,b)
add(a,b)


