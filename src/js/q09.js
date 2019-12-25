let boy = 21;
let girl = 11;

let ary = new Array(girl);
for (let i = 0; i < girl; i++) {
    ary[i] = new Array(boy);
    for (let j = 0; j < boy; j++) {
        ary[i][j] = 0;
    }
}
ary[0][0] = 1;
for (let i = 0; i < girl; i++) {
    for (let j = 0; j < boy; j++) {
        if ((i !== j) && ((girl - i) !== (boy - j))) {
            if (j > 0) {
                ary[i][j] += ary[i][j - 1];
            }
            if (i > 0) {
                ary[i][j] += ary[i - 1][j];
            }
        }
    }
}
console.log(ary[girl - 2][boy - 1] + ary[girl - 1][boy - 2]);