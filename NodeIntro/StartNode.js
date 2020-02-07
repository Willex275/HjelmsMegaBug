const express = require('express')
const app = express()
const port = 3001
 var clintDir =  __dirname + '\\clint\\'

app.get('/', (req, res) => {
  res.sendFile(__dirname + '\\startnode.html') 
})

app.get('/Style.css', (req, res) => {
  res.sendFile(__dirname + '\\Style.css')
 })

app.listen(port, () => console.log(`Example app listening on port port!`))