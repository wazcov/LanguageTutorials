import time

t = time.localtime(time.time())
print(time.asctime(t))


# functions
def printList(mylist):
    if isinstance(mylist, list):
        for i in range(len(mylist)):
            print(mylist[i])
        return
    else:
        print("Not A List")
        exit()
        return


alist = [10, 20, 30]
printList(alist)

# try and ifs
print("How many miles have you driven?")
miles = input()
try:
    miles = int(miles)
except ValueError:
    print("not a number")
    exit()
d = ""
e = []
if miles > 1000:
    d = "Wow, have a rest"
elif miles > 100:
    d = "Fair distance, but make us a cuppa"
else:
    e = ["Oh.", "Well, best get driving then"]

if d != "":
    print(d)

if (e != []):
    printList(e)

# dictionaries
carsDict = {'nissan': 'juke', 'ford': 'fiesta', 'audi': 'tt'}

for k, v in carsDict.items():
    print("I have a " + k + " " + v)
