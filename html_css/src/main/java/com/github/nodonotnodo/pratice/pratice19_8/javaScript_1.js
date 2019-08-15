
//姓名和昵称必须有一个不为空
function mustNameSet() {
    var nameValue = document.getElementById("name").value;
    var nichengValue = document.getElementById("nicheng").value;
    if(nameValue=="" && nichengValue==""){
        alert("姓名和昵称不能同时为空");
    }else{
        alert("称谓设定成功");
    }
}

//方法的参数为一个元素，调用方法会使参数元素后面的div块显示数据
function divDisplay(element) {

    //得到元素id和内容最大长度
    var text = element.id;
    var maxLengrh = element.maxLength;

    //得到div元素并设定div文本内容
    var div = document.getElementById(text+"div");
    div.innerText = element.name+"的最大长度为"+maxLengrh;

}

//方法的参数为一个元素，调用方法会使参数元素后面的div块清空
function divEmpty(element) {

    //使用元素id得到div元素
    var text = element.id;
    var div = document.getElementById(text+"div");
    div.innerText = "";

}



function selectProvince(){

    //城市数组--数组元素为数组
    var citys = [
        ["西安","汉中","宝鸡"],
        ["太原","长治","运城"],
        ["平凉","庆阳","金昌"]
    ]

    //得到省份元素
    var province = document.getElementById("province");
    //拿到省份的值，实际上就是城市数组的下标
    var flag = province.value;
    //得到省份的城市数组
    var cityOption = citys[flag];

    var city = document.getElementById("city");

    //清空城市select中的option
    city.options.length = 0;

    //创建城市option
    for(var i=0; i<cityOption.length; i++){
        //城市名称
        var cityText = cityOption[i];

        //创建节点和节点内容
        var option = document.createElement("option");
        var text = document.createTextNode(cityText);

        //将节点和内容关联起来
        option.appendChild(text);

        //将节点添加到城市的选择列表中
        city.appendChild(option);
    }
}
