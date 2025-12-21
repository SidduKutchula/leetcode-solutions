/**
 * @param {Object|Array} obj
 * @return {boolean}
 */
var isEmpty = function(obj) {
    if(isEmpty === true){
        return true;
    }
    else if(isEmpty != true){
        return Object.keys(obj).length === 0;
    }
    return obj
};