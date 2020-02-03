const express = require('express')
const app = express()
const port = 3001
 var clintDir =  __dirname + '\\clint\\'

app.get('/', (req, res) => {
  res.sendFile(clintDir + 'startnode.html')

})
app.listen(port, () => console.log(`Example app listening on port port!`))