def q06_00(init):
    cache = []
    value = init * 3 + 1
    while True:
        if value % 2 == 0:
            value = value / 2
        else:
            value = value * 3 + 1

        if value == init:
            return 1

        if cache.__contains__(value):
            return 0
        cache.append(value)


def q06_01():
    def is_loop(n):
        check = n * 3 + 1

        while check != 1:
            check = check // 2 if check % 2 == 0 else check * 3 + 1
            if check == n:
                return True

        return False

    cnt = 0
    for i in range(2, 1000 + 1, 2):
        if is_loop(i):
            if is_loop(i):
                cnt += 1
    print(cnt)


if __name__ == '__main__':
    cnt = 0
    for i in range(2, 1000 + 1, 2):
        cnt += q06_00(i)
    print(cnt)

    q06_01()
