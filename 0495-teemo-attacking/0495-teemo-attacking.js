/**
 * @param {number[]} timeSeries
 * @param {number} duration
 * @return {number}
 */
var findPoisonedDuration = function(timeSeries, duration) {
    let res = 0;
    for (let i = 0; i < timeSeries.length - 1; i++) {
        const diff = timeSeries[i + 1] - timeSeries[i];
        res += diff > duration ? duration : diff;
    }
    return timeSeries.length ? res + duration : 0;
};