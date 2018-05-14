$(function () {
    $.getJSON("/getUserModuleList", {}, function (result) {
        var status = result.data.status;
        var moduleList = result.data.moduleList;
        var username = result.data.username;
        if (status == 1) {
            $("#userName").html(username);
            var topArray = new Array()
            $.each(moduleList, function (index1, item1) {
                if (item1.moduleLevel == 1) {
                    topArray[index1] = item1.id;
                }
            });
            var str = "";
            for (var i1 = 0; i1 < topArray.length; i1++) {
                $.each(moduleList, function (index1, item1) {
                    if (item1.id == topArray[i1]) {
                        if (item1.levelType == 1) {
                            str = str + '<li>' +
                                '<a class="J_menuItem" href="' + item1.moduleUrl + '">' +
                                '    <i class="fa fa-home" style="display:none;"></i>' +
                                '    <span class="nav-label">' + item1.moduleName + '</span>' +
                                ' </a>' +
                                '</li>';
                        } else {
                            str = str + '            <li>' +
                                '                    <a href="#">' +
                                '                        <i class="fa fa-desktop" " style="display:none"></i>' +
                                '                        <span class="nav-label">' + item1.moduleName + '</span>' +
                                '                        <span class="fa arrow"></span>' +
                                '                    </a>' +
                                '                    <ul class="nav nav-second-level"><li>';
                            var secondArray = new Array()
                            $.each(moduleList, function (index2, item2) {
                                if (item2.parentId == item1.id) {
                                    secondArray[index2] = item2.id;
                                }
                            });
                            for (var i2 = 0; i2 < secondArray.length; i2++) {
                                $.each(moduleList, function (index2, item2) {
                                    if (item2.id == secondArray[i2]) {
                                        if (item2.levelType == 1) {
                                            str = str + '<a class="J_menuItem" href="' + item2.moduleUrl + '">' +
                                                '<span class="nav-label">' + item2.moduleName + '</span></a>';
                                        } else {
                                            str = str + '</li><li><a href="#">' + item2.moduleName + '<span class="fa arrow"></span></a>' +
                                                '<ul class="nav nav-third-level"><li>';
                                            var thirdArray = new Array()
                                            $.each(moduleList, function (index3, item3) {
                                                if (item3.parentId == item2.id) {
                                                    thirdArray[index3] = item3.id;
                                                }
                                            });
                                            for (var i3 = 0; i3 < thirdArray.length; i3++) {
                                                $.each(moduleList, function (index3, item3) {
                                                    if (item3.id == thirdArray[i3]) {
                                                        if (item3.levelType == 1) {
                                                            str = str + '<a class="J_menuItem" href="' + item3.moduleUrl + '">' +
                                                                '<span class="nav-label">' + item3.moduleName + '</span></a>';
                                                        } else {
                                                            str = str + '<a href="#">' + item3.moduleName + '<span class="fa arrow"></span></a>' +
                                                                '<ul class="nav nav-third-level"><li>';
                                                            var fourArray = new Array()
                                                            $.each(moduleList, function (index4, item4) {
                                                                if (item4.parentId == item3.id) {
                                                                    fourArray[index4] = item4.id;
                                                                }
                                                            });
                                                            for (var i4 = 0; i4 < fourArray.length; i4++) {
                                                                $.each(moduleList, function (index4, item4) {
                                                                    if (item4.id == fourArray[i4]) {
                                                                        if (item4.levelType == 1) {
                                                                            str = str + '<a class="J_menuItem" href="' + item4.moduleUrl + '">' +
                                                                                '<span class="nav-label">' + item4.moduleName + '</span></a>';
                                                                        } else {
                                                                            str = str + '<a href="#">' + item4.moduleName + '<span class="fa arrow"></span></a>' +
                                                                                '<ul class="nav nav-third-level"><li>';
                                                                            ////此处加入第五级
                                                                            str = str + '</li></ul>';
                                                                        }
                                                                    }

                                                                });
                                                            }
                                                            str = str + '</li></ul>';
                                                        }
                                                    }
                                                });
                                            }
                                            str = str + '</li></ul>';
                                        }
                                    }
                                });
                            }
                            str = str + '</li></ul></li>';
                        }
                    }
                });
            }
            $("#side-menu").html(str);
            //$('#side-menu').metisMenu();
            //菜单点击 J_iframe
            $(".J_menuItem").on('click', function () {
                var url = $(this).attr('href');
                $("#J_iframe").attr('src', url);
                $(".nav-label").removeClass("click_color");
                var $this = $(this).children("span:first-child");
                $this.addClass("click_color");
                return false;
            });
            // MetsiMenu
            $('#side-menu').metisMenu();
            // 打开右侧边栏
            $('.right-sidebar-toggle').click(function () {
                $('#right-sidebar').toggleClass('sidebar-open');
            });
            //固定菜单栏
            $(function () {
                $('.sidebar-collapse').slimScroll({
                    height: '100%',
                    railOpacity: 0.9,
                    alwaysVisible: false
                });
            });
            // 菜单切换
            $('.navbar-minimalize').click(function () {
                $("body").toggleClass("mini-navbar");
                SmoothlyMenu();
            });
        } else {
            location.href = "/login";
        }
    });

    // 侧边栏高度
    function fix_height() {
        var heightWithoutNavbar = $("body > #wrapper").height() - 61;
        $(".sidebard-panel").css("min-height", heightWithoutNavbar + "px");
    }

    fix_height();

    $(window).bind("load resize click scroll", function () {
        if (!$("body").hasClass('body-small')) {
            fix_height();
        }
    });

    //侧边栏滚动
    $(window).scroll(function () {
        if ($(window).scrollTop() > 0 && !$('body').hasClass('fixed-nav')) {
            $('#right-sidebar').addClass('sidebar-top');
        } else {
            $('#right-sidebar').removeClass('sidebar-top');
        }
    });

    /*$('.nav-close').click(NavToggle);*/

    //ios浏览器兼容性处理
    if (/(iPhone|iPad|iPod|iOS)/i.test(navigator.userAgent)) {
        $('#content-main').css('overflow-y', 'auto');
    }
});

function NavToggle() {
    $('.navbar-minimalize').trigger('click');
}

function SmoothlyMenu() {
    if (!$('body').hasClass('mini-navbar')) {
        $('#side-menu').hide();
        setTimeout(
            function () {
                $('#side-menu').fadeIn(500);
            }, 100);
    } else if ($('body').hasClass('fixed-sidebar')) {
        $('#side-menu').hide();
        setTimeout(function () {
                $('#side-menu').fadeIn(500);
        }, 300);
    } else {
        $('#side-menu').removeAttr('style');
    }
}

$(window).bind("load resize", function () {
    if ($(this).width() < 769) {
        $('body').addClass('mini-navbar');
        $('.navbar-static-side').fadeIn();
    }
});

$('.full-height-scroll').slimScroll({
    height: '100%'
});

$('#side-menu>li').click(function () {
    if ($('body').hasClass('mini-navbar')) {
        NavToggle();
    }
});
$('#side-menu>li li a').click(function () {
    if ($(window).width() < 769) {
        NavToggle();
    }
});

function showUpdatePasswor() {
    $("#passwordOld").val("");
    $("#passwordNew").val("");
    $("#passwordNewConfirm").val("");
    // 显示弹框
    $("#updateUserPasswordId").modal('show');
}
function updateUserPassword(){
    var loginStr = "";
    $.ajax({
        url: "/loginStr",
        type: "get",
        dataType:"json",
        success: function(result){
            loginStr = result.data;
            console.log(loginStr + "loginStr");
            var passwordOld=$.md5($("#passwordOld").val() + loginStr);
            if(passwordOld==""){
                alert("原密码不能为空");
                $("#passwordOld").focus();
                return;
            }
            var passwordNew=$.md5($("#passwordNew").val() + loginStr);
            if(passwordNew==""){
                alert("新密码不能为空");
                $("#passwordNew").focus();
                return;
            }
            var passwordNewConfirm=$.md5($("#passwordNewConfirm").val() + loginStr);
            if(passwordNewConfirm==""){
                alert("确认新密码不能为空");
                $("#passwordNewConfirm").focus();
                return;
            }
            $("#passwordOld").val(passwordOld);
            $("#passwordNew").val(passwordNew);
            $("#passwordNewConfirm").val(passwordNewConfirm);

            console.log($("#passwordOld").val() + "old" +
                $("#passwordNew").val() + "new" +
                $("#passwordNewConfirm").val() + "conm");

            $("#updateUserPasswordForm").ajaxSubmit({
                success:function(result){
                    var status=result.data.status;
                    var msg=result.data.msg;
                    if(status==1){
                        alert("修改成功");
                        $("#updateUserPasswordId").modal("hide");
                    }else{
                        alert(msg);
                    }
                }
            });
        }
    });

}