<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016-06-15
  Time: 14:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>柳钢热轧EAM系统</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <link href="../../../css/ligerui-all.css" rel="stylesheet" type="text/css" />
    <link rel="stylesheet" type="text/css" id="mylink" />
    <script type="text/javascript">


    </script>

    <style type="text/css">
        body, html {
            height: 100%;
        }

        body {
            padding: 0px;
            margin: 0;
            overflow: hidden;
        }

        .l-link {
            display: block;
            height: 26px;
            line-height: 26px;
            padding-left: 10px;
            text-decoration: underline;
            color: #333;
        }

        .l-link2 {
            text-decoration: underline;
            color: white;
            margin-left: 2px;
            margin-right: 2px;
        }

        .l-layout-top {
            background: #102A49;
            color: White;
        }

        .l-layout-bottom {
            background: #E5EDEF;
            text-align: center;
        }

        #pageloading {
            position: absolute;
            left: 0px;
            top: 0px;
            background: white url('../../../images/loading.gif') no-repeat center;
            width: 100%;
            height: 100%;
            z-index: 99999;
        }

        .l-link {
            display: block;
            line-height: 22px;
            height: 22px;
            padding-left: 16px;
            border: 1px solid white;
            margin: 4px;
        }

        .l-link-over {
            background: #FFEEAC;
            border: 1px solid #DB9F00;
        }

        .l-winbar {
            background: #2B5A76;
            height: 30px;
            position: absolute;
            left: 0px;
            bottom: 0px;
            width: 100%;
            z-index: 99999;
        }

        .space {
            color: #E7E7E7;
        }
        /* 顶部 */
        .l-topmenu {
            margin: 0;
            padding: 0;
            height: 51px;
            line-height: 51px;
            /* background: url('../../../../images/top.jpg') repeat bottom;*/
            background-color: #2679c4;
            position: relative;
            border-top: 1px solid #1D438B;
        }

        .l-topmenu-logo {
            color: #E7E7E7;
            padding-left: 35px;
            line-height: 40px;
            /*
             background: url('../../../../images/topicon.gif') no-repeat 10px 5px;*/
        }

        .l-topmenu-welcome {
            position: absolute;
            height: 24px;
            line-height: 24px;
            right: 30px;
            top: 10px;
            color: #070A0C;
        }

        .l-topmenu-welcome a {
            color: #E7E7E7;
            text-decoration: underline;
        }

        .body-gray2014 #framecenter {
            margin-top: 3px;
        }

        .viewsourcelink {
            background: #B3D9F7;
            display: block;
            position: absolute;
            right: 10px;
            top: 3px;
            padding: 6px 4px;
            color: #333;
            text-decoration: underline;
        }

        .viewsourcelink-over {
            background: #81C0F2;
        }

        .l-topmenu-welcome label {
            color: white;
        }

        #skinSelect {
            margin-right: 6px;
        }
    </style>
</head>
<body style="padding: 0px; background: #2679c4;">
<div id="pageloading"></div>
<div id="topmenu" class="l-topmenu">
    <div class="l-topmenu-logo"><label style="font-size: 20px; top: 40px"> 柳钢热轧EAM</label></div>
    <div class="l-topmenu-welcome">

        <label href="" class="l-link2" id="name">用户名：l2h</label>
        <span class="space">|</span>
        <label href="" class="l-link2" id="company">单位：热轧</label>
        <span class="space">|</span>
        <label href="" class="l-link2" id="department">部门：生产技术科</label>
        <span class="space">|</span>
        <label href="" class="l-link2" id="position">岗位：二级技术</label>
    </div>
</div>
<div id="layout1" style="width:99.6%; margin:0 auto; margin-top:4px; ">
    <div position="left" title="系统模块" id="accordion1">
        <div title="信息中心" class="l-scroll">
            <ul id="infoCenter" style="margin-top:3px;" />
        </div>

        <div title="设备管理">
            <ul id="equipmentMag" style="margin-top:3px;" />
        </div>
        <div title="物料管理">

            <ul id="materialMag" style="margin-top:3px;" />
        </div>
        <div title="点检管理">
            <ul id="spotInspectionMag" style="margin-top:3px;" />
        </div>
        <div title="检修管理">
            <ul id="overhaulMag" style="margin-top:3px;" />
        </div>
        <div title="运行管理">
            <ul id="runningMag" style="margin-top:3px;" />
        </div>
        <div title="系统管理">
            <ul id="systemMag" style="margin-top:3px;" />
        </div>
        <div title="个人中心管理">

            <ul id="personCenterMag" style="margin-top:3px;" />
        </div>
    </div>
    <div position="center" id="framecenter">
        <div tabid="home" title="我的主页" style="height:300px">
            <iframe frameborder="0" name="home" id="home" src="test.html"></iframe>
        </div>
    </div>

</div>
<div style="height:32px; line-height:32px; text-align:center;">
    Copyright © 2015 柳钢热轧厂版权所有
</div>
<div style="display:none"></div>

<script src="../../../js/jquery-1.5.2.min.js" type="text/javascript"></script>
<script src="../../../js/ligerui.min.js" type="text/javascript"></script>
<script src="../../../js/ligerTab.js"></script>
<script src="../../../js/indexdata.js" type="text/javascript"></script>
<script type="text/javascript">
    var test="ddwedd";
    var tab = null;
    var accordion = null;
    var tree = null;
    var tabItems = [];
    var sysMagTree =[

        { text: "用户管理", isexpand: "true", url: "sys/user/userMsgPage.do" },
        { text: "部门管理", isexpand: "true", url: "" },
        { text: "岗位管理", isexpand: "true", url: "" },
    ];
    ;
    var infoCenterTree = [
        { text: "桌面", isexpand: "true", url: "" },
        { text: "问题反馈", isexpand: "true", url: "" },
        { text: "工作任务", isexpand: "true", url: "" },
        { text: "发送消息", isexpand: "true", url: "" },
        { text: "已发消息", isexpand: "true", url: "" },
        { text: "公告信息", isexpand: "true", url: "" },
        { text: "收件箱", isexpand: "true", url: "" },
        { text: "考核单", isexpand: "true", url: "" }
    ];
    var equipmentMagTree = [
        {
            text: "设备卡片汇总", isexpand: "true", children: [
            { text: "通用设备卡片", isexpand: "true", url: "../../LG_EAM_Equipment/html/equipment_general_equipment.html" },
            { text: "起重设备卡片", isexpand: "true", url: "" },
            { text: "压力容器卡片", isexpand: "true", url: "" },
            { text: "锅炉设备卡片", isexpand: "true", url: "" }

        ]
        },

        { text: "设备类别设置", isexpand: "true", url: "" },
        { text: "设备维修标准", isexpand: "true", url: "" }
    ];
    var equipmentRunningTree = [

        { id:"running_bugList",text: "设备缺陷记录", isexpand: "true", url: "../../LG_EAM_Running/html/running_bugList.html" },
        {id:"bug",text:"工作记录",isexpand:"true",children:[
            { id:"running_transition",text: "操作岗位设备记录", isexpand: "true", url: "../../LG_EAM_Running/html/running_operate_position_worklog_List.html" },
            {  id:"bug1",text: "维修岗位设备记录", isexpand: "true", url: "" },
            {  id:"bug2",text: "管理岗位设备记录", isexpand: "true", url: "" }


        ]

        },


        {text: "故障管理", isexpand: "true", children: [
            { text: "停机记录", isexpand: "true", id:"running_run_outList",url: "../../LG_EAM_Running/html/running_run_outList.html" },
            { text: "故障报告", isexpand: "true", url: "" },
            { text: "故障案例", isexpand: "true", url: "" },
            { text: "小停报告", isexpand: "true", url: "" }

        ]
        },
        {text: "运行统计", isexpand: "true", children: [
            { text: "设备点检统计表", isexpand: "true", url: "../../LG_EAM_Equipment/html/general_equiment.html" },
            { text: "设备停机统计表", isexpand: "true", url: "" }


        ]
        },
        {text: "设备周期维护管理", isexpand: "true", children: [
            { text: "违规信息", isexpand: "true", url: "" }



        ]
        }
    ];
    var materialMagTree = [

        { text: "通用设备卡片", isexpand: "true", url: "" },
        { text: "起重设备卡片", isexpand: "true", url: "" },
        { text: "压力容器卡片", isexpand: "true", url: "" },
        { text: "锅炉设备卡片", isexpand: "true", url: "" }

    ];

    var demo = [{ "tid": 0, "pid": 0, "t_level": 0, "text": "开平线管理系统", "isexpand": false, "url": "", "children": [{ "tid": 1, "pid": 0, "t_level": 1, "text": "原料管理", "isexpand": false, "url": "", "children": [{ "tid": 4, "pid": 1, "t_level": 2, "text": "预计划", "isexpand": false, "url": "PZXSys_MateriaPlan.aspx", "children": null }, { "tid": 5, "pid": 1, "t_level": 2, "text": "预入库", "isexpand": false, "url": "PZXSys_MateriaPlanToRoom.aspx", "children": null }, { "tid": 6, "pid": 1, "t_level": 2, "text": "原料录入", "isexpand": false, "url": "PZXSys_MateriaInput.aspx", "children": null }, { "tid": 7, "pid": 1, "t_level": 2, "text": "原料清单", "isexpand": false, "url": "PZXSys_MateriaRoom.aspx", "children": null }, { "tid": 30, "pid": 1, "t_level": 2, "text": "原料状态修改", "isexpand": false, "url": "PZXSys_MateriaStateUpdate.aspx", "children": null }, { "tid": 24, "pid": 1, "t_level": 2, "text": "原料删除", "isexpand": false, "url": "PZXSys_MateriaDelete.aspx", "children": null }, { "tid": 26, "pid": 1, "t_level": 2, "text": "原料人工录入", "isexpand": false, "url": "PZXSys_MateriaInputByPerson.aspx", "children": null }] }, { "tid": 3, "pid": 0, "t_level": 1, "text": "出库管理", "isexpand": false, "url": "", "children": [{ "tid": 12, "pid": 3, "t_level": 2, "text": "出库录入", "isexpand": false, "url": "PZXSys_OutRoomMakeOrder.aspx", "children": null }, { "tid": 13, "pid": 3, "t_level": 2, "text": "单据打印", "isexpand": false, "url": "PZXSys_OutRoomPrint.aspx", "children": null }, { "tid": 14, "pid": 3, "t_level": 2, "text": "拆包", "isexpand": false, "url": "PZXSys_OutRoomExtract.aspx", "children": null }, { "tid": 15, "pid": 3, "t_level": 2, "text": "出库清单", "isexpand": false, "url": "PZXSys_OutRoomList.aspx", "children": null }, { "tid": 16, "pid": 3, "t_level": 2, "text": "出库分类", "isexpand": false, "url": "PZXSys_OutRoomClassQuery.aspx", "children": null }, { "tid": 29, "pid": 3, "t_level": 2, "text": "出口单据打印", "isexpand": false, "url": "PZXSys_OutRoomPrintOnExport.aspx", "children": null }, { "tid": 28, "pid": 3, "t_level": 2, "text": "卷发钢卷单据打印", "isexpand": false, "url": "PZXSys_OutRoomPrintOnCoil.aspx", "children": null }] }, { "tid": 2, "pid": 0, "t_level": 1, "text": "库存管理", "isexpand": false, "url": "", "children": [{ "tid": 8, "pid": 2, "t_level": 2, "text": "库存清单", "isexpand": false, "url": "PZXSys_StocksList.aspx", "children": null }, { "tid": 9, "pid": 2, "t_level": 2, "text": "库存分类", "isexpand": false, "url": "PZXSys_StocksClassQuery.aspx", "children": null }, { "tid": 10, "pid": 2, "t_level": 2, "text": "封锁", "isexpand": false, "url": "PZXSys_StocksLock.aspx", "children": null }, { "tid": 11, "pid": 2, "t_level": 2, "text": "库存报表", "isexpand": false, "url": "PZXSys_StocksReport.aspx", "children": null }, { "tid": 25, "pid": 2, "t_level": 2, "text": "异常钢卷库存清单", "isexpand": false, "url": "PZXSys_ExcCoilStocksList.aspx", "children": null }, { "tid": 23, "pid": 2, "t_level": 2, "text": "异常钢卷库存录入", "isexpand": false, "url": "PZXSys_StocksExCoilInput.aspx.aspx", "children": null }, { "tid": 27, "pid": 2, "t_level": 2, "text": "正常钢卷库存录入", "isexpand": false, "url": "PZXSys_StocksCoilInput.aspx", "children": null }] }, { "tid": 17, "pid": 0, "t_level": 1, "text": "系统管理", "isexpand": false, "url": "", "children": [{ "tid": 19, "pid": 17, "t_level": 2, "text": "权限配置", "isexpand": false, "url": "PZXSys_ManagerPrivilege.aspx", "children": null }, { "tid": 20, "pid": 17, "t_level": 2, "text": "岗位管理", "isexpand": false, "url": "PZXSys_ManagerRole.aspx", "children": null }, { "tid": 21, "pid": 17, "t_level": 2, "text": "页面管理", "isexpand": false, "url": "PZXSys_ManagerPage.aspx", "children": null }, { "tid": 22, "pid": 17, "t_level": 2, "text": "用户管理", "isexpand": false, "url": "ManagerUser.aspx", "children": null }] }] }];
    var height;
    $(function () {

        //布局
        $("#layout1").ligerLayout({ leftWidth: 190, height: '100%', heightDiff: -34, space: 4, onHeightChanged: f_heightChanged });

        height = $(".l-layout-center").height();

        //Tab
        $("#framecenter").ligerTab({
            height: height,
            showSwitchInTab: true,
            showSwitch: true,
            onAfterAddTabItem: function (tabdata) {
                tabItems.push(tabdata);

            },
            onAfterRemoveTabItem: function (tabid) {
                for (var i = 0; i < tabItems.length; i++) {
                    var o = tabItems[i];
                    if (o.tabid == tabid) {
                        tabItems.splice(i, 1);

                        break;
                    }
                }
            },
            onReload: function (tabdata) {
                var tabid = tabdata.tabid;
                addFrameSkinLink(tabid);
            }
        });

        //面板
        $("#accordion1").ligerAccordion({
            height: height - 24, speed: 'normal'
        });

        $(".l-link").hover(function () {
            $(this).addClass("l-link-over");
        }, function () {
            $(this).removeClass("l-link-over");
        });
        //信息中心树
        $("#infoCenter").ligerTree({
            data: infoCenterTree,
            checkbox: false,
            slide: false,
            nodeWidth: 120,
            attribute: ['text', 'url'],
            onSelect: function (node) {
                if (!node.data.url) return;
                var tabid = $(node.target).attr("tabid");
                if (!tabid) {
                    tabid = new Date().getTime();
                    $(node.target).attr("tabid", tabid)
                }
                f_addTab(tabid, node.data.text, node.data.url);
            }
        });
//设备树
        $("#equipmentMag").ligerTree({
            data: equipmentMagTree,
            checkbox: false,
            slide: false,
            nodeWidth: 120,
            attribute: ['text', 'url'],
            onSelect: function (node) {
                if (!node.data.url) return;
                var tabid = $(node.target).attr("tabid");
                if (!tabid) {
                    tabid = new Date().getTime();
                    $(node.target).attr("tabid", tabid)
                }
                f_addTab(tabid, node.data.text, node.data.url);
            }
        });
        //物料树
        $("#materialMag").ligerTree({
            data: materialMagTree,
            checkbox: false,
            slide: false,
            nodeWidth: 120,
            attribute: ['text', 'url'],
            onSelect: function (node) {
                if (!node.data.url) return;
                var tabid = $(node.target).attr("tabid");
                if (!tabid) {
                    tabid = new Date().getTime();
                    $(node.target).attr("tabid", tabid)
                }
                f_addTab(tabid, node.data.text, node.data.url);
            }
        });
        $("#runningMag").ligerTree({
            data: equipmentRunningTree,
            checkbox: false,
            slide: false,
            nodeWidth: 120,
            attribute: ['text', 'url'],
            onSelect: function (node) {
                if (!node.data.url) return;
                var tabid = $(node.target).attr("tabid");
                if (!tabid) {
                    tabid = new Date().getTime();
                    $(node.target).attr("tabid", tabid)
                }
                f_addTab(node.data.id, node.data.text, node.data.url);
            }
        });
        //系统管理
        $("#systemMag").ligerTree({
            data: sysMagTree,
            checkbox: false,
            slide: false,
            nodeWidth: 120,
            attribute: ['text', 'url'],
            onSelect: function (node) {
                if (!node.data.url) return;
                var tabid = $(node.target).attr("tabid");
                if (!tabid) {
                    tabid = new Date().getTime();
                    $(node.target).attr("tabid", tabid)
                }
                f_addTab(node.data.id, node.data.text, node.data.url);
            }
        });


        /**var test = JSON.parse($("#myHiddenVar").val());
         $("#systemMag").ligerTree({
                data: test,
                checkbox: false,
                slide: false,
                nodeWidth: 120,
                attribute: ['nodename', 'url'],
                onSelect: function (node) {
                    if (!node.data.url) return;
                    var tabid = $(node.target).attr("tabid");
                    if (!tabid) {
                        tabid = new Date().getTime();
                        $(node.target).attr("tabid", tabid)
                    }
                    f_addTab(tabid, node.data.text, node.data.url);
                }
            });*/
        tab = liger.get("framecenter");
        accordion = liger.get("accordion1");
        tree = liger.get("tree1");
        $("#pageloading").hide();


    });
    function f_heightChanged(options) {
        if (tab)
            tab.addHeight(options.diff);
        if (accordion && options.middleHeight - 24 > 0)
            accordion.setHeight(options.middleHeight - 24);
    }
    function f_addTab(tabid, text, url) {
        tab.addTabItem({
            tabid: tabid,
            text: text,
            url: url
        });
    }
    function f_addTab(tabid, text, url,data) {
        tab.addTabItem({
            tabid: tabid,
            text: text,
            url: url,
            data:data
        });
    }
    function addFrameSkinLink(tabid) {
        var prevHref = getLinkPrevHref(tabid) || "";
        var skin = getQueryString("skin");
        if (!skin) return;
        skin = skin.toLowerCase();
        attachLinkToFrame(tabid, prevHref + skin_links[skin]);
    }

    function pages_init() {
        var tabJson = $.cookie('liger-home-tab');
        if (tabJson) {
            var tabitems = JSON2.parse(tabJson);
            for (var i = 0; tabitems && tabitems[i]; i++) {
                f_addTab(tabitems[i].tabid, tabitems[i].text, tabitems[i].url);
            }
        }
    }


    function getQueryString(name) {
        var now_url = document.location.search.slice(1), q_array = now_url.split('&');
        for (var i = 0; i < q_array.length; i++) {
            var v_array = q_array[i].split('=');
            if (v_array[0] == name) {
                return v_array[1];
            }
        }
        return false;
    }
    function attachLinkToFrame(iframeId, filename) {
        if (!window.frames[iframeId]) return;
        var head = window.frames[iframeId].document.getElementsByTagName('head').item(0);
        var fileref = window.frames[iframeId].document.createElement("link");
        if (!fileref) return;
        fileref.setAttribute("rel", "stylesheet");
        fileref.setAttribute("type", "text/css");
        fileref.setAttribute("href", filename);
        head.appendChild(fileref);
    }
    function getLinkPrevHref(iframeId) {
        if (!window.frames[iframeId]) return;
        var head = window.frames[iframeId].document.getElementsByTagName('head').item(0);
        var links = $("link:first", head);
        for (var i = 0; links[i]; i++) {
            var href = $(links[i]).attr("href");
            if (href && href.toLowerCase().indexOf("ligerui") > 0) {
                return href.substring(0, href.toLowerCase().indexOf("lib"));
            }
        }
    }

</script>

</body>

</html>



