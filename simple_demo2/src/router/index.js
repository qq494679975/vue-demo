import Vue from 'vue'
import Router from 'vue-router'
import vBind from '@/components/v_bind'
import vOn from '@/components/v_on'
import vFor from '@/components/v_for'
import list from '@/components/list'
import dom from '@/components/dom'
import parent from '@/components/parent'
import vuebus from '@/components/vuebus/vueBusListen'
import notFound from '@/components/404'
import defaultPage from '@/components/defaultPage'

Vue.use(Router)

export default new Router({
  routes: [
    {
      // 默认页面  重定向
      path: '/',
      redirect: { name: 'defaultPage'}
    },
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
      path: '/vuebus',
      name: 'vuebus',
      component: vuebus
    },
    {
      path: '/dom/:id',
      name: 'dom',
      component: dom
    },
    {
      path: '/defaultPage',
      name: 'defaultPage',
      component: defaultPage
    },
    {
      // 錯誤404
      path: '/*',
      name: 'notFound',
      component: notFound
    }
  ]
})
