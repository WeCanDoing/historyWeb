<template>
  <div id="app" >
     <div  class="img1">
    <!-- 导航区域 -->
    <historyheader/>
    <router-view/>
    <historyfooter/>
     </div>
  </div>
</template>

<script>
import historyheader from '@/components/historyheader'
import historyfooter from '@/components/historyfooter'

export default {
  name: 'App',
  components:{
  historyheader,
  historyfooter,
  },
  data () {
     return {

     }
   },
  created () {
    setTimeout(() => {
      window.L2Dwidget.init({
        pluginRootPath: 'static/live2dw/',
        pluginJsPath: 'lib/',
        pluginModelPath: 'live2d-widget-model-izumi/assets/',
        tagMode: false,
        debug: false,
        model: { jsonPath: '../static/live2dw/live2d-widget-model-izumi/assets/izumi.model.json' },
        display: { position: 'right', width: 200, height: 450 },
        mobile: { show: true },
        log: false
      })
    }, 1000)
  }
}
</script>

<style>
#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: -8px;
  background-position: center
}
.img1{
    width: 100%;
    height: 1200px;
    background: url('../static/image/back.jpg') center center no-repeat;
    background-size: cover;
    -webkit-font-smoothing: antialiased 
}

</style>
