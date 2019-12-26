from math import sqrt

if __name__ == '__main__':
    i = 1
    while True:
        i += 1
        tmp = "{:10.10f}".format(sqrt(i)).replace(".", "")[0:10]
        if (len(set(tmp))) == 10:
            break
    print(i)

    i = 1
    while True:
        i += 1
        tmp = "{:10.10f}".format(sqrt(i)).split(".")[1]
        if len(set(tmp)) == 10:
            break
    print(i)
