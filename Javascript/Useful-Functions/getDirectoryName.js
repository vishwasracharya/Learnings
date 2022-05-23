const Path = require("path");
const FS = require("fs");

const viewsFolderPath = './views/';

let Files = [];

function getDirectoryName(viewsFolderPath) {
  FS.readdirSync(viewsFolderPath).forEach((File) => {
    const Absolute = Path.join(viewsFolderPath, File);
    if (FS.statSync(Absolute).isDirectory()) {
      getDirectoryName(Absolute);
    } else {
      return Files.push(
        Absolute.split("\\")
          .join("/")
          .split(".ejs")
          .join("")
          .split("views/")
          .join("")
      );
    }
  });
}
getDirectoryName(viewsFolderPath);
