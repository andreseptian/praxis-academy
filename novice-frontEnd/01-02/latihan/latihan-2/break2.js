let x = 0;
let z = 0;
labelCancelLoops: while (true) {
    console.log('Outer loops: ' + x);
    x += 1;
    z = 1;
    while (true) {
        console.log('Inner loops: ' + z);
        z += 1;
        if (z === 3 && x === 3) {
            break labelCancelLoops;
        } else if (z === 3) {
            break;
        }
    }
}