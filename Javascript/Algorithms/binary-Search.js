// It works only on sorted lists

let states = ["Andhra Pradesh", "Arunachal Pradesh", "Assam", "Bihar", "Chhattisgarh", "Goa", "Gujarat", "Haryana", 
"Himachal Pradesh", "Jharkhand", "Karnataka", "Kerala", "Madhya Pradesh", "Maharashtra", "Manipur", "Meghalaya",
"Mizoram", "Nagaland", "Odisha", "Punjab", "Rajasthan", "Sikkim", "Tamil Nadu", "Telangana", "Tripura", 
"Uttar Pradesh", "Uttarakhand", "West Bengal"];

let nums = [1, 2, 3, 4, 5, 6, 7, 12, 55, 100, 123, 133, 144, 156, 178, 188, 189, 190, 200, 202, 213];

function binarySearch(nums, val){
    let left = 0;
    let right = nums.length - 1;
    let middle = Math.floor((left + right) / 2);
    
    while(nums[middle] !== val && left <= right){
        if (val < nums[middle]) right = middle - 1;
        else left = middle + 1;
        middle = Math.floor((left + right) / 2);
        }
        return nums[middle] == val ? console.log(middle) : console.log(-1); //ternary operator version of below function
        // if (nums[middle] == val) return console.log(middle);
        // else return console.log(-1);
}

binarySearch(nums, 144);

// Time Complexiety:
// worst Case -> O(logn)
// Best Case -> O(1)