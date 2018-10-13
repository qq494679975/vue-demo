<template>
  <div>
    <ul>
      <li v-for="(hero,index) in heros" :key="index">
        {{hero.msg}}
      </li>
    </ul>
    listen
    <button @click="listen">listen</button>
    <hr/>
    <vueBusCall></vueBusCall>
  </div>
</template>

<script>
import conncetor from '../../conncetor.js'
import vueBusCall from './vueBusCall'

export default {
  data () {
    return {
      msg: '',
      heros: [{
        msg: '初始化消息'
      }]
    }
  },
  methods: {
    listen () {
      conncetor.$on('phone', function (msg) {
        // 获取页面输入的值的时候，你用什么？v-model
        console.info(msg)
        this.heros.push({
          msg: msg
        })
        this.msg = ''
      })
    }
  },
  components: {
    vueBusCall
  }
}
</script>
