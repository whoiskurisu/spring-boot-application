let stars = document.querySelectorAll("#rating span");

function starFunction(n) {
  remove();
  for (let i = 0; i < n; i++) {
    if (n == 1 || n == 2 || n == 3 || n == 4 || n == 5)
      newClassName = "goldStar";
    stars[i].className = newClassName;
  }
}

function remove() {
  let i = 0;
  while (i < 5) {
    stars[i].className = "blackStar";
    i++;
  }
}
