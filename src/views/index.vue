<template>
    <div class="index">
        <!-- 跑马灯  -->
        <div >   
            <el-carousel :interval="4000" type="card"  height="zmdHeight + 'px'">
                <el-carousel-item v-for="item in imgList" :key="item.id">
                     <img :src="item.idView" class="image">
                </el-carousel-item>
            </el-carousel>
        </div>
        <div>
         <div class="aline"></div>
          <span class="title">神奇动物在哪里？</span>
          <div  class="title2">————网站介绍</div>
            <div >
              <div>
                <h5>本网站是为了各位神话生物爱好者了解世界各地神话中的生物而建立。<br>神话生物瑰丽而奇特，<br>有的包含了远古人们对于自然的畏惧，各种情绪的化身，<br>它们往往具有奇特的外形，稀奇古怪的能力。
                <br>我们无法妄言他们是否真实存在，<br>谨在此将各位先民口述笔录下的各种“怪物”整理成册。<br>毕竟，先人智慧我们要妥善保存。<br>最后，也请各位大拿为本网站不足，提供意见。我们将积极修改完善。</h5>
              </div>
              <div  class="mail">
             <h3> 我们的邮箱:  
              <el-button type="info" icon="el-icon-message" circle></el-button>
              892045972@qq.com
              </h3>
              </div>
              </div>
      <!-- <el-row>
          <el-col :span="12" >
              <el-input type="textarea" v-model="content" :autosize="{ minRows: 20, maxRows: 80}" placeholder="请输入内容" >
              </el-input>
          </el-col>
          <el-col :span="12" >
              <div id="show-content" class="text-left">

              </div>
          </el-col>
      </el-row> -->
  </div>
            <div class="block">
            <el-image :src="QRcodeSrc">
              <div slot="error" class="image-slot">
                <i class="el-icon-picture-outline"></i>
              </div>
            </el-image>
          </div>
</div>
</template>

<script>
import axios from 'axios';
export default {
    name: 'index',
    data(){
        return {
            imgList: [
                {id:0,idView:'./static/image/monster/dog.jpg'},
                {id:1,idView:'./static/image/monster/lion.jpg'},
                {id:2,idView:'./static/image/monster/snake.jpg'},
                {id:3,idView:'./static/image/monster/tree.jpg'}            
            ],
            QRcodeSrc: '/api/makeWxCode'
            // content: '测试',
            // converter: null

        };
        },
    // watch:{
    //      content: 'contentChanged'
    // },
    methods: { 
      // init(){
      //       var showdown  = require('showdown');
      //       var converter = new showdown.Converter();
      //       this.converter = converter;
      //   },
      // contentChanged(){ 
      //      this.init();
      //      var html = this.converter.makeHtml(this.content);
      //      document.getElementById('show-content').innerHTML = html;
      //   },
      setSize:function () {
                // 通过浏览器宽度(图片宽度)计算高度
                this.bannerHeight = 400 / 1920 * this.screenWidth;
              },
      //获取二维码        
      getQRcode:function () {
              var appId ="";
              var secret ="ceshi";
              this.QRcodeSrc="/api/makeWxCode?appId="+appId+"&secret="+secret;
              }                               
            },
       mounted() {
          // 首次加载时,需要调用一次
          this.screenWidth =  window.innerWidth;
          this.setSize();
          // 窗口大小发生改变时,调用一次
          window.onresize = () =>{
          this.screenWidth =  window.innerWidth;
          this.setSize();
            }
            },
    created () {
    //调用生成二维码
    this.getQRcode();
    }
};
</script>
<style>
  .index{
    text-align: center;
    margin-left: 142px;
    width: 80.5%;
    background-color: #fbfcff
    
  }
  .el-carousel__item h3 {
    font-size: 14px;
    opacity: 0.75;
    line-height: 200px;
    margin: 0;
  } 
.aline {
    background-color:#E6E3E3;
    height:1px;
}
.title{
    font-size: 51px;
    color: #fafafa;  
    letter-spacing: 0;  
    text-shadow: 0px 1px 0px #999, 0px 2px 0px #888, 0px 3px 0px #777, 0px 4px 0px #666, 0px 5px 0px #555, 0px 6px 0px #444, 0px 7px 0px #333, 0px 8px 7px #001135;  

}
.title2{
    font-size: 22px;
    font-weight: bold;
    text-align: center;
    margin-left: 300px;
}
.mail{
    height: 200px;
}

</style>