const array = new Array(900).fill(0).map((e, i) => i + 100);

const isPalindrome = num => {
  return (
    String(num) ===
    String(num)
      .split("")
      .reverse()
      .join("")
  );
};

const maxProduct = range => {
  let palindrome = 0;
  for (let i = 0; i < range.length; i++) {
    for (let j = i + 1; j < range.length; j++) {
      const product = array[i] * array[j];
      if (isPalindrome(product) && product > palindrome) {
        palindrome = product;
      }
    }
  }

  return palindrome;
};

console.log(maxProduct(array));
