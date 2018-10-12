import Vue from 'vue'
import Router from 'vue-router'
import HelloWorld from '@/components/HelloWorld'
import personInfo from '@/components/person/personInfo'
import personList from '@/components/person/personList'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: 'HelloWorld',
      component: HelloWorld
    },
    // 重定向
    // {
    //   path: '/',
    //   redirect: '/home'
    // },
    {
      path: '/person/personInfo',
      name: 'personInfo',
      component: personInfo
    },
    {
      path: '/person/personList',
      name: 'personList',
      component: personList
    }
  ]
})
