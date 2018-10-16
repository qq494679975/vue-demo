<template>
  <div ref="mydiv">
    <header>
      <router-link :to="{name:'vBind',query:{id:'aaa'}}">跳转到bind</router-link>
    </header>
    <button @click="addHero">獲取div對象</button>
    <div ref="aaa"></div>
    <list ref="vuelist"></list>
  </div>
</template>

<script>
  import list from './list'

  export default {
    data() {
      return {
        heros: [{
          id: 1,
          name: 'AAAAA',
          score: 'A'
        }]
      }
    },
    methods: {
      addHero() {
        //dom对象
        console.info(this.$refs.mydiv)
        console.info(this.$refs.aaa)
        //vue 组件对象
        console.info(this.$refs.vuelist)
      }
    },
    components: {
      list
    },
    created() {
      //组件创建后，数据已经初始化完 dom还没有生成
      console.log('created', this.$refs.mydiv)
      console.log('bind传过来的参数:', this.$route.params.id)
    },
    mounted() {
      //组件创建后，数据已经初始化完 将数据渲染到dom，dom生成
      console.log('mounted', this.$refs.mydiv)
      // this.$refs.mydiv.innerHTML = "自己添加的文本"
    }
  }
</script>
