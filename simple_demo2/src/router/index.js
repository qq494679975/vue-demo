import Vue from 'vue'
import Router from 'vue-router'
import vBind from '@/components/v_bind'
import vOn from '@/components/v_on'
import vFor from '@/components/v_for'
import list from '@/components/list'
import parent from '@/components/parent'
Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/vBind',
      name: 'vBind',
      component: vBind
    },
    {
      path: '/vOn',
      name: 'vOn',
      component: vOn
    },
    {
      path: '/vFor',
      name: 'vFor',
      component: vFor
    },
    {
      path: '/list',
      name: 'list',
      component: list
    },
    {
      path: '/parent',
      name: 'parent',
      component: parent
    },
    {
      // 重定向
      path: '/',
      redirect: '/home'
    }
  ]
})
