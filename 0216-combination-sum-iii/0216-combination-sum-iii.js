/**
 * @param {number} k
 * @param {number} n
 * @return {number[][]}
 */
var combinationSum3 = function(k, n) {
    const res = [];

    function backtrack(start, path, target, k) {
        if (target === 0 && k === 0) {
            res.push([...path]);
            return;
        }

        for (let i = start; i <= 9; i++) {
            if (i > target || k <= 0) break;
            path.push(i);
            backtrack(i + 1, path, target - i, k - 1);
            path.pop();
        }
    }

    backtrack(1, [], n, k);
    return res;
};