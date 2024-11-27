// Front-end validators not working when adding to cart/wishlist without input 

async function fetchData() {
    try {
      const productID = window.location.href.slice(-4);
      if(productID > 1016 || productID < 1001){
        return alert("This id does not exist");
      }
      else{
      const itemValue = await fetch(`http://localhost:8080/api/v1/data`);
  
      if (!itemValue.ok) {
        throw new Error("Could not fetch resource");
      }
  
      const Itemdata = await itemValue.json();
  
      const JSONofProduct = Itemdata.find((x) => x.id == productID);
  
      const title = document.querySelector("#title");
      title.textContent = JSONofProduct.name;
      const heading = document.querySelector("#product-heading");
      const status = document.querySelector("#status");
      const image = document.querySelector("#image");
      const price = document.querySelector("#price-value");
  
      heading.textContent = JSONofProduct.name;
      status.textContent = JSONofProduct.status.toUpperCase();
      status.setAttribute("class", JSONofProduct.status);
      image.style.backgroundImage = JSONofProduct.image;
      price.textContent = "रू." + JSONofProduct.price;
    }} catch (error) {
      console.error(error);
    }
  }
  
  fetchData();
