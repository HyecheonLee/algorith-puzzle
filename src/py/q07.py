from datetime import datetime, timedelta, date


def q07_00():
    dt = date(1964, 10, 10)
    parse = 19641009
    while int(parse) < 20200724:
        dt += timedelta(days=1)
        parse = dt.strftime("%Y%m%d")
        origin = bin(int(parse)).replace("0b", "")
        if origin == origin[::-1]:
            print(dt)


def q07_02():
    from_left = int(bin(19641010).replace("0b", "")[4:4 + 8], 2)
    to_left = int(bin(20200724).replace("0b", "")[4:4 + 8], 2)

    for i in range(from_left, to_left + 1):
        l = "{0:08b}".format(i)
        r = l[::-1]
        for m in range(0, 1 + 1):
            value = "1001{}{}{}1001".format(l, m, r)
            try:
                date = datetime.strptime(str(int(value, 2)), "%Y%m%d")
                print(date.strftime("%Y-%m-%d"))
            except:
                pass


if __name__ == '__main__':
    q07_00()
    q07_02()