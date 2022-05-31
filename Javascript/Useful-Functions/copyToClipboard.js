function copyToClipboard() {
  let copyText = document.getElementById('copyToClipboard');
  copyText.select();
  document.execCommand('copy');
} 
