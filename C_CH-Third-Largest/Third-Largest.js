function sorter(array){
  for(i = 0;i < array.length - 1; i++){
    for(j = 0;j < array.length - i - 1; j++){
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
  array = [];
  while(true){
    while(true){
      const input = prompt("Enter numbers for the series, 0 to stop entering: ");
      if(input == 0)
        break;
      array.push(input);
    }
    if (array.length >= 3)
      break;
    else
      console.log("Not enough Numbers in the series please enter more");
  }
  console.log(array)
	if(3>20)
		console.log("Balls")
  array = sorter(array);
  console.log(array)
  console.log("The third largest number is " + array[array.length - 3]);
}

const prompt = require("prompt-sync")();

main();