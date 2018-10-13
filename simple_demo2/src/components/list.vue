<template>
  <div>
    <ul>
      <li v-for="(hero,index) in heros" :key="index" :class="{'A':'red','B':'blue','C':'green','D':'pink'}[hero.score]">
        {{hero.name}},{{hero.score}}
        <button @click="del(index)">删除</button>
      </li>
    </ul>

    姓名:<input type="text" name="" v-model="name"> <br/>
    成绩:<input type="text" name="" v-model="score">
    <button @click="addHero">添加</button>
  </div>
</template>
<script>
export default {
  data () {
    return {
      name: '',
      score: '',
      heros: [{
        id: 1,
        name: 'AAAAA',
        score: 'A'
      }, {
        id: 2,
        name: 'BBBBB',
        score: 'B'
      }, {
        id: 3,
        name: 'CCCCC',
        score: 'C'
      }, {
        id: 4,
        name: 'DDDDD',
        score: 'D'
      }]

    }
  },

  methods: {
    addHero () {
      // 获取页面输入的值的时候，你用什么？v-model
      this.heros.push({
        name: this.name,
        score: this.score
      })
      this.name = ''
      this.score = ''
    },
    del (index) {
      this.heros.splice(index, 1)
    }
  }
}
</script>
<style>
  .red {
    background-color: red;
  }

  .green {
    background-color: yellowgreen;
  }

  .blue {
    background-color: skyblue;
  }

  .pink {
    background-color: hotpink;
  }
</style>
