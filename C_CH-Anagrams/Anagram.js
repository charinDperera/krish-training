function sorter(array){
  for(i = 0;i < array.length; i++){
    for(j = 0;j < array.length - i; j++){
      if (array[j] > array[j+1]){
        temp = array[j];
        array[j] = array[j+1];
        array[j+1] = temp;
      }    
    }
  }
  return array;
}

function main(){
  const input1 = prompt("Enter the first word: ");
  const input2 = prompt("Enter the second word: ");
  
  if (input1.length == input2.length){
  
    var array1 = [];
    var array2 = [];
    
    for(i =0;i<=input1.length;i++){
      array1[i] = input1.charAt(i);
    }
    for(i =0;i<=input2.length;i++){
      array2[i] = input2.charAt(i);
    }
  
    array1 = sorter(array1);
    array2 = sorter(array2);
  
    isAnagram = true;
    if (array1.length == array2.length){
      for (i = 0; i < array1.length;i++){
        if (array1[i] != array2[i])
          isAnagram = false;
      }
    }
    else
      isAnagram = false;
  }
  else
    isAnagram = false;
  
  if(isAnagram)
    console.log("The words entered were Anagrams")
  else
    console.log("The words entered were not Anagrams")
}

const prompt = require("prompt-sync")();

main();