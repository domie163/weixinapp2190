<template>
  <div class="addEdit-block">
    <el-form
      class="detail-form-content"
      ref="ruleForm"
      :model="ruleForm"
      :rules="rules"
      label-width="80px"
	  :style="{backgroundColor:addEditForm.addEditBoxColor}"
    >
      <el-row >
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="寝室号" prop="qinshihao">
          <el-input v-model="ruleForm.qinshihao" 
              placeholder="寝室号" clearable  :readonly="ro.qinshihao"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="寝室号" prop="qinshihao">
              <el-input v-model="ruleForm.qinshihao" 
                placeholder="寝室号" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="24">  
        <el-form-item class="upload" v-if="type!='info' && !ro.sushetupian" label="宿舍图片" prop="sushetupian">
          <file-upload
          tip="点击上传宿舍图片"
          action="file/upload"
          :limit="3"
          :multiple="true"
          :fileUrls="ruleForm.sushetupian?ruleForm.sushetupian:''"
          @change="sushetupianUploadChange"
          ></file-upload>
        </el-form-item>
        <div v-else>
          <el-form-item v-if="ruleForm.sushetupian" label="宿舍图片" prop="sushetupian">
            <img style="margin-right:20px;" v-bind:key="index" v-for="(item,index) in ruleForm.sushetupian.split(',')" :src="$base.url+item" width="100" height="100">
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="select" v-if="type!='info'"  label="卫生制度" prop="weishengzhidu">
          <el-select :disabled="ro.weishengzhidu" v-model="ruleForm.weishengzhidu" placeholder="请选择卫生制度">
            <el-option
                v-for="(item,index) in weishengzhiduOptions"
                v-bind:key="index"
                :label="item"
                :value="item">
            </el-option>
          </el-select>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="卫生制度" prop="weishengzhidu">
	      <el-input v-model="ruleForm.weishengzhidu"
                placeholder="卫生制度" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="select" v-if="type!='info'"  label="物品摆放" prop="wupinbaifang">
          <el-select :disabled="ro.wupinbaifang" v-model="ruleForm.wupinbaifang" placeholder="请选择物品摆放">
            <el-option
                v-for="(item,index) in wupinbaifangOptions"
                v-bind:key="index"
                :label="item"
                :value="item">
            </el-option>
          </el-select>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="物品摆放" prop="wupinbaifang">
	      <el-input v-model="ruleForm.wupinbaifang"
                placeholder="物品摆放" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="select" v-if="type!='info'"  label="地面卫生" prop="dimianweisheng">
          <el-select :disabled="ro.dimianweisheng" v-model="ruleForm.dimianweisheng" placeholder="请选择地面卫生">
            <el-option
                v-for="(item,index) in dimianweishengOptions"
                v-bind:key="index"
                :label="item"
                :value="item">
            </el-option>
          </el-select>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="地面卫生" prop="dimianweisheng">
	      <el-input v-model="ruleForm.dimianweisheng"
                placeholder="地面卫生" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="select" v-if="type!='info'"  label="床面评分" prop="chuangmianpingfen">
          <el-select :disabled="ro.chuangmianpingfen" v-model="ruleForm.chuangmianpingfen" placeholder="请选择床面评分">
            <el-option
                v-for="(item,index) in chuangmianpingfenOptions"
                v-bind:key="index"
                :label="item"
                :value="item">
            </el-option>
          </el-select>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="床面评分" prop="chuangmianpingfen">
	      <el-input v-model="ruleForm.chuangmianpingfen"
                placeholder="床面评分" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="select" v-if="type!='info'"  label="墙面评分" prop="qiangmianpingfen">
          <el-select :disabled="ro.qiangmianpingfen" v-model="ruleForm.qiangmianpingfen" placeholder="请选择墙面评分">
            <el-option
                v-for="(item,index) in qiangmianpingfenOptions"
                v-bind:key="index"
                :label="item"
                :value="item">
            </el-option>
          </el-select>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="墙面评分" prop="qiangmianpingfen">
	      <el-input v-model="ruleForm.qiangmianpingfen"
                placeholder="墙面评分" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="select" v-if="type!='info'"  label="内务评分" prop="neiwupingfen">
          <el-select :disabled="ro.neiwupingfen" v-model="ruleForm.neiwupingfen" placeholder="请选择内务评分">
            <el-option
                v-for="(item,index) in neiwupingfenOptions"
                v-bind:key="index"
                :label="item"
                :value="item">
            </el-option>
          </el-select>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="内务评分" prop="neiwupingfen">
	      <el-input v-model="ruleForm.neiwupingfen"
                placeholder="内务评分" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="select" v-if="type!='info'"  label="窗户评分" prop="chuanghupingfen">
          <el-select :disabled="ro.chuanghupingfen" v-model="ruleForm.chuanghupingfen" placeholder="请选择窗户评分">
            <el-option
                v-for="(item,index) in chuanghupingfenOptions"
                v-bind:key="index"
                :label="item"
                :value="item">
            </el-option>
          </el-select>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="窗户评分" prop="chuanghupingfen">
	      <el-input v-model="ruleForm.chuanghupingfen"
                placeholder="窗户评分" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="select" v-if="type!='info'"  label="桌凳评分" prop="zhuodengpingfen">
          <el-select :disabled="ro.zhuodengpingfen" v-model="ruleForm.zhuodengpingfen" placeholder="请选择桌凳评分">
            <el-option
                v-for="(item,index) in zhuodengpingfenOptions"
                v-bind:key="index"
                :label="item"
                :value="item">
            </el-option>
          </el-select>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="桌凳评分" prop="zhuodengpingfen">
	      <el-input v-model="ruleForm.zhuodengpingfen"
                placeholder="桌凳评分" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="整体效果" prop="zhengtixiaoguo">
          <el-input v-model="ruleForm.zhengtixiaoguo" 
              placeholder="整体效果" clearable  :readonly="ro.zhengtixiaoguo"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="整体效果" prop="zhengtixiaoguo">
              <el-input v-model="ruleForm.zhengtixiaoguo" 
                placeholder="整体效果" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="select" v-if="type!='info'"  label="评选结果" prop="pingxuanjieguo">
          <el-select :disabled="ro.pingxuanjieguo" v-model="ruleForm.pingxuanjieguo" placeholder="请选择评选结果">
            <el-option
                v-for="(item,index) in pingxuanjieguoOptions"
                v-bind:key="index"
                :label="item"
                :value="item">
            </el-option>
          </el-select>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="评选结果" prop="pingxuanjieguo">
	      <el-input v-model="ruleForm.pingxuanjieguo"
                placeholder="评选结果" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="date" v-if="type!='info'" label="检查日期" prop="jianchariqi">
            <el-date-picker
                format="yyyy 年 MM 月 dd 日"
                value-format="yyyy-MM-dd"
                v-model="ruleForm.jianchariqi" 
                type="date"
                :readonly="ro.jianchariqi"
                placeholder="检查日期">
            </el-date-picker> 
        </el-form-item>
        <div v-else>
          <el-form-item class="input" v-if="ruleForm.jianchariqi" label="检查日期" prop="jianchariqi">
              <el-input v-model="ruleForm.jianchariqi" 
                placeholder="检查日期" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      </el-row>
      <el-form-item class="btn">
        <el-button  v-if="type!='info'" type="primary" class="btn-success" @click="onSubmit">提交</el-button>
        <el-button v-if="type!='info'" class="btn-close" @click="back()">取消</el-button>
        <el-button v-if="type=='info'" class="btn-close" @click="back()">返回</el-button>
      </el-form-item>
    </el-form>
    

  </div>
</template>
<script>
// 数字，邮件，手机，url，身份证校验
import { isNumber,isIntNumer,isEmail,isPhone, isMobile,isURL,checkIdCard } from "@/utils/validate";
export default {
  data() {
    let self = this
    var validateIdCard = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!checkIdCard(value)) {
        callback(new Error("请输入正确的身份证号码"));
      } else {
        callback();
      }
    };
    var validateUrl = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!isURL(value)) {
        callback(new Error("请输入正确的URL地址"));
      } else {
        callback();
      }
    };
    var validateMobile = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!isMobile(value)) {
        callback(new Error("请输入正确的手机号码"));
      } else {
        callback();
      }
    };
    var validatePhone = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!isPhone(value)) {
        callback(new Error("请输入正确的电话号码"));
      } else {
        callback();
      }
    };
    var validateEmail = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!isEmail(value)) {
        callback(new Error("请输入正确的邮箱地址"));
      } else {
        callback();
      }
    };
    var validateNumber = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!isNumber(value)) {
        callback(new Error("请输入数字"));
      } else {
        callback();
      }
    };
    var validateIntNumber = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!isIntNumer(value)) {
        callback(new Error("请输入整数"));
      } else {
        callback();
      }
    };
    return {
	  addEditForm: {"btnSaveFontColor":"#fff","selectFontSize":"14px","btnCancelBorderColor":"rgba(255, 255, 255, 1)","inputBorderRadius":"4px","inputFontSize":"14px","textareaBgColor":"#fff","btnSaveFontSize":"14px","textareaBorderRadius":"4px","uploadBgColor":"#fff","textareaBorderStyle":"solid","btnCancelWidth":"88px","textareaHeight":"120px","dateBgColor":"#fff","btnSaveBorderRadius":"30px 0 0 0 ","uploadLableFontSize":"14px","textareaBorderWidth":"1px","inputLableColor":"rgba(48, 208, 182, 1)","addEditBoxColor":"rgba(255, 255, 255, 0)","dateIconFontSize":"14px","btnSaveBgColor":"rgba(48, 208, 182, 1)","uploadIconFontColor":"rgba(48, 208, 182, 1)","textareaBorderColor":"rgba(48, 208, 182, 1)","btnCancelBgColor":"rgba(170, 170, 170, 1)","selectLableColor":"rgba(48, 208, 182, 1)","btnSaveBorderStyle":"double","dateBorderWidth":"1px","dateLableFontSize":"14px","dateBorderRadius":"4px","btnCancelBorderStyle":"double","selectLableFontSize":"14px","selectBorderStyle":"solid","selectIconFontColor":"rgba(48, 208, 182, 1)","btnCancelHeight":"44px","inputHeight":"40px","btnCancelFontColor":"rgba(255, 255, 255, 1)","dateBorderColor":"rgba(48, 208, 182, 1)","dateIconFontColor":"rgba(48, 208, 182, 1)","uploadBorderStyle":"solid","dateBorderStyle":"solid","dateLableColor":"rgba(48, 208, 182, 1)","dateFontSize":"14px","inputBorderWidth":"1px","uploadIconFontSize":"28px","selectHeight":"40px","inputFontColor":"#606266","uploadHeight":"148px","textareaLableColor":"rgba(48, 208, 182, 1)","textareaLableFontSize":"14px","btnCancelFontSize":"14px","inputBorderStyle":"solid","btnCancelBorderRadius":"30px 0 0 0 ","inputBgColor":"rgba(255, 255, 255, 1)","inputLableFontSize":"14px","uploadLableColor":"rgba(48, 208, 182, 1)","uploadBorderRadius":"4px","btnSaveHeight":"44px","selectBgColor":"#fff","btnSaveWidth":"88px","selectIconFontSize":"14px","dateHeight":"40px","selectBorderColor":"rgba(48, 208, 182, 1)","inputBorderColor":"rgba(48, 208, 182, 1)","uploadBorderColor":"rgba(48, 208, 182, 1)","textareaFontColor":"#606266","selectBorderWidth":"1px","dateFontColor":"#606266","btnCancelBorderWidth":"5px","uploadBorderWidth":"1px","textareaFontSize":"14px","selectBorderRadius":"4px","selectFontColor":"#606266","btnSaveBorderColor":"rgba(255, 255, 255, 1)","btnSaveBorderWidth":"5px"},
      id: '',
      type: '',
      ro:{
	qinshihao : false,
	sushetupian : false,
	weishengzhidu : false,
	wupinbaifang : false,
	dimianweisheng : false,
	chuangmianpingfen : false,
	qiangmianpingfen : false,
	neiwupingfen : false,
	chuanghupingfen : false,
	zhuodengpingfen : false,
	zhengtixiaoguo : false,
	pingxuanjieguo : false,
	jianchariqi : false,
      },
      ruleForm: {
        qinshihao: '',
        sushetupian: '',
        weishengzhidu: '',
        wupinbaifang: '',
        dimianweisheng: '',
        chuangmianpingfen: '',
        qiangmianpingfen: '',
        neiwupingfen: '',
        chuanghupingfen: '',
        zhuodengpingfen: '',
        zhengtixiaoguo: '',
        pingxuanjieguo: '',
        jianchariqi: '',
      },
          weishengzhiduOptions: [],
          wupinbaifangOptions: [],
          dimianweishengOptions: [],
          chuangmianpingfenOptions: [],
          qiangmianpingfenOptions: [],
          neiwupingfenOptions: [],
          chuanghupingfenOptions: [],
          zhuodengpingfenOptions: [],
          pingxuanjieguoOptions: [],
      rules: {
          qinshihao: [
          ],
          sushetupian: [
          ],
          weishengzhidu: [
          ],
          wupinbaifang: [
          ],
          dimianweisheng: [
          ],
          chuangmianpingfen: [
          ],
          qiangmianpingfen: [
          ],
          neiwupingfen: [
          ],
          chuanghupingfen: [
          ],
          zhuodengpingfen: [
          ],
          zhengtixiaoguo: [
          ],
          pingxuanjieguo: [
          ],
          jianchariqi: [
          ],
      }
    };
  },
  props: ["parent"],
  computed: {
  },
  created() {
	this.ruleForm.jianchariqi = this.getCurDate()
	this.addEditStyleChange()
	this.addEditUploadStyleChange()
  },
  methods: {
    // 下载
    download(file){
      window.open(`${file}`)
    },
    // 初始化
    init(id,type) {
      if (id) {
        this.id = id;
        this.type = type;
      }
      if(this.type=='info'||this.type=='else'){
        this.info(id);
      }else if(this.type=='logistics'){
        this.logistics=false;
        this.info(id);
      }else if(this.type=='cross'){
        var obj = this.$storage.getObj('crossObj');
        for (var o in obj){
          if(o=='qinshihao'){
            this.ruleForm.qinshihao = obj[o];
	    this.ro.qinshihao = true;
            continue;
          }
          if(o=='sushetupian'){
            this.ruleForm.sushetupian = obj[o];
	    this.ro.sushetupian = true;
            continue;
          }
          if(o=='weishengzhidu'){
            this.ruleForm.weishengzhidu = obj[o];
	    this.ro.weishengzhidu = true;
            continue;
          }
          if(o=='wupinbaifang'){
            this.ruleForm.wupinbaifang = obj[o];
	    this.ro.wupinbaifang = true;
            continue;
          }
          if(o=='dimianweisheng'){
            this.ruleForm.dimianweisheng = obj[o];
	    this.ro.dimianweisheng = true;
            continue;
          }
          if(o=='chuangmianpingfen'){
            this.ruleForm.chuangmianpingfen = obj[o];
	    this.ro.chuangmianpingfen = true;
            continue;
          }
          if(o=='qiangmianpingfen'){
            this.ruleForm.qiangmianpingfen = obj[o];
	    this.ro.qiangmianpingfen = true;
            continue;
          }
          if(o=='neiwupingfen'){
            this.ruleForm.neiwupingfen = obj[o];
	    this.ro.neiwupingfen = true;
            continue;
          }
          if(o=='chuanghupingfen'){
            this.ruleForm.chuanghupingfen = obj[o];
	    this.ro.chuanghupingfen = true;
            continue;
          }
          if(o=='zhuodengpingfen'){
            this.ruleForm.zhuodengpingfen = obj[o];
	    this.ro.zhuodengpingfen = true;
            continue;
          }
          if(o=='zhengtixiaoguo'){
            this.ruleForm.zhengtixiaoguo = obj[o];
	    this.ro.zhengtixiaoguo = true;
            continue;
          }
          if(o=='pingxuanjieguo'){
            this.ruleForm.pingxuanjieguo = obj[o];
	    this.ro.pingxuanjieguo = true;
            continue;
          }
          if(o=='jianchariqi'){
            this.ruleForm.jianchariqi = obj[o];
	    this.ro.jianchariqi = true;
            continue;
          }
        }
      }
      // 获取用户信息
      this.$http({
        url: `${this.$storage.get('sessionTable')}/session`,
        method: "get"
      }).then(({ data }) => {
        if (data && data.code === 0) {
          var json = data.data;
        } else {
          this.$message.error(data.msg);
        }
      });
            this.weishengzhiduOptions = "0,1,2,3,4,5".split(',')
            this.wupinbaifangOptions = "0,1,2,3,4,5".split(',')
            this.dimianweishengOptions = "0,1,2,3,4,5".split(',')
            this.chuangmianpingfenOptions = "0,1,2,3,4,5".split(',')
            this.qiangmianpingfenOptions = "0,1,2,3,4,5".split(',')
            this.neiwupingfenOptions = "0,1,2,3,4,5".split(',')
            this.chuanghupingfenOptions = "0,1,2,3,4,5".split(',')
            this.zhuodengpingfenOptions = "0,1,2,3,4,5".split(',')
            this.pingxuanjieguoOptions = "优秀,良好,不合格".split(',')
    },
    // 多级联动参数
    info(id) {
      this.$http({
        url: `weishengpingbi/info/${id}`,
        method: "get"
      }).then(({ data }) => {
        if (data && data.code === 0) {
        this.ruleForm = data.data;
	//解决前台上传图片后台不显示的问题
	let reg=new RegExp('../../../upload','g')//g代表全部
        } else {
          this.$message.error(data.msg);
        }
      });
    },


    // 提交
    onSubmit() {




	if(this.ruleForm.sushetupian!=null) {
		this.ruleForm.sushetupian = this.ruleForm.sushetupian.replace(new RegExp(this.$base.url,"g"),"");
	}























var objcross = this.$storage.getObj('crossObj');

      //更新跨表属性
       var crossuserid;
       var crossrefid;
       var crossoptnum;
       if(this.type=='cross'){
                var statusColumnName = this.$storage.get('statusColumnName');
                var statusColumnValue = this.$storage.get('statusColumnValue');
                if(statusColumnName!='') {
                        var obj = this.$storage.getObj('crossObj');
                       if(!statusColumnName.startsWith("[")) {
                               for (var o in obj){
                                 if(o==statusColumnName){
                                   obj[o] = statusColumnValue;
                                 }
                               }
                               var table = this.$storage.get('crossTable');
                             this.$http({
                                 url: `${table}/update`,
                                 method: "post",
                                 data: obj
                               }).then(({ data }) => {});
                       } else {
                               crossuserid=this.$storage.get('userid');
                               crossrefid=obj['id'];
                               crossoptnum=this.$storage.get('statusColumnName');
                               crossoptnum=crossoptnum.replace(/\[/,"").replace(/\]/,"");
                        }
                }
        }
       this.$refs["ruleForm"].validate(valid => {
         if (valid) {
		 if(crossrefid && crossuserid) {
			 this.ruleForm.crossuserid = crossuserid;
			 this.ruleForm.crossrefid = crossrefid;
			let params = { 
				page: 1, 
				limit: 10, 
				crossuserid:this.ruleForm.crossuserid,
				crossrefid:this.ruleForm.crossrefid,
			} 
			this.$http({ 
				url: "weishengpingbi/page", 
				method: "get", 
				params: params 
			}).then(({ 
				data 
			}) => { 
				if (data && data.code === 0) { 
				       if(data.data.total>=crossoptnum) {
					     this.$message.error(this.$storage.get('tips'));
					       return false;
				       } else {
					 this.$http({
					   url: `weishengpingbi/${!this.ruleForm.id ? "save" : "update"}`,
					   method: "post",
					   data: this.ruleForm
					 }).then(({ data }) => {
					   if (data && data.code === 0) {
					     this.$message({
					       message: "操作成功",
					       type: "success",
					       duration: 1500,
					       onClose: () => {
						 this.parent.showFlag = true;
						 this.parent.addOrUpdateFlag = false;
						 this.parent.weishengpingbiCrossAddOrUpdateFlag = false;
						 this.parent.search();
						 this.parent.contentStyleChange();
					       }
					     });
					   } else {
					     this.$message.error(data.msg);
					   }
					 });

				       }
				} else { 
				} 
			});
		 } else {
			 this.$http({
			   url: `weishengpingbi/${!this.ruleForm.id ? "save" : "update"}`,
			   method: "post",
			   data: this.ruleForm
			 }).then(({ data }) => {
			   if (data && data.code === 0) {
			     this.$message({
			       message: "操作成功",
			       type: "success",
			       duration: 1500,
			       onClose: () => {
				 this.parent.showFlag = true;
				 this.parent.addOrUpdateFlag = false;
				 this.parent.weishengpingbiCrossAddOrUpdateFlag = false;
				 this.parent.search();
				 this.parent.contentStyleChange();
			       }
			     });
			   } else {
			     this.$message.error(data.msg);
			   }
			 });
		 }
         }
       });
    },
    // 获取uuid
    getUUID () {
      return new Date().getTime();
    },
    // 返回
    back() {
      this.parent.showFlag = true;
      this.parent.addOrUpdateFlag = false;
      this.parent.weishengpingbiCrossAddOrUpdateFlag = false;
      this.parent.contentStyleChange();
    },
    sushetupianUploadChange(fileUrls) {
	this.ruleForm.sushetupian = fileUrls;
	this.addEditUploadStyleChange()
    },
	addEditStyleChange() {
	  this.$nextTick(()=>{
	    // input
	    document.querySelectorAll('.addEdit-block .input .el-input__inner').forEach(el=>{
	      el.style.height = this.addEditForm.inputHeight
	      el.style.color = this.addEditForm.inputFontColor
	      el.style.fontSize = this.addEditForm.inputFontSize
	      el.style.borderWidth = this.addEditForm.inputBorderWidth
	      el.style.borderStyle = this.addEditForm.inputBorderStyle
	      el.style.borderColor = this.addEditForm.inputBorderColor
	      el.style.borderRadius = this.addEditForm.inputBorderRadius
	      el.style.backgroundColor = this.addEditForm.inputBgColor
	    })
	    document.querySelectorAll('.addEdit-block .input .el-form-item__label').forEach(el=>{
	      el.style.lineHeight = this.addEditForm.inputHeight
	      el.style.color = this.addEditForm.inputLableColor
	      el.style.fontSize = this.addEditForm.inputLableFontSize
	    })
	    // select
	    document.querySelectorAll('.addEdit-block .select .el-input__inner').forEach(el=>{
	      el.style.height = this.addEditForm.selectHeight
	      el.style.color = this.addEditForm.selectFontColor
	      el.style.fontSize = this.addEditForm.selectFontSize
	      el.style.borderWidth = this.addEditForm.selectBorderWidth
	      el.style.borderStyle = this.addEditForm.selectBorderStyle
	      el.style.borderColor = this.addEditForm.selectBorderColor
	      el.style.borderRadius = this.addEditForm.selectBorderRadius
	      el.style.backgroundColor = this.addEditForm.selectBgColor
	    })
	    document.querySelectorAll('.addEdit-block .select .el-form-item__label').forEach(el=>{
	      el.style.lineHeight = this.addEditForm.selectHeight
	      el.style.color = this.addEditForm.selectLableColor
	      el.style.fontSize = this.addEditForm.selectLableFontSize
	    })
	    document.querySelectorAll('.addEdit-block .select .el-select__caret').forEach(el=>{
	      el.style.color = this.addEditForm.selectIconFontColor
	      el.style.fontSize = this.addEditForm.selectIconFontSize
	    })
	    // date
	    document.querySelectorAll('.addEdit-block .date .el-input__inner').forEach(el=>{
	      el.style.height = this.addEditForm.dateHeight
	      el.style.color = this.addEditForm.dateFontColor
	      el.style.fontSize = this.addEditForm.dateFontSize
	      el.style.borderWidth = this.addEditForm.dateBorderWidth
	      el.style.borderStyle = this.addEditForm.dateBorderStyle
	      el.style.borderColor = this.addEditForm.dateBorderColor
	      el.style.borderRadius = this.addEditForm.dateBorderRadius
	      el.style.backgroundColor = this.addEditForm.dateBgColor
	    })
	    document.querySelectorAll('.addEdit-block .date .el-form-item__label').forEach(el=>{
	      el.style.lineHeight = this.addEditForm.dateHeight
	      el.style.color = this.addEditForm.dateLableColor
	      el.style.fontSize = this.addEditForm.dateLableFontSize
	    })
	    document.querySelectorAll('.addEdit-block .date .el-input__icon').forEach(el=>{
	      el.style.color = this.addEditForm.dateIconFontColor
	      el.style.fontSize = this.addEditForm.dateIconFontSize
	      el.style.lineHeight = this.addEditForm.dateHeight
	    })
	    // upload
	    let iconLineHeight = parseInt(this.addEditForm.uploadHeight) - parseInt(this.addEditForm.uploadBorderWidth) * 2 + 'px'
	    document.querySelectorAll('.addEdit-block .upload .el-upload--picture-card').forEach(el=>{
	      el.style.width = this.addEditForm.uploadHeight
	      el.style.height = this.addEditForm.uploadHeight
	      el.style.borderWidth = this.addEditForm.uploadBorderWidth
	      el.style.borderStyle = this.addEditForm.uploadBorderStyle
	      el.style.borderColor = this.addEditForm.uploadBorderColor
	      el.style.borderRadius = this.addEditForm.uploadBorderRadius
	      el.style.backgroundColor = this.addEditForm.uploadBgColor
	    })
	    document.querySelectorAll('.addEdit-block .upload .el-form-item__label').forEach(el=>{
	      el.style.lineHeight = this.addEditForm.uploadHeight
	      el.style.color = this.addEditForm.uploadLableColor
	      el.style.fontSize = this.addEditForm.uploadLableFontSize
	    })
	    document.querySelectorAll('.addEdit-block .upload .el-icon-plus').forEach(el=>{
	      el.style.color = this.addEditForm.uploadIconFontColor
	      el.style.fontSize = this.addEditForm.uploadIconFontSize
	      el.style.lineHeight = iconLineHeight
	      el.style.display = 'block'
	    })
	    // 多文本输入框
	    document.querySelectorAll('.addEdit-block .textarea .el-textarea__inner').forEach(el=>{
	      el.style.height = this.addEditForm.textareaHeight
	      el.style.color = this.addEditForm.textareaFontColor
	      el.style.fontSize = this.addEditForm.textareaFontSize
	      el.style.borderWidth = this.addEditForm.textareaBorderWidth
	      el.style.borderStyle = this.addEditForm.textareaBorderStyle
	      el.style.borderColor = this.addEditForm.textareaBorderColor
	      el.style.borderRadius = this.addEditForm.textareaBorderRadius
	      el.style.backgroundColor = this.addEditForm.textareaBgColor
	    })
	    document.querySelectorAll('.addEdit-block .textarea .el-form-item__label').forEach(el=>{
	      // el.style.lineHeight = this.addEditForm.textareaHeight
	      el.style.color = this.addEditForm.textareaLableColor
	      el.style.fontSize = this.addEditForm.textareaLableFontSize
	    })
	    // 保存
	    document.querySelectorAll('.addEdit-block .btn .btn-success').forEach(el=>{
	      el.style.width = this.addEditForm.btnSaveWidth
	      el.style.height = this.addEditForm.btnSaveHeight
	      el.style.color = this.addEditForm.btnSaveFontColor
	      el.style.fontSize = this.addEditForm.btnSaveFontSize
	      el.style.borderWidth = this.addEditForm.btnSaveBorderWidth
	      el.style.borderStyle = this.addEditForm.btnSaveBorderStyle
	      el.style.borderColor = this.addEditForm.btnSaveBorderColor
	      el.style.borderRadius = this.addEditForm.btnSaveBorderRadius
	      el.style.backgroundColor = this.addEditForm.btnSaveBgColor
	    })
	    // 返回
	    document.querySelectorAll('.addEdit-block .btn .btn-close').forEach(el=>{
	      el.style.width = this.addEditForm.btnCancelWidth
	      el.style.height = this.addEditForm.btnCancelHeight
	      el.style.color = this.addEditForm.btnCancelFontColor
	      el.style.fontSize = this.addEditForm.btnCancelFontSize
	      el.style.borderWidth = this.addEditForm.btnCancelBorderWidth
	      el.style.borderStyle = this.addEditForm.btnCancelBorderStyle
	      el.style.borderColor = this.addEditForm.btnCancelBorderColor
	      el.style.borderRadius = this.addEditForm.btnCancelBorderRadius
	      el.style.backgroundColor = this.addEditForm.btnCancelBgColor
	    })
	  })
	},
	addEditUploadStyleChange() {
		this.$nextTick(()=>{
		  document.querySelectorAll('.addEdit-block .upload .el-upload-list--picture-card .el-upload-list__item').forEach(el=>{
			el.style.width = this.addEditForm.uploadHeight
			el.style.height = this.addEditForm.uploadHeight
			el.style.borderWidth = this.addEditForm.uploadBorderWidth
			el.style.borderStyle = this.addEditForm.uploadBorderStyle
			el.style.borderColor = this.addEditForm.uploadBorderColor
			el.style.borderRadius = this.addEditForm.uploadBorderRadius
			el.style.backgroundColor = this.addEditForm.uploadBgColor
		  })
	  })
	},
  }
};
</script>
<style lang="scss">
.editor{
  height: 500px;
  
  & /deep/ .ql-container {
	  height: 310px;
  }
}
.amap-wrapper {
  width: 100%;
  height: 500px;
}
.search-box {
  position: absolute;
}
.addEdit-block {
	margin: -10px;
}
.detail-form-content {
	padding: 12px;
	background-color: transparent;
}
.btn .el-button {
  padding: 0;
}
</style>
