/**
 * @param {number[]} nums
 * @return {boolean}
 */
var containsDuplicate = function(nums) {
    const map = new Set();

    // map.set(k, v)
    // map.get(k) => v | undefined 

    // set.add(v)
    // set.has(v) => true || false

    for(const num of nums){
        if(map.has(num))
            return true;
        else
            map.add(num);
    }
    return false;
};