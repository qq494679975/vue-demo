<template>
  <div ref="mydiv">
    <div ref="aaa"></div>
    <button @click="addHero">獲取div對象</button>
  </div>
</template>

<script>
export default {
  data () {
    return {
      heros: [{
        id: 1,
        name: 'AAAAA',
        score: 'A'
      }]

    }
  },
  methods: {
    addHero () {
      console.info(this.$refs.mydiv)
      console.info(this.$refs.aaa)
    }
  },
  created () {
    //组件创建后，数据已经初始化完 dom还没有生成
    console.log('created', this.$refs.mydiv)
  },
  mounted () {
    //组件创建后，数据已经初始化完 将数据渲染到dom，dom生成
    console.log('mounted', this.$refs.mydiv)
    this.$refs.mydiv.innerHTML = "自己添加的文本"
  }
}
</script>
