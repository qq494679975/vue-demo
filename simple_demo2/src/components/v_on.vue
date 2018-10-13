<template>
  <div>
    <button v-on:click="sayHello()">点击sayHello1</button>
    <button @click="sayHello()">点击sayHello2</button>
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
    }
  }
}
</script>
