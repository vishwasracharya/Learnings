let arr = ["Andhra Pradesh", "Arunachal Pradesh", "Assam", "Bihar", "Chhattisgarh", "Goa", "Gujarat", "Haryana", 
"Himachal Pradesh", "Jharkhand", "Karnataka", "Kerala", "Madhya Pradesh", "Maharashtra", "Manipur", "Meghalaya",
"Mizoram", "Nagaland", "Odisha", "Punjab", "Rajasthan", "Sikkim", "Tamil Nadu", "Telangana", "Tripura", 
"Uttar Pradesh", "Uttarakhand", "West Bengal"];

// console.log(states.indexOf("Nagaland")); //returns index
// console.log(states.includes("Nagaland"));  //returns boolean

// This is the code I wrote 

// function linearSearch(arr, value){
//     for (let i = 0; i<= arr.length; i++){
//             if(arr.includes(value)) return console.log(arr.indexOf(value));
//             else return console.log(-1);

//     }
// }

// linearSearch(arr, "Uttarakhand");

// This is a tutorial code 
function linearSearch(arr, val){
    for (let i=0; i<arr.length; i++){
        if(arr[i] === val) return console.log(i);
        
    }
    return console.log(-1);
}

// linearSearch([5, 12, 55, 20, 1, 88], 200);
// linearSearch(arr, "Uttarakhand");



// Time Complexiety BigO(n) -> As array gets longer, so more amount of searches. 
// if arr.length = 5000, then 5000 times the search is done (if value is at the last index) 