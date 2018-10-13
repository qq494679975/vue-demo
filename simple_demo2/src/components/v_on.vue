<template>
  <div>
    父组件传过来的值：{{textOne}}
    <br/>
    <button v-on:click="sayHello()">点击sayHello1</button>
    <button @click="sayHello()">点击sayHello2</button>
    <button @click="sayParent()">点击获取父亲传过来的值</button>
  </div>

</template>

<script>
export default {
  name: 'von',
  data () {
    return {
      msg: 'Welcome to Your Vue.js App'
    }
  },
  methods: {
    sayHello () {
      alert('hello')
    },
    sayParent () {
      alert(this.textOne)
    }
  },
  // 接收父组件传过来的值
  props: ['textOne']
}
</script>
