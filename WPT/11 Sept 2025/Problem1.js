function getFactorialImpl(choice = "Forloop") 
{
  const Fact1 = n => 
    {
    let res = 1;
    for (let i = 2; i <= n; i++) res *= i;
    return res;
    };

  const Fact2 = n => 
    {
    const recur = x => (x <= 1 ? 1 : x * recur(x - 1));
    const f = recur(n);
    console.log(f);
    return f;
    };

  return choice === "Recur" ? Fact2 : Fact1;
}

let rv = getFactorialImpl("Recur");
rv(3);  

rv = getFactorialImpl();
console.log(rv(5));  
