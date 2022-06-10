function isInViewport(el) {
  const rect = el.getBoundingClientRect();
  return (
      rect.top >= 0 &&
      rect.left >= 0 &&
      rect.bottom <= ((window.innerHeight/4) || (document.documentElement.clientHeight/4)) &&
      rect.right <= (window.innerWidth || document.documentElement.clientWidth)

  );
}

document.addEventListener('scroll', function () {
  const listContent = document.querySelector('#table-of-content').querySelectorAll('li');
  const heading = document.querySelectorAll('h2');
  var check;
  heading.forEach((elem)=>{
      check = isInViewport(elem);
      if(check == true){
          listContent.forEach((el, elIndex)=>{
              if(el.children[0].hash == `#${elem.id}`){
                  if(!el.children[0].classList.contains('fw-bold')){
                  el.children[0].className = 'fw-bold';
                  }
              }else{
                  if(el.children[0].classList.contains('fw-bold')){
                      el.children[0].classList.remove('fw-bold');
                  }
              }
          })
      }
  })
});

const table1 = document.getElementById('table-of-content');
const col1 = document.getElementById('clm1');
const col2 = document.getElementById('clm2');
if (window.innerWidth >= 900 && table1) {
  const clone = table1.cloneNode(true);
  table1.classList.toggle('d-none');
  col1.classList.toggle('d-none');
  col1.appendChild(clone);
  } else {
  if (col2.classList.contains('col-lg-6')) {
      col2.classList.replace('col-lg-6', 'col-lg-9')
  }
}
