function clockWise(arr, d) {
    const n = arr.length;
    const rotatedArr = new Array(n);
    for (let i = 0; i < n; i++) {
        rotatedArr[(i + d) % n] = arr[i];
    }
    return rotatedArr;
}

function main() {
    const result = clockWise([1, 2, 3, 4, 5], 2);
    for (const i of result) {
        process.stdout.write(i + " ");
    }
}

main();