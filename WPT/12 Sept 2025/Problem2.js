//with above concept use Math.max() method to display maximum number

function ShowMax(...a)
{
    let max = a[0]

    for(i=0; i<a.length; i++)
    {
        max = Math.max(max, a[i])
    }

    console.log("Maximum No. is: " + max);
}

ShowMax(1,2,3,4,5)
ShowMax(55,63,99,68)