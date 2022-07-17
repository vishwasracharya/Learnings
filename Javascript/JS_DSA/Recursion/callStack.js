function takeShower () {
    return 'Taking Shower!'
}

function eatBreakfast () {
    let meal = cookFood();
    return `Eating ${meal}`;
}

function cookFood() {
    let items = ['bread', 'eggs', 'sausage']
    return items[Math.floor(Math.random()*items.length)];
}

function wakeUp() {
    takeShower();
    eatBreakfast();
    console.log('OK, Ready to go!');
}

wakeUp();