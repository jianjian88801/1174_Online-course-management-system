import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import news from '@/views/modules/news/list'
    import discusszaixiankecheng from '@/views/modules/discusszaixiankecheng/list'
    import banjifenlei from '@/views/modules/banjifenlei/list'
    import tiwenjieda from '@/views/modules/tiwenjieda/list'
    import kemuleixing from '@/views/modules/kemuleixing/list'
    import zaixiankecheng from '@/views/modules/zaixiankecheng/list'
    import forum from '@/views/modules/forum/list'
    import zhishiyaodian from '@/views/modules/zhishiyaodian/list'
    import xueshengtiwen from '@/views/modules/xueshengtiwen/list'
    import kejianxinxi from '@/views/modules/kejianxinxi/list'
    import tongzhigonggao from '@/views/modules/tongzhigonggao/list'
    import wodekecheng from '@/views/modules/wodekecheng/list'
    import jiaoxuejihua from '@/views/modules/jiaoxuejihua/list'
    import kaoshidagang from '@/views/modules/kaoshidagang/list'
    import config from '@/views/modules/config/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/news',
        name: '校园资讯',
        component: news
      }
      ,{
	path: '/discusszaixiankecheng',
        name: '在线课程评论',
        component: discusszaixiankecheng
      }
      ,{
	path: '/banjifenlei',
        name: '班级分类',
        component: banjifenlei
      }
      ,{
	path: '/tiwenjieda',
        name: '提问解答',
        component: tiwenjieda
      }
      ,{
	path: '/kemuleixing',
        name: '科目类型',
        component: kemuleixing
      }
      ,{
	path: '/zaixiankecheng',
        name: '在线课程',
        component: zaixiankecheng
      }
      ,{
	path: '/forum',
        name: '在线交流',
        component: forum
      }
      ,{
	path: '/zhishiyaodian',
        name: '知识要点',
        component: zhishiyaodian
      }
      ,{
	path: '/xueshengtiwen',
        name: '学生提问',
        component: xueshengtiwen
      }
      ,{
	path: '/kejianxinxi',
        name: '课件信息',
        component: kejianxinxi
      }
      ,{
	path: '/tongzhigonggao',
        name: '通知公告',
        component: tongzhigonggao
      }
      ,{
	path: '/wodekecheng',
        name: '我的课程',
        component: wodekecheng
      }
      ,{
	path: '/jiaoxuejihua',
        name: '教学计划',
        component: jiaoxuejihua
      }
      ,{
	path: '/kaoshidagang',
        name: '考试大纲',
        component: kaoshidagang
      }
      ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
