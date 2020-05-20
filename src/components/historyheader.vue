<template>
    <div class= "historyheader">
      <el-menu :default-active="activeIndex" class="el-menu-demo" mode="horizontal" @select="handleSelect">
        <el-menu-item index="1">        
          <el-image
            style="margin:10px auto"
            :src="Icon"
            />
        </el-menu-item>
        <el-menu-item index="2">        
          神奇动物在哪里</el-menu-item>
        <el-submenu index="3">
          <template slot="title">中国神话</template>
          <el-menu-item index="3-1">赢</el-menu-item>
          <el-menu-item index="3-2">毛</el-menu-item>
          <el-menu-item index="3-3">鳞</el-menu-item>
          <el-menu-item index="3-4">羽</el-menu-item>
          <el-menu-item index="3-5">昆</el-menu-item>
        </el-submenu>
        <el-menu-item index="4" >北欧神话</el-menu-item>
        <el-menu-item index="5">希腊神话</el-menu-item>
        <el-menu-item index="5">拉美神话</el-menu-item>
        <div class="login">
        <i class="el-icon-user"></i> 登录 
       </div>
        <div class="register">
        <i class="el-icon-s-claim"></i>  注册 
       </div>
      </el-menu>
      <div class="line"></div>
    </div>
</template>
<script>
export default {
name: 'historyheader',
data(){
    return {
        activeIndex: '1',
        Icon: './static/image/timg.png'
    };
    },
methods: {
      handleSelect(key, keyPath) {
        console.log(key, keyPath);
      }    
}
}
</script>
<style>
 .historyheader { 
    bottom:0px;
    width: 80%;
    text-align: center;
    margin-left: 150px;
    
}
 .historyheader .el-menu{
   margin-left: -8px
 }
 .historyheader .login{
   float: left;
    margin-left: 400px;
    margin-top: 20px;
    font-size: 14px;
    color: #909399;
 }
 .historyheader .register{
   float: left;
   margin-left: 20px;
   margin-top: 20px;
   font-size: 14px;
   color: #909399;
 }
</style>
