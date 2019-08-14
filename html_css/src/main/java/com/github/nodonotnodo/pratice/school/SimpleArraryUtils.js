function ArrayUtils() {

    //1.找出数组中的最大值
    this.maxElement = function (array) {
        var max = array[0];
        for(var i=1; i<array.length; i++){
            if(max < array[i]){
                max = array[i];
            }
        }
        return max;
    }

    //2.找出某个元素在数组出现的位置，若未找到返回0
    this.indexOfArray = function(array,key){
        for(var i=0; i<array.length; i++){
            if(key == array[i]){
                return i;
            }
        }
        return -1;
    }
    
}
