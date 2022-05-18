/* A function to automate the regex replacement We just need to call the function with some values,
This is Just a Test Function Though */
function regexReplace(str, find, replace) {
    return str.replace(new RegExp(find, 'g'), replace);
}
// post.better_featured_image.source_url = regexReplace(post.better_featured_image.source_url, "https://blog.playstory.io", "https://playstory.io/blog");