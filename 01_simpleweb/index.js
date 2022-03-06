const express = require("express");

const app = express();

app.get("/", (req, res) => {
  res.send("Bye There");
});

app.listen(8080, () => {
  console.log("Listing on port 8080");
});
