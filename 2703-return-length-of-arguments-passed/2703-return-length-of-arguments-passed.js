/**
 * @param {...(null|boolean|number|string|Array|Object)} args
 * @return {number}
 */
var argumentsLength = function(...args) {
    //return args.length;

    argumentCount=0;
    for(let i=0; i<args.length; i++)
    {
        argumentCount+=1
    }
    return argumentCount;
};

/**
 * argumentsLength(1, 2, 3); // 3
 */