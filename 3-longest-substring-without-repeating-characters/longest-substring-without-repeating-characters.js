/**
 * @param {string} s
 * @return {number}
 */
var lengthOfLongestSubstring = function(s) {
    let l = 0;
    let max = 0;
    let set = new Set();

    for(let r=0; r<s.length; r++){
        while(set.has(s[r])){
            set.delete(s[l]);
            l++;
        }
        max = Math.max(max, (r-l)+1);
        set.add(s[r]);
    }
    return max;
};