function capitalizeFirstLetter() {
  // Get the input value from the text field
  let inputString = document.getElementById('inputText').value;

  // Split the string into an array of words
  let words = inputString.split(' ');

  // Capitalize the first letter of each word
  let capitalizedWords = words.map(word => word.charAt(0).toUpperCase() + word.slice(1));

  // Join the words back into a string
  let resultString = capitalizedWords.join(' ');

  // Display the result in the output div
  document.getElementById('outputResult').innerText = resultString;
}