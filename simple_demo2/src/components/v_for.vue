<template>
  <div>
    <ul>
      <!--输出list-->
      <li v-for=" (one, index)  in stus " v-bind:key="index">  <!--v-bind:key 相当于 :key-->
        index{{index}},name:{{one.name}},age:{{one.age}}
      </li>
      <hr/>
      <!--输出对象-->
      <li v-for=" (value,key, index)  in person " :key="index">  <!-- v-bind:key 相当于 :key-->
        index{{index}},key:{{key}},value:{{value}}
      </li>
    </ul>
  </div>
</template>

<script>
export default {
  data () {
    return {
      stus: [{name: '测试1', age: 18}, {name: '测试2', age: 19}],
      person: {name: '测试1', age: 18}
    }
  }
}
</script>
