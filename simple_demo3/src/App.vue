<template>
  <div id="app">
    <!--<img src="./assets/logo.png">-->
    <!-- router-link 定义点击后导航到哪个路径下 -->
    <router-link to="/person/personInfo">personInfo</router-link>
    <router-link to="/person/personList">personList</router-link>
    <!-- 对应的组件内容渲染到router-view中 -->
    <router-view/>
  </div>
</template>

<script>
export default {
  name: 'App'
}
</script>

<style>
#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
