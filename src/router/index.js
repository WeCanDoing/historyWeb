import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      redirect: '/history'
    },
    {
      path: '/history',
      name: 'history',
      component: resolve => require(['@/views/index'], resolve)
    }
  ]
})
