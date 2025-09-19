//write a function to add 3 numbers and print the values

function add(x, y, z)
{
    return(x+y+z)
}
console.log("Addition is: " + add(55,66,77))


//lambda function for addition
// let a=5,b=10;
let j=(a,b,c)=>a+b+c;

console.log("Addition by lambda function : "+j(10,20,30));
// console.log("Addition by lambda function : ", (a,b,c) => a + b + c)


