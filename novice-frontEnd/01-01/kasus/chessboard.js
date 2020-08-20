var size = 8;
var papan = "";
for (var y = 0; y < size; y++) {
    for (var x = 0; x < size; x++) {
        if ((x + y) % 2 == 0)
            papan += " ";
        else
            papan += "#";
    }
    papan += "\n";
}
console.log(papan);