var general_equipment_data_Tree=[
    { text: '热轧厂', children: [
        { text: '一热轧',id:1,children:[
            {text:'原料区',id:1,children:[{
                id:1,text:'设备1' },{
                id:1,text:'设备2' },{
                id:1,text:'设备3' },{
                id:1, text:'设备4' }]},
            {text:'加热区',id:1,children:[{
                id:1,text:'设备1' },{
                id:1,text:'设备2' },{
                id:1,text:'设备3' },{
                id:1, text:'设备4' }]},
            {text:'粗轧区',id:1,children:[{
                id:1,text:'设备1' },{
                id:1,text:'设备2' },{
                id:1,text:'设备3' },{
                id:1, text:'设备4' }]},
            {text:'精轧区',id:1,children:[{
                id:1,text:'设备1' },{
                id:1,text:'设备2' },{
                id:1,text:'设备3' },{
                id:1, text:'设备4' }]},
            {text:'卷取区',id:1,children:[{
                id:1,text:'设备1' },{
                id:1,text:'设备2' },{
                id:1,text:'设备3' },{
                id:1, text:'设备4' }]},
            {text:'运输链区',id:1,children:[{
                id:1,text:'设备1' },{
                id:1,text:'设备2' },{
                id:1,text:'设备3' },{
                id:1, text:'设备4' }]}




        ] },
        { text: '二热轧' },
        { text: '一线水处理'
        },
        { text: '二线水处理' }
    ]
    }
];//设备树json

var equipment_list_grid_data ={Rows:[{equiment_id:1,equipment_name:"设备1",equipment_size:"",equipment_class:"加热设备",equiPment_manager:"l2h",equipment_position:"加热区",equipment_parent:"",equipment_grade:"A"},
    {equiment_id:1,equipment_name:"设备1",equipment_size:"",equipment_class:"加热设备",equiPment_manager:"l2h",equipment_position:"加热区",equipment_parent:"",equipment_grade:"A"}
]}
//用户数据
var userData = {Rows:[{userID:84300329,userRealName:"刘荔华",contactPhone:"13557321203"},{userID:84300200,userRealName:"李博",contactPhone:"13557321203"},{userID:843000201,userRealName:"莫姐",contactPhone:"13557321203"},
    {userID:84300309,userRealName:"韦皓",contactPhone:"13557321203"},{userID:84300324,userRealName:"李老师",contactPhone:"13557321203"}]};
//供应商数据
var supplierData = {Rows:[{supplierID:84300329,supplierName:"刘荔华",contactPhone:"13557321203",city:"广西"},
    {supplierID:84300200,supplierName:"李博",contactPhone:"13557321203",city:"广西"},
    {supplierID:843000201,supplierName:"莫姐",contactPhone:"13557321203",city:"广西"},{supplierID:84300329,supplierName:"刘荔华",contactPhone:"13557321203",city:"广东"},
    {supplierID:84300200,supplierName:"李博",contactPhone:"13557321203",city:"广东"},
    {supplierID:843000201,supplierName:"莫姐",contactPhone:"13557321203",city:"广东"}]};

//物料表格模拟数据
var equipment_material_grid_data={Rows:[{equipment_name:"步进梁",material_id:33,material_name:"dd",material_group:"dadf",material_attribute:"dssa",material_size:"333x454",material_size2:"dss",material_init_online_num:3,material_online_num:7,material_record:0},
    {equipment_name:"步进梁",material_id:33,material_name:"dd",material_group:"dadf",material_attribute:"dssa",material_size:"333x454",material_size2:"dss",material_init_online_num:3,material_online_num:7,material_record:0}]};
//物料表格参数


//停机记录表格模拟数据
var equipment_run_out_grid_data={Rows:[{department:"自动化",equipment_name:"步进梁",area:"33",product_line:"2032",is_checked:"是",run_out_reason_class:"临时检修",grade:"A",professional:"电气",run_out_type:'单台停机',
    run_out_start_time:"2015-08-06 16:70",run_out_finish_time:"2015-08-06 16:70",grade:"A",professional:"电气",
    run_out_pay_time:"2015-08-06 16:70",creator:"2eee",insert_time:"2015-08-06 16:70",shift:"甲",work_shift:"白",is_plan:"是",run_out_report:"ss",run_out_reason:"ddfdd",check_man:"调度",check_time:"2015-08-06 16:70"}]};
//停机记录表格参数

//故障报告表格模拟数据
var equipment_accident_grid_data={Rows:[{state:"维修",area:"33",department:"自动化",is_sure:"是",equipment_name:"dssa",equipment_class:"A",professional:"电气",accident_name:3,
    accident_grade:"重大事故",accident_class:"电气",accident_happen_time:"2015-08-06 16:70",creator:"A",professional:"电气",insert_time:"2015-08-06 16:70",
    check_man_first:"201",check_man_first_insert_time:"2015-08-06 16:70", check_man_second:"201",check_man_second_insert_time:"2015-08-06 16:70", check_man_third:"201",check_man_third_insert_time:"2015-08-06 16:70",accident_case:"调度"},
    {state:"正在处理",area:"33",department:"自动化",is_sure:"是",equipment_name:"dssa",equipment_class:"A",professional:"电气",accident_name:3,
        accident_grade:"重大事故",accident_class:"电气",accident_happen_time:"2015-08-06 16:70",creator:"A",professional:"电气",insert_time:"2015-08-06 16:70",
        check_man_first:"201",check_man_first_insert_time:"2015-08-06 16:70", check_man_second:"201",check_man_second_insert_time:"2015-08-06 16:70", check_man_third:"201",check_man_third_insert_time:"2015-08-06 16:70",accident_case:"调度"}]};
//故障报告表格参数

//缺陷记录表格模拟数据
var equipment_bug_grid_data={Rows:[{state:"监护运行",area:"33",bug_happen_time:"015-08-06 16:70",area:"是",equipment_first_level:"dssa",equipment_second_level:"A",equipment_third_level:"电气",equipment_name:3,
    bug_info:"重大事故",professional:"电气",department:"自动化室",bug_class:"A",professional:"电气",creator:"2015",equipment_manager:"刘荔华",discoverer:"莫姐",discover_time:"2015-08-07 09:09",
    insert_time:"2015-08-06 16:70",solve_man:"莫姐", custody_record:"201",grade:"A", solution:"201",real_solve_time:"2015-08-06 16:70",bug_dataSource:"操作工报告",bug_solve_plan_time:"计划处理时间",bug_solve_real_time:"2015-08-07 09:09",
    work_shift:"白", shift:"甲",creator:"2015-08-06 16:70", creatorDepartment:"自动化室",plan_solve_time:"2015-08-06 16:70",bug_solve_method:'处理方法',bug_solve_result:"处理结果",approval_info:"审批备注"},
    {state:"完成",area:"33",bug_happen_time:"015-08-06 16:70",area:"是",equipment_first_level:"dssa",equipment_second_level:"A",equipment_third_level:"电气",equipment_name:3,
    bug_info:"重大事故",professional:"电气",department:"自动化室",bug_class:"A",professional:"电气",creator:"2015",equipment_manager:"刘荔华",discoverer:"莫姐",discover_time:"2015-08-07 09:09",
    insert_time:"2015-08-06 16:70",solve_man:"莫姐", custody_record:"201",grade:"A", solution:"201",real_solve_time:"2015-08-06 16:70",bug_dataSource:"操作工报告",bug_solve_plan_time:"计划处理时间",bug_solve_real_time:"2015-08-07 09:09",
    work_shift:"白", shift:"甲",creator:"2015-08-06 16:70", creatorDepartment:"自动化室",plan_solve_time:"2015-08-06 16:70",bug_solve_method:'处理方法',bug_solve_result:"处理结果",approval_info:"审批备注"}]};
var equipment_bug_grid_data_dd={Rows:[{state:"监护运行",area:"33",bug_happen_time:"015-08-06 16:70",area:"是",equipment_first_level:"dssa",equipment_second_level:"A",equipment_third_level:"电气",equipment_name:3,
    bug_info:"重大事故",professional:"电气",department:"自动化室",bug_class:"A",professional:"电气",creator:"2015",equipment_manager:"刘荔华",discoverer:"莫姐",discover_time:"2015-08-07 09:09",
    insert_time:"2015-08-06 16:70",solve_man:"莫姐", custody_record:"201",grade:"A", solution:"201",real_solve_time:"2015-08-06 16:70",bug_dataSource:"操作工报告",bug_solve_plan_time:"计划处理时间",bug_solve_real_time:"2015-08-07 09:09",
    work_shift:"白", shift:"甲",creator:"2015-08-06 16:70", creatorDepartment:"自动化室",plan_solve_time:"2015-08-06 16:70",bug_solve_method:'处理方法',bug_solve_result:"处理结果",approval_info:"审批备注"},
    {state:"完成",area:"33",bug_happen_time:"015-08-06 16:70",area:"是",equipment_first_level:"dssa",equipment_second_level:"A",equipment_third_level:"电气",equipment_name:3,
        bug_info:"重大事故",professional:"电气",department:"自动化室",bug_class:"A",professional:"电气",creator:"2015",equipment_manager:"刘荔华",discoverer:"莫姐",discover_time:"2015-08-07 09:09",
        insert_time:"2015-08-06 16:70",solve_man:"莫姐", custody_record:"201",grade:"A", solution:"201",real_solve_time:"2015-08-06 16:70",bug_dataSource:"操作工报告",bug_solve_plan_time:"计划处理时间",bug_solve_real_time:"2015-08-07 09:09",
        work_shift:"白", shift:"甲",creator:"2015-08-06 16:70", creatorDepartment:"自动化室",plan_solve_time:"2015-08-06 16:70",bug_solve_method:'处理方法',bug_solve_result:"处理结果",approval_info:"审批备注"}]};
//缺陷记录报告表格参数

//检修记录表格模拟数据
var equipment_overhaul_grid_data={Rows:[{state:"新建",overhaul_class:"日常维修",overhaul_project_name:"33",equipment_name:"015-08-06 16:70",overhaul_department:"是",overhaul_content:"dssa",overhaul_manager:"A",overhaul_start_time:"电气",overhaul_finish_time:3,
    bug_info:"重大事故",professional:"电气",department:"2015-08-06 16:70",breakdown_class:"A",professional:"电气",creator:"2015",
    insert_time:"201",solve_man:"2015-08-06 16:70", custody_record:"201",grade:"2015-08-06 16:70", solution:"201",real_solve_time:"2015-08-06 16:70",dataSource:"调度",
    overhaul_task_list:"2015-08-06 16:70"}]};
//检修记录报告表格参数

//物料更换记录表格模拟数据
var equipment_material_replace_grid_data={Rows:[{overhaul_project_name:"日常维修",overhaul_content:"33",materialID:"015-08-06 16:70",material_name:"是",overhaul_content:"dssa",material_num:"A",material_class:"电气",grade:3,
    overhaul_date:"2015-08-06 16:70",overhaul_manager:"A"}]};
//检修项目
var overhaul_grid_data={Rows:[{state:"新建",overhaul_class:"计划检修",data_source:"测试",professional:"电气",area:"精轧区",overhaul_project_name:"侧导板检修",equipment_name:"侧导板",bug_info:"坏了"},{state:"新建",overhaul_class:"计划检修",data_source:"测试",professional:"电气",area:"精轧区",overhaul_project_name:"侧导板检修",equipment_name:"侧导板",bug_info:"坏了"},
    {state:"待审核",overhaul_class:"计划检修",data_source:"测试",professional:"电气",area:"精轧区",overhaul_project_name:"侧导板检修",equipment_name:"侧导板",bug_info:"坏了"},
    {state:"已审核",overhaul_class:"计划检修",data_source:"测试",professional:"电气",area:"精轧区",overhaul_project_name:"侧导板检修",equipment_name:"侧导板",bug_info:"坏了"}
]};
