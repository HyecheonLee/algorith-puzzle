def q03():
    for i in range(1, 100 + 1):
        flag = False
        for j in range(1, 100 + 1):
            if i % j == 0:
                flag = not flag

        if flag:
            print(i)


if __name__ == '__main__':
    q03()
