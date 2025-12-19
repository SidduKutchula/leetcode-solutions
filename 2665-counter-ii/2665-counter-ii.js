/**
 * @param {integer} init
 * @return { increment: Function, decrement: Function, reset: Function }
 */
var createCounter = function(init) {
    let currentCount = init;
    function increment(){
        currentCount++;
        return currentCount;
   }
   function decrement(){
    currentCount--;
    return currentCount;
   }
   function reset(){
    currentCount = init;
    return currentCount;
   }
   return {increment, decrement, reset};

}

 const counter = createCounter(5)
 counter.increment(); // 6
 counter.reset(); // 5
 counter.decrement(); // 4