import re


def q02():
    op = ["*", ""]
    for i in range(1000, 10000):
        c = str(i)
        for j in op:
            for k in op:
                for l in op:
                    val = c[3] + j + c[2] + k + c[1] + l + c[0]
                    val = re.sub(r"0(\d+)", r"\1", val)

                    if len(val) > 4:
                        if i == eval(val):
                            print(val, "=", i)


if __name__ == '__main__':
    q02()
