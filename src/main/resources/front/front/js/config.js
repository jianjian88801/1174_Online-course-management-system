
var projectName = '在线课程管理系统';
/**
 * 轮播图配置
 */
var swiper = {
	// 设定轮播容器宽度，支持像素和百分比
	width: '100%',
	height: '400px',
	// hover（悬停显示）
	// always（始终显示）
	// none（始终不显示）
	arrow: 'none',
	// default（左右切换）
	// updown（上下切换）
	// fade（渐隐渐显切换）
	anim: 'default',
	// 自动切换的时间间隔
	// 默认3000
	interval: 2000,
	// 指示器位置
	// inside（容器内部）
	// outside（容器外部）
	// none（不显示）
	indicator: 'outside'
}

/**
 * 个人中心菜单
 */
var centerMenu = [{
	name: '个人中心',
	url: '../' + localStorage.getItem('userTable') + '/center.html'
}, 
{
	name: '我的发布',
	url: '../forum/list-my.html'
},

{
	name: '我的收藏',
	url: '../storeup/list.html'
}
]


var indexNav = [

{
	name: '在线课程',
	url: './pages/zaixiankecheng/list.html'
}, 
{
	name: '课件信息',
	url: './pages/kejianxinxi/list.html'
}, 
{
	name: '知识要点',
	url: './pages/zhishiyaodian/list.html'
}, 
{
	name: '考试大纲',
	url: './pages/kaoshidagang/list.html'
}, 

{
	name: '在线交流',
	url: './pages/forum/list.html'
}, 
{
	name: '校园资讯',
	url: './pages/news/list.html'
},
]

var adminurl =  "http://localhost:8080/springboot0b6e5/admin/dist/index.html";

var cartFlag = false

var chatFlag = false




var menu = [{"backMenu":[{"child":[{"buttons":["查看","删除"],"menu":"在线课程","menuJump":"列表","tableName":"zaixiankecheng"}],"menu":"在线课程管理"},{"child":[{"buttons":["查看","删除"],"menu":"课件信息","menuJump":"列表","tableName":"kejianxinxi"}],"menu":"课件信息管理"},{"child":[{"buttons":["查看","删除"],"menu":"知识要点","menuJump":"列表","tableName":"zhishiyaodian"}],"menu":"知识要点管理"},{"child":[{"buttons":["查看","删除"],"menu":"教学计划","menuJump":"列表","tableName":"jiaoxuejihua"}],"menu":"教学计划管理"},{"child":[{"buttons":["查看","删除"],"menu":"考试大纲","menuJump":"列表","tableName":"kaoshidagang"}],"menu":"考试大纲管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"科目类型","menuJump":"列表","tableName":"kemuleixing"}],"menu":"科目类型管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"班级分类","menuJump":"列表","tableName":"banjifenlei"}],"menu":"班级分类管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"通知公告","menuJump":"列表","tableName":"tongzhigonggao"}],"menu":"通知公告管理"},{"child":[{"buttons":["查看","删除"],"menu":"在线交流","tableName":"forum"}],"menu":"在线交流"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"校园资讯","tableName":"news"},{"buttons":["新增","查看","修改","删除"],"menu":"轮播图管理","tableName":"config"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"buttons":["查看","加入课程"],"menu":"在线课程列表","menuJump":"列表","tableName":"zaixiankecheng"}],"menu":"在线课程模块"},{"child":[{"buttons":["查看"],"menu":"课件信息列表","menuJump":"列表","tableName":"kejianxinxi"}],"menu":"课件信息模块"},{"child":[{"buttons":["查看"],"menu":"知识要点列表","menuJump":"列表","tableName":"zhishiyaodian"}],"menu":"知识要点模块"},{"child":[{"buttons":["查看"],"menu":"考试大纲列表","menuJump":"列表","tableName":"kaoshidagang"}],"menu":"考试大纲模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"buttons":["查看","删除"],"menu":"我的课程","menuJump":"列表","tableName":"wodekecheng"}],"menu":"我的课程管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"学生提问","menuJump":"列表","tableName":"xueshengtiwen"}],"menu":"学生提问管理"},{"child":[{"buttons":["查看","删除"],"menu":"提问解答","menuJump":"列表","tableName":"tiwenjieda"}],"menu":"提问解答管理"}],"frontMenu":[{"child":[{"buttons":["查看","加入课程"],"menu":"在线课程列表","menuJump":"列表","tableName":"zaixiankecheng"}],"menu":"在线课程模块"},{"child":[{"buttons":["查看"],"menu":"课件信息列表","menuJump":"列表","tableName":"kejianxinxi"}],"menu":"课件信息模块"},{"child":[{"buttons":["查看"],"menu":"知识要点列表","menuJump":"列表","tableName":"zhishiyaodian"}],"menu":"知识要点模块"},{"child":[{"buttons":["查看"],"menu":"考试大纲列表","menuJump":"列表","tableName":"kaoshidagang"}],"menu":"考试大纲模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"学生用户","tableName":"xueshengyonghu"},{"backMenu":[{"child":[{"buttons":["新增","查看","修改","删除","发布课件","发布知识点","发布大纲","查看评论"],"menu":"在线课程","menuJump":"列表","tableName":"zaixiankecheng"}],"menu":"在线课程管理"},{"child":[{"buttons":["查看","删除"],"menu":"课件信息","menuJump":"列表","tableName":"kejianxinxi"}],"menu":"课件信息管理"},{"child":[{"buttons":["查看","删除"],"menu":"知识要点","menuJump":"列表","tableName":"zhishiyaodian"}],"menu":"知识要点管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"教学计划","menuJump":"列表","tableName":"jiaoxuejihua"}],"menu":"教学计划管理"},{"child":[{"buttons":["查看","删除"],"menu":"考试大纲","menuJump":"列表","tableName":"kaoshidagang"}],"menu":"考试大纲管理"},{"child":[{"buttons":["查看","删除","审核","解答"],"menu":"学生提问","menuJump":"列表","tableName":"xueshengtiwen"}],"menu":"学生提问管理"},{"child":[{"buttons":["查看","删除"],"menu":"提问解答","menuJump":"列表","tableName":"tiwenjieda"}],"menu":"提问解答管理"}],"frontMenu":[{"child":[{"buttons":["查看","加入课程"],"menu":"在线课程列表","menuJump":"列表","tableName":"zaixiankecheng"}],"menu":"在线课程模块"},{"child":[{"buttons":["查看"],"menu":"课件信息列表","menuJump":"列表","tableName":"kejianxinxi"}],"menu":"课件信息模块"},{"child":[{"buttons":["查看"],"menu":"知识要点列表","menuJump":"列表","tableName":"zhishiyaodian"}],"menu":"知识要点模块"},{"child":[{"buttons":["查看"],"menu":"考试大纲列表","menuJump":"列表","tableName":"kaoshidagang"}],"menu":"考试大纲模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"教师用户","tableName":"jiaoshiyonghu"}]


var isAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].backMenu.length;j++){
                for(let k=0;k<menus[i].backMenu[j].child.length;k++){
                    if(tableName==menus[i].backMenu[j].child[k].tableName){
                        let buttons = menus[i].backMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}

var isFrontAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].frontMenu.length;j++){
                for(let k=0;k<menus[i].frontMenu[j].child.length;k++){
                    if(tableName==menus[i].frontMenu[j].child[k].tableName){
                        let buttons = menus[i].frontMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}
