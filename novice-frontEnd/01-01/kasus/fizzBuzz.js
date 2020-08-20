for (fb = 1; fb <= 100; fb += 1) {
    if (fb % 3 === 0 && fb % 5 === 0) {
        console.log("fizz buzz");
    } else if (fb % 5 === 0) {
        console.log("buzz");
    } else if (fb % 3 === 0) {
        console.log("fizz");
    } else {
        console.log(fb);
    }
}