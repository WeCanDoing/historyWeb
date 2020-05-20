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
          <div>龙王鲸（学名：Basilosaurus，意为帝王蜥蜴），又名械齿鲸(Zeuglodon)，已经灭绝的古代海洋哺乳动物，现代鲸的近亲，是鲸类中的一种，生存于3900万至3400万年前的始新世晚期。 龙王鲸刚开始被误认为是巨大的海洋爬虫类的化石，所以被命名为帝王蜥蜴。它最早是在美国路易斯安那州被发现的，随后古生物学家从埃及与巴基斯坦发现的化石中辨认出至少存在两个其他的种。 龙王鲸最大身长为18米，体重20吨，甚至可达21米，不过那个只是疑似龙王鲸。而且拥有比现代鲸更为修长的身体。古生物学家对于它们已经退化的短小后肢非常感兴趣，因为它可以证明现代鲸鱼原先是由陆生哺乳类动物演化而来。龙王鲸也是密西西比州与阿拉巴马州的州化石。
            龙王鲸，又称帝王蜥蜴、械齿鲸，是龙王鲸科中的一个属，被认为是现代鲸的祖先，约生活于晚始新世4500万-3600万年前，现已灭绝。目前科学研究发现它的天敌可能是鲨鱼类的鼠白鲨。龙王鲸为肉食性动物，体长(length)约为15~18米。
械齿鲸是人们已知的原始鲸类之一，它是由陆地动物进化而来的，随后它又进一步进化为两种现代的鲸类。虽然属于鲸鱼的一种，但是械齿鲸的外貌特征却和巨大的海蛇相似，当它首次被发现时，古生物学家还曾经把它当成是爬行动物.
龙王鲸生活在4000万年前~3400万年前，并以捕食其他鲸鱼为食。事实上，正是通过分析另一种史前鲸鱼——矛齿鲸伤痕累累的颅骨，科学家才得以评估龙王鲸的咬合力。研究人员基于矛齿鲸头骨的损伤程度，计算出这种水生捕食者可以摧毁一个超过1600公斤重的头颅 [1]
          </div>
        </div>
    </div>
</template>

<script>
export default {
    name: 'index',
    data(){
        return {
            imgList: [
                {id:0,idView:'./static/image/monster/dog.jpg'},
                {id:1,idView:'./static/image/monster/lion.jpg'},
                {id:2,idView:'./static/image/monster/snake.jpg'},
                {id:3,idView:'./static/image/monster/tree.jpg'}            
            ]
        };
        },
    methods: { 
      setSize:function () {
                // 通过浏览器宽度(图片宽度)计算高度
                this.bannerHeight = 400 / 1920 * this.screenWidth;
              },
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
    }
}
</script>
<style>
  .index{
    width: 80%;
    text-align: center;
    margin-left: 142px;
    width: 80.6%;
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

</style>