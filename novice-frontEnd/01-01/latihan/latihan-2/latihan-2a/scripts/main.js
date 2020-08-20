let myImage = document.querySelector('img');
myImage.onclick = function () {
    let mySrc = myImage.getAttribute('src');
    if (mySrc === 'images/gambar2.png') {
        myImage.setAttribute('src', 'images/gambar.png');
    } else {
        myImage.setAttribute('src', 'images/gambar2.png');
    }
}

let myButton = document.querySelector('button');
let myHeading = document.querySelector('h1')
myHeading.textContent = 'Hello world!';

function setUserName() {
    let myName = prompt('Please enter your name.');
    if (!myName) {
        setUserName();
    } else {
        localStorage.setItem('name', myName);
        myHeading.innerHTML = 'Chrome is cool, ' + myName;
    }
}

myButton.onclick = function () {
    setUserName();
}


// // let iceCream = 'chocolate';
// // if (iceCream === 'chocolate') {
// //     alert('Yay, I love chocolate ice cream!');
// // } else {
// //     alert('Awwww, but chocolate is my favorite...');
// // }

// // document.querySelector('html').onclick = function () {
// //     alert('Ouch! Stop poking me!');
// // }