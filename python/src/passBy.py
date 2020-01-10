

a = 1
b = {1: "Fred"}
c = {1: "Fred"}


def changeStuff(x, y, z):
    x = x * 10
    y.update({2: "sam"})
    z = {3: "Ella"}


print(a)
print(b)
print(c)

changeStuff(a, b, c)

print(a)
print(b)
print(c)
