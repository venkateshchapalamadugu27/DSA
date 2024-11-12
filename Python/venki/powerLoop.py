num=10
def power(num,inc):
    res=1
    while inc>0:
        res=res*num
        inc=inc-1
    return res
print(power(num,3))