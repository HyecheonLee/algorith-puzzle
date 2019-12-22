let op = ["+", "-", "*", "/", ""];
for (let i = 1000; i < 10000; i++) {
    let c = String(i);
    for (let j = 0; j < op.length; j++) {
        for (let k = 0; k < op.length; k++) {
            for (let l = 0; l < op.length; l++) {
                let val = c.charAt(3) + op[j] + c.charAt(2) + op[k] + c.charAt(1) + op[l] + c.charAt(0);
                if (val.length > 4) {
                    if (i === eval(val)) {
                        console.log(val + " = " + i)
                    }
                }
            }
        }
    }
}