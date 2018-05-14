/**
 *方法说明
 * 1.numAndED(id)//只能输入数字和英文逗号的正则校验
 * 2.isLink(id)//校验是否是链接
 *
 * @param id
 * @param contant
 */

//只能输入数字和英文逗号的正则校验E:\workspace\yhyy-admn\yhyy-front-admin\yhyy-admn\yhyy-front-admin\src\main\resources\static\js\common\checkUtils.js
var isShow = true;
function numAndED(id){
    var flag = true;
    var text=$("#"+id).val();
    if(text!=null&&text!=''){
        if(!text.match(/^[0-9,]+$/)){
            if(isShow){
                $("#"+id).after("<span id='textError'><font color='red'>*只能输入数字和英文逗号!</font></span>");
                isShow=false;
            }
            flag=false;
        }
    }
    //展示1.5秒删除
    setTimeout(function () {
        $("#"+id).next().remove();
        isShow=true;
    }, 1500);
    return flag;
}

//校验是否是链接
function isLink(id){
    var flag= true;
    var text=$("#"+id).val();
    var strRegex = '^((https|http|ftp|rtsp|mms)?://)'
        + '?(([0-9a-z_!~*\'().&=+$%-]+: )?[0-9a-z_!~*\'().&=+$%-]+@)?' //ftp的user@
        + '(([0-9]{1,3}.){3}[0-9]{1,3}' // IP形式的URL- 199.194.52.184
        + '|' // 允许IP和DOMAIN（域名）
        + '([0-9a-z_!~*\'()-]+.)*' // 域名- www.
        + '([0-9a-z][0-9a-z-]{0,61})?[0-9a-z].' // 二级域名
        + '[a-z]{2,6})' // first level domain- .com or .museum
        + '(:[0-9]{1,4})?' // 端口- :80
        + '((/?)|' // a slash isn't required if there is no file name
        + '(/[0-9a-z_!~*\'().;?:@&=+$,%#-]+)+/?)$';
    var re=new RegExp(strRegex);
    if(text!=null&&text!=''){
        if(!re.test(text)){
            alerts("请您输入正确的链接!");
            // $("#"+id).after("<span id='textError'><font color='red'>*输入内容不是正确的链接!</font></span>");
            flag=false;
        }
        if(text.indexOf("http")<0){
            alerts("请您输入正确的链接!");
            flag=false;
        }
    }

    //展示1.5秒删除
    setTimeout(function () {
        $("#"+id).next().remove();
    }, 1500);
    return flag;
}

//比较开始时间和结束时间
function compareStartAndEnd(startId,endId){
    var startTime = $("#"+startId).val();
    var endTime =  $("#"+endId).val();
    var flag=true;
    if(startTime == "" || endTime == ""){
        if(startTime!=""&&endTime==""){
            alerts("请选择结束时间!");
            swal({   title: "",   text: "操作失败!", type:'error' , timer:1000,  showConfirmButton: false});
            flag=false;
            return flag;
        }
        if(startTime==""&&endTime!=""){
            alerts("请选择开始时间!");
            flag=false;
            return flag;
        }
    }
    if(startTime != "" && endTime != ""){
        if(startTime > endTime){
            alerts("开始时间不能大于结束时间");
            flag=false;
            return flag;
        }
    }
    return true;
}

//校验时间不能为空,开始时间和结束时间相隔不能超过30天
function checkDateTime(startId,endId){
    var startTime = $("#"+startId).val();
    var endTime =  $("#"+endId).val();
    var flag=true;
    if(startTime == "" || endTime == ""){
        if(startTime!=""&&endTime==""){
            alerts("请选择结束时间!");
            flag=false;
            return flag;
        }
        if(startTime==""&&endTime!=""){
            alerts("请选择开始时间!");
            flag=false;
            return flag;
        }
        if(startTime==""&&endTime==""){
            alerts("请选择查询时间!");
            flag=false;
            return flag;
        }
    }
    if(startTime != "" && endTime != ""){
        if(startTime > endTime){
            alerts("开始时间不能大于结束时间");
            flag=false;
            return flag;
        }else{
            var time1 = Date.parse(new Date(startTime));
            var time2 = Date.parse(new Date(endTime));
            var time3 = Math.abs(parseInt((time2 - time1)/1000/3600/24));
            if(time3>31){
                alerts("选择时间间隔大于31天,请重新选择!");
                flag=false;
                return flag;
            }
        }
    }
    return flag;
}

function alerts(message){
    swal({   title: "",   text: message, type:'error' , timer:1500,  showConfirmButton: false});
}

function alerto(message){
    swal({   title: "",   text: message, type:'success' , timer:1500,  showConfirmButton: false});
}






















