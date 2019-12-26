const cache = [];

function fib(n) {
    if (cache[n] == null) {
        if ((n === 0) || n === 1) {
            cache[n] = 1;
        } else {
            cache[n] = fib(n - 1) + fib(n - 2);
        }
    }
    return cache[n];
}

let count = 0;
let n = 1;
while (count < 10) {
    let result = fib(n);
    let sum = 0;
    for (let item of result.toString().split("")) {
        sum += parseInt(item);
    }
    if (result % sum === 0) {
        console.log(result);
        count++;
    }
    n++;
}
