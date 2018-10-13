<template>
  <div id="app">
    <!-- router-link 定义点击后导航到哪个路径下 -->
    <header>
      <router-link to="/vBind">v_bind</router-link>
      <router-link to="/vOn">v_on</router-link>
      <router-link to="/vFor">v_for</router-link>
      <router-link to="/list">list</router-link>
      <router-link to="/parent">parent</router-link>
      <router-link to="/vuebus">vuebus</router-link>
      <router-link :to="{name:'dom'}">dom</router-link>
    </header>
    <!-- 对应的组件内容渲染到router-view中 -->
    <router-view></router-view>
  </div>
</template>

<script>
export default {
  name: 'App'
}
</script>

<style scoped>
#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
