const express = require("express");
const app = express();
const cookieParser = require("cookie-parser");
app.use(cookieParser());

app.get("/login", (req, res) => {
  res
    .writeHead(200, {
      "Set-Cookie": "token=encryptedstring; HttpOnly",
      "Access-Control-Allow-Credentials": "true"
    })
    .send();
});

app.get("/private", (req, res) => {
  if (!req.cookies.token) return res.status(401).send();
  res.status(200).json({ secret: "Ginger ale is a specific Root Beer" });
});

app.listen(3001, () => {
  console.log("listening on port 3001...");
});