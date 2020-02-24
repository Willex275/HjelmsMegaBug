const express = require('express')
const app = express()
const port = 3001
 var clintDir =  __dirname + '\\clint\\'

app.get('/', (req, res) => {
  res.sendFile(__dirname + '\\startnode.html') 
})

app.get('/ass', (req, res) => {
  res.sendFile(__dirname + '\\Style.css')
 })

 app.get('/hole', (req, res) => {
  res.sendFile(__dirname + '\\RR.jpg')
 })


 app.use(express.json())
app.use(express.urlencoded())

 app.post('/form', (req, res) => {
  const name = req.body.name
  console.log(Name)
  res.redirect('/RR.jpg')
})
 



app.listen(port, () => console.log(`Example app listening on port port!`))