// declare function calculate(...a) and display addition of data 
function calculate(...a)
{
    let sum = 0;
    for(let i=0; i<a.length; i++)
    {
        sum += a[i];
    }

    console.log("Addition of " + (a.length) + " numbers = " + sum)
}

calculate(44, 68)
calculate(78, 66, 98)
calculate(44, 68, 11, 77, 85)
calculate(51, 68, 11, 77, 85, 96, 101)
calculate(4, 6)


//display only odd numbers from given data 

function oddNumbers(...b)
{
    console.log("Odd Numbers: ")

    for(i=0; i<b.length; i++)
    {
        if(b[i]%2 != 0)
        {
            console.log(b[i])
        }
    }
}

oddNumbers(1,2,3,4,5,6,7,8,9)
oddNumbers(15,16,17,18,19,20,21,22,23,24,25)
oddNumbers(51,52,53,54,55,56,57,58,59,60)
