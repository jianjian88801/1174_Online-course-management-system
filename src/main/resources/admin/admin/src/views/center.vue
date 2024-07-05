<template>
  <div>
    <el-form
      class="detail-form-content"
      ref="ruleForm"
      :model="ruleForm"
      label-width="80px"
    >  
     <el-row>
      <el-col :span="12">
        <el-form-item   v-if="flag=='xueshengyonghu'"  label="学号" prop="xuehao">
          <el-input v-model="ruleForm.xuehao" readonly              placeholder="学号" clearable></el-input>
        </el-form-item>
      </el-col>
      <el-col :span="12">
        <el-form-item   v-if="flag=='xueshengyonghu'"  label="学生姓名" prop="xueshengxingming">
          <el-input v-model="ruleForm.xueshengxingming"               placeholder="学生姓名" clearable></el-input>
        </el-form-item>
      </el-col>
      <el-col :span="12">
        <el-form-item v-if="flag=='xueshengyonghu'"  label="性别" prop="xingbie">
          <el-select v-model="ruleForm.xingbie" placeholder="请选择性别">
            <el-option
                v-for="(item,index) in xueshengyonghuxingbieOptions"
                v-bind:key="index"
                :label="item"
                :value="item">
            </el-option>
          </el-select>
        </el-form-item>
      </el-col>
      <el-col :span="12">
        <el-form-item v-if="flag=='xueshengyonghu'"  label="班级" prop="banji">
          <el-select v-model="ruleForm.banji" placeholder="请选择班级">
            <el-option
                v-for="(item,index) in xueshengyonghubanjiOptions"
                v-bind:key="index"
                :label="item"
                :value="item">
            </el-option>
          </el-select>
        </el-form-item>
      </el-col>
      <el-col :span="12">
        <el-form-item   v-if="flag=='xueshengyonghu'"  label="手机" prop="shouji">
          <el-input v-model="ruleForm.shouji"               placeholder="手机" clearable></el-input>
        </el-form-item>
      </el-col>
      <el-col :span="12">
        <el-form-item   v-if="flag=='xueshengyonghu'"  label="身份证" prop="shenfenzheng">
          <el-input v-model="ruleForm.shenfenzheng"               placeholder="身份证" clearable></el-input>
        </el-form-item>
      </el-col>
      <el-col :span="12">
        <el-form-item   v-if="flag=='jiaoshiyonghu'"  label="教师工号" prop="jiaoshigonghao">
          <el-input v-model="ruleForm.jiaoshigonghao" readonly              placeholder="教师工号" clearable></el-input>
        </el-form-item>
      </el-col>
      <el-col :span="12">
        <el-form-item   v-if="flag=='jiaoshiyonghu'"  label="教师姓名" prop="jiaoshixingming">
          <el-input v-model="ruleForm.jiaoshixingming"               placeholder="教师姓名" clearable></el-input>
        </el-form-item>
      </el-col>
      <el-col :span="12">
        <el-form-item v-if="flag=='jiaoshiyonghu'"  label="性别" prop="xingbie">
          <el-select v-model="ruleForm.xingbie" placeholder="请选择性别">
            <el-option
                v-for="(item,index) in jiaoshiyonghuxingbieOptions"
                v-bind:key="index"
                :label="item"
                :value="item">
            </el-option>
          </el-select>
        </el-form-item>
      </el-col>
      <el-col :span="12">
        <el-form-item v-if="flag=='jiaoshiyonghu'"  label="所教班级" prop="suojiaobanji">
          <el-select v-model="ruleForm.suojiaobanji" placeholder="请选择所教班级">
            <el-option
                v-for="(item,index) in jiaoshiyonghusuojiaobanjiOptions"
                v-bind:key="index"
                :label="item"
                :value="item">
            </el-option>
          </el-select>
        </el-form-item>
      </el-col>
      <el-col :span="12">
        <el-form-item v-if="flag=='jiaoshiyonghu'"  label="所教科目" prop="suojiaokemu">
          <el-select v-model="ruleForm.suojiaokemu" placeholder="请选择所教科目">
            <el-option
                v-for="(item,index) in jiaoshiyonghusuojiaokemuOptions"
                v-bind:key="index"
                :label="item"
                :value="item">
            </el-option>
          </el-select>
        </el-form-item>
      </el-col>
      <el-col :span="12">
        <el-form-item   v-if="flag=='jiaoshiyonghu'"  label="联系电话" prop="lianxidianhua">
          <el-input v-model="ruleForm.lianxidianhua"               placeholder="联系电话" clearable></el-input>
        </el-form-item>
      </el-col>
      <el-col :span="12">
        <el-form-item   v-if="flag=='jiaoshiyonghu'"  label="身份证" prop="shenfenzheng">
          <el-input v-model="ruleForm.shenfenzheng"               placeholder="身份证" clearable></el-input>
        </el-form-item>
      </el-col>
      <el-form-item v-if="flag=='users'" label="用户名" prop="username">
        <el-input v-model="ruleForm.username" 
        placeholder="用户名"></el-input>
      </el-form-item>
      <el-col :span="24">
      <el-form-item>
        <el-button type="primary" @click="onUpdateHandler">修 改</el-button>
      </el-form-item>
      </el-col>
      </el-row>
    </el-form>
  </div>
</template>
<script>
// 数字，邮件，手机，url，身份证校验
import { isNumber,isIntNumer,isEmail,isMobile,isPhone,isURL,checkIdCard } from "@/utils/validate";

export default {
  data() {
    return {
      ruleForm: {},
      flag: '',
      usersFlag: false,
      xueshengyonghuxingbieOptions: [],
      xueshengyonghubanjiOptions: [],
      jiaoshiyonghuxingbieOptions: [],
      jiaoshiyonghusuojiaobanjiOptions: [],
      jiaoshiyonghusuojiaokemuOptions: [],
    };
  },
  mounted() {
    var table = this.$storage.get("sessionTable");
    this.flag = table;
    this.$http({
      url: `${this.$storage.get("sessionTable")}/session`,
      method: "get"
    }).then(({ data }) => {
      if (data && data.code === 0) {
        this.ruleForm = data.data;
      } else {
        this.$message.error(data.msg);
      }
    });
    this.xueshengyonghuxingbieOptions = "男,女".split(',')
    this.$http({
      url: `option/banjifenlei/leixing`,
      method: "get"
    }).then(({ data }) => {
      if (data && data.code === 0) {
        this.xueshengyonghubanjiOptions = data.data;
      } else {
        this.$message.error(data.msg);
      }
    });
    this.jiaoshiyonghuxingbieOptions = "男,女".split(',')
    this.$http({
      url: `option/banjifenlei/leixing`,
      method: "get"
    }).then(({ data }) => {
      if (data && data.code === 0) {
        this.jiaoshiyonghusuojiaobanjiOptions = data.data;
      } else {
        this.$message.error(data.msg);
      }
    });
    this.$http({
      url: `option/kemuleixing/leixing`,
      method: "get"
    }).then(({ data }) => {
      if (data && data.code === 0) {
        this.jiaoshiyonghusuojiaokemuOptions = data.data;
      } else {
        this.$message.error(data.msg);
      }
    });
  },
  methods: {
    onUpdateHandler() {
      if((!this.ruleForm.xuehao)&& 'xueshengyonghu'==this.flag){
        this.$message.error('学号不能为空');
        return
      }
      if((!this.ruleForm.mima)&& 'xueshengyonghu'==this.flag){
        this.$message.error('密码不能为空');
        return
      }
      if((!this.ruleForm.xueshengxingming)&& 'xueshengyonghu'==this.flag){
        this.$message.error('学生姓名不能为空');
        return
      }
      if( 'xueshengyonghu' ==this.flag && this.ruleForm.shouji&&(!isMobile(this.ruleForm.shouji))){
        this.$message.error(`手机应输入手机格式`);
        return
      }
      if( 'xueshengyonghu' ==this.flag && this.ruleForm.shenfenzheng&&(!checkIdCard(this.ruleForm.shenfenzheng))){
        this.$message.error(`身份证应输入身份证格式`);
        return
      }
      if((!this.ruleForm.jiaoshigonghao)&& 'jiaoshiyonghu'==this.flag){
        this.$message.error('教师工号不能为空');
        return
      }
      if((!this.ruleForm.mima)&& 'jiaoshiyonghu'==this.flag){
        this.$message.error('密码不能为空');
        return
      }
      if((!this.ruleForm.jiaoshixingming)&& 'jiaoshiyonghu'==this.flag){
        this.$message.error('教师姓名不能为空');
        return
      }
      if( 'jiaoshiyonghu' ==this.flag && this.ruleForm.lianxidianhua&&(!isMobile(this.ruleForm.lianxidianhua))){
        this.$message.error(`联系电话应输入手机格式`);
        return
      }
      if( 'jiaoshiyonghu' ==this.flag && this.ruleForm.shenfenzheng&&(!checkIdCard(this.ruleForm.shenfenzheng))){
        this.$message.error(`身份证应输入身份证格式`);
        return
      }
      if('users'==this.flag && this.ruleForm.username.trim().length<1) {
	this.$message.error(`用户名不能为空`);
        return	
      }
      this.$http({
        url: `${this.$storage.get("sessionTable")}/update`,
        method: "post",
        data: this.ruleForm
      }).then(({ data }) => {
        if (data && data.code === 0) {
          this.$message({
            message: "修改信息成功",
            type: "success",
            duration: 1500,
            onClose: () => {
            }
          });
        } else {
          this.$message.error(data.msg);
        }
      });
    }
  }
};
</script>
<style lang="scss" scoped>
</style>
