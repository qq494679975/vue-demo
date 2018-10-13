<template>
  <div>
    <vOn></vOn>  <!--添加组件-->
    <hr/>
    <list></list>
  </div>
</template>
<script>
/*
父子组件的demo
引入组件
*/
// import vOn from './v_on' 已经在全局组件中引入不需要再引入
import list from './list'

export default {
  data () {
    return {
      aboutMsg: '我是about组件',
      isRed: false
    }
  },
  methods: {},
  components: {
    // vOn: vOn,
    list
  }
}
</script>
