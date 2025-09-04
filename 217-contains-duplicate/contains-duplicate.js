/**
 * @param {number[]} nums
 * @return {boolean}
 */
var containsDuplicate = function(nums) {
    const map = new Map();

    // map.set(k, v)
    // map.get(k) => v | undefined

    for(const num of nums){
        const val = map.get(num);
        if(val !== undefined)
            return true;
        else
            map.set(num, num);
    }
    return false;
};