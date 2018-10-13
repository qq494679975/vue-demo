<template>
  <div>
    call
    <button @click="call">call</button>
  </div>
</template>

<script>
import conncetor from '../../conncetor.js'

export default {
  data () {
    return {
      text2: '呵呵'
    }
  },
  methods: {
    call () {
      conncetor.$emit('phone', 'send message')
    }
  }
}
</script>
