/**
 * @param {number} n
 * @return {number}
 */
var smallestNumber = function(n) {
    return (1 << (1 + Math.log2(n))) - 1;
};