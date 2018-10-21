/*
---------------------
作者：yunterry
来源：CSDN
原文：https://blog.csdn.net/ta_ab/article/details/78209243
版权声明：本文为博主原创文章，转载请附上博文链接！
 */
var express = require('express')
var app = express()

var json = {
  code: 200,
  msg: '请求成功',
  data: {
    userId: '123456',
    name: 'Terry',
    blog: 'https://yunm.coding.me'
  }
}

app.get("/", function (req, res) {
  res.send(json)
})

app.listen(8088, function () {
  console.log("启动服务 http://localhost:8088")
})

