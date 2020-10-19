console.log("Im Working. Im JS. Im beautiful. Im worth it");

// let & const
let a = 221;
let b = a-5;
a = 4;
console.log(b, a);
// 웬만하면 const, 꼭 필요할 때만 let.

//String
const what = "Nicolas";

//Boolean
const wat = true;

//Number
const num = 666;

//Float
const float = 66.6;

//Array
const Something = "Some";
const daysOfWeek = ["Mon","Tue","Wed","Thu","Fri","Sat","Sun",true,Something]
console.log(daysOfWeek[daysOfWeek.length-1]);

/*Object(python의 dictionary인줄 알았으나,
        그냥 class같은 느낌, 말그대로 객체)*/
const nicoInfo = {
    name: "Nico",
    age: 33,
    gender: "Male",
    isHandsome: true,
    favMovies: ["Along the gods","LOTR","Oldboy"],
    favFood: [
        {name: "Kimchi", fatty: false}, 
        {name: "Cheese burger", fatty: false}
    ]
};
console.log(nicoInfo)
console.log(nicoInfo.gender)

nicoInfo.gender = "Female";
console.log(nicoInfo.favFood[0].name)

//JS Function
console.log(console)
function sayHello(name, age) {
    console.log('Hello!',name," You have",age,"years of age.");
}
sayHello("Nico",15);

//JS Function2
function saySomething(name, age) {
    return `Hello! ${name}, you are ${age} years old.`;
};
const greetNicolas = saySomething("Lynn",20);
console.log(greetNicolas);

const calculator = {
    plus: function(a,b) {
        return a+b;
    },
    div: function(a,b) {
        return a/b;
    },
    minus: function(a,b) {
        return a-b;
    },
    mul: function(a,b) {
        return a*b;
    },
    nthPower: function(a,b) {
        return a**b;
    }
}
const plus = calculator.plus(5,5);
const div = calculator.div(5,5);
const nthPower = calculator.nthPower(3,3)
console.log(plus,div,nthPower)

//DOM: Document Object Module
// const title = document.querySelector("#title");
// title.innerHTML = "Hi! From JS";
// title.style.color = "red"
// console.dir(document);
// document.title = "I own you now";

//Events and Event handlers
// function handleClick() {
//     title.style.color = "blue";
// }
// title.addEventListener("click", handleClick);
//함수에 ()붙이면 바로 실행, ()가 없으면 resize될 때 실행

//if, else, or, and
const title = document.querySelector("#title");

const CLICKED_CLASS = "clicked";

function handleClick() {
    title.classList.toggle(CLICKED_CLASS)
}

function init() {
    title.addEventListener("click", handleClick);
}
init();

