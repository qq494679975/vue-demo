<template>
  <div>
    <header>
      <router-link to="/dom">跳转到dom</router-link>
    </header>
    <h1>about</h1>
    <p v-bind:class="isRed?'green':'red'">{{aboutMsg}}</p>
    <button v-on:click="change">点击切换样式</button>
  </div>
</template>
<script>
export default {
  data () {
    return {
      aboutMsg: '我是about组件',
      isRed: false
    }
  },
  methods: {
    change () {
      if (this.isRed) {
        this.isRed = false
      } else {
        this.isRed = true
      }
    }
  }
}
</script>
<style>
  .green {
    background-color: green;
  }
  .red {
    background-color: red;
  }
</style>
