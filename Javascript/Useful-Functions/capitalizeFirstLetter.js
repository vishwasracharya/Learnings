function capitalizeFirstLetter(string) {
    return string.replace(/(^\w{1})|(\s+\w{1})/g, letter => letter.toUpperCase());
}

/* EXAMPLE */
capitalizeFirstLetter("hi there! i am lowercase string"); 
/* RESULT: Hi There! I Am Lowercase String */