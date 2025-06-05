<template>
	<view class="content">
		<form class="app-update-pv">
			 
			<view :style='{"padding":"0 24rpx","boxShadow":"0 0 0px rgba(0,0,0,.3)","margin":"0 0 20rpx 0","borderColor":"#ccc","backgroundColor":"rgba(255, 255, 255, 1)","borderRadius":"50rpx","borderWidth":"0","width":"100%","borderStyle":"solid","height":"80rpx"}' class="cu-form-group">
				<view :style='{"padding":"0","boxShadow":"0 0 16rpx rgba(0,0,0,0)","margin":"0","borderColor":"#ccc","backgroundColor":"rgba(0,0,0,0)","color":"rgba(161, 161, 161, 1)","textAlign":"left","borderRadius":"0","borderWidth":"0","width":"160rpx","lineHeight":"80rpx","fontSize":"28rpx","borderStyle":"solid"}' class="title">寝室号</view>
				<input :style='{"padding":"0 30rpx","boxShadow":"0 0 0px rgba(0,0,0,.6) inset","margin":"0","borderColor":"rgba(220, 220, 220, 1)","backgroundColor":"rgba(255, 255, 255, 0)","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderRadius":"88rpx","borderWidth":"2rpx","width":"calc(100% - 160rpx)","fontSize":"28rpx","borderStyle":"solid","height":"52rpx"}' :disabled="ro.qinshihao" v-model="ruleForm.qinshihao" placeholder="寝室号"></input>
			</view>
			<view :style='{"padding":"0 24rpx","boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"#ccc","margin":"0 0 20rpx 0","borderRadius":"88rpx","borderWidth":"0","width":"100%","borderStyle":"solid","height":"auto"}' class="cu-form-group" @tap="sushetupianTap">
				<view :style='{"padding":"0","boxShadow":"0 0 16rpx rgba(0,0,0,0)","margin":"0","borderColor":"#ccc","backgroundColor":"rgba(0,0,0,0)","color":"#fff","textAlign":"left","borderRadius":"0","borderWidth":"0","width":"160rpx","lineHeight":"80rpx","fontSize":"28rpx","borderStyle":"solid"}' class="title">宿舍图片</view>
				<view class="right-input" style="padding:0">
					<image :style='{"padding":"0","boxShadow":"0 0 0px rgba(0,0,0,.3)","margin":"12rpx 0","borderColor":"#ccc","backgroundColor":"rgba(0,0,0,0)","borderRadius":"100%","borderWidth":"0","width":"80rpx","borderStyle":"solid","height":"80rpx"}' class="avator" v-if="ruleForm.sushetupian" :src="baseUrl+ruleForm.sushetupian" mode="aspectFill"></image>
					<image :style='{"padding":"0","boxShadow":"0 0 0px rgba(0,0,0,.3)","margin":"12rpx 0","borderColor":"#ccc","backgroundColor":"rgba(0,0,0,0)","borderRadius":"100%","borderWidth":"0","width":"80rpx","borderStyle":"solid","height":"80rpx"}' class="avator" v-else src="../../static/gen/upload.png" mode="aspectFill"></image>
				</view>
			</view>
			<view :style='{"padding":"0 24rpx","boxShadow":"0 0 16rpx rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"#ccc","margin":"0 0 20rpx 0","borderRadius":"50rpx","borderWidth":"0","width":"100%","borderStyle":"solid","height":"80rpx"}' class="cu-form-group select">
				<view :style='{"padding":"0","boxShadow":"0 0 16rpx rgba(0,0,0,0)","margin":"0","borderColor":"#ccc","backgroundColor":"rgba(0,0,0,0)","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderRadius":"0","borderWidth":"0","width":"160rpx","lineHeight":"80rpx","fontSize":"28rpx","borderStyle":"solid"}' class="title">卫生制度</view>
				<picker @change="weishengzhiduChange" :value="weishengzhiduIndex"  :range="weishengzhiduOptions">
					<view :style='{"padding":"0 30rpx","boxShadow":"0 0 0px rgba(0,0,0,.6) inset","margin":"0","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(220, 220, 220, 1)","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderRadius":"16rpx","borderWidth":"2rpx","width":"calc(100% - 240rpx)","lineHeight":"52rpx","fontSize":"28rpx","borderStyle":"solid"}' class="uni-input">{{ruleForm.weishengzhidu?ruleForm.weishengzhidu:"请选择卫生制度"}}</view>
				</picker>
			</view>
			<view :style='{"padding":"0 24rpx","boxShadow":"0 0 16rpx rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"#ccc","margin":"0 0 20rpx 0","borderRadius":"50rpx","borderWidth":"0","width":"100%","borderStyle":"solid","height":"80rpx"}' class="cu-form-group select">
				<view :style='{"padding":"0","boxShadow":"0 0 16rpx rgba(0,0,0,0)","margin":"0","borderColor":"#ccc","backgroundColor":"rgba(0,0,0,0)","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderRadius":"0","borderWidth":"0","width":"160rpx","lineHeight":"80rpx","fontSize":"28rpx","borderStyle":"solid"}' class="title">物品摆放</view>
				<picker @change="wupinbaifangChange" :value="wupinbaifangIndex"  :range="wupinbaifangOptions">
					<view :style='{"padding":"0 30rpx","boxShadow":"0 0 0px rgba(0,0,0,.6) inset","margin":"0","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(220, 220, 220, 1)","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderRadius":"16rpx","borderWidth":"2rpx","width":"calc(100% - 240rpx)","lineHeight":"52rpx","fontSize":"28rpx","borderStyle":"solid"}' class="uni-input">{{ruleForm.wupinbaifang?ruleForm.wupinbaifang:"请选择物品摆放"}}</view>
				</picker>
			</view>
			<view :style='{"padding":"0 24rpx","boxShadow":"0 0 16rpx rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"#ccc","margin":"0 0 20rpx 0","borderRadius":"50rpx","borderWidth":"0","width":"100%","borderStyle":"solid","height":"80rpx"}' class="cu-form-group select">
				<view :style='{"padding":"0","boxShadow":"0 0 16rpx rgba(0,0,0,0)","margin":"0","borderColor":"#ccc","backgroundColor":"rgba(0,0,0,0)","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderRadius":"0","borderWidth":"0","width":"160rpx","lineHeight":"80rpx","fontSize":"28rpx","borderStyle":"solid"}' class="title">地面卫生</view>
				<picker @change="dimianweishengChange" :value="dimianweishengIndex"  :range="dimianweishengOptions">
					<view :style='{"padding":"0 30rpx","boxShadow":"0 0 0px rgba(0,0,0,.6) inset","margin":"0","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(220, 220, 220, 1)","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderRadius":"16rpx","borderWidth":"2rpx","width":"calc(100% - 240rpx)","lineHeight":"52rpx","fontSize":"28rpx","borderStyle":"solid"}' class="uni-input">{{ruleForm.dimianweisheng?ruleForm.dimianweisheng:"请选择地面卫生"}}</view>
				</picker>
			</view>
			<view :style='{"padding":"0 24rpx","boxShadow":"0 0 16rpx rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"#ccc","margin":"0 0 20rpx 0","borderRadius":"50rpx","borderWidth":"0","width":"100%","borderStyle":"solid","height":"80rpx"}' class="cu-form-group select">
				<view :style='{"padding":"0","boxShadow":"0 0 16rpx rgba(0,0,0,0)","margin":"0","borderColor":"#ccc","backgroundColor":"rgba(0,0,0,0)","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderRadius":"0","borderWidth":"0","width":"160rpx","lineHeight":"80rpx","fontSize":"28rpx","borderStyle":"solid"}' class="title">床面评分</view>
				<picker @change="chuangmianpingfenChange" :value="chuangmianpingfenIndex"  :range="chuangmianpingfenOptions">
					<view :style='{"padding":"0 30rpx","boxShadow":"0 0 0px rgba(0,0,0,.6) inset","margin":"0","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(220, 220, 220, 1)","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderRadius":"16rpx","borderWidth":"2rpx","width":"calc(100% - 240rpx)","lineHeight":"52rpx","fontSize":"28rpx","borderStyle":"solid"}' class="uni-input">{{ruleForm.chuangmianpingfen?ruleForm.chuangmianpingfen:"请选择床面评分"}}</view>
				</picker>
			</view>
			<view :style='{"padding":"0 24rpx","boxShadow":"0 0 16rpx rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"#ccc","margin":"0 0 20rpx 0","borderRadius":"50rpx","borderWidth":"0","width":"100%","borderStyle":"solid","height":"80rpx"}' class="cu-form-group select">
				<view :style='{"padding":"0","boxShadow":"0 0 16rpx rgba(0,0,0,0)","margin":"0","borderColor":"#ccc","backgroundColor":"rgba(0,0,0,0)","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderRadius":"0","borderWidth":"0","width":"160rpx","lineHeight":"80rpx","fontSize":"28rpx","borderStyle":"solid"}' class="title">墙面评分</view>
				<picker @change="qiangmianpingfenChange" :value="qiangmianpingfenIndex"  :range="qiangmianpingfenOptions">
					<view :style='{"padding":"0 30rpx","boxShadow":"0 0 0px rgba(0,0,0,.6) inset","margin":"0","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(220, 220, 220, 1)","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderRadius":"16rpx","borderWidth":"2rpx","width":"calc(100% - 240rpx)","lineHeight":"52rpx","fontSize":"28rpx","borderStyle":"solid"}' class="uni-input">{{ruleForm.qiangmianpingfen?ruleForm.qiangmianpingfen:"请选择墙面评分"}}</view>
				</picker>
			</view>
			<view :style='{"padding":"0 24rpx","boxShadow":"0 0 16rpx rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"#ccc","margin":"0 0 20rpx 0","borderRadius":"50rpx","borderWidth":"0","width":"100%","borderStyle":"solid","height":"80rpx"}' class="cu-form-group select">
				<view :style='{"padding":"0","boxShadow":"0 0 16rpx rgba(0,0,0,0)","margin":"0","borderColor":"#ccc","backgroundColor":"rgba(0,0,0,0)","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderRadius":"0","borderWidth":"0","width":"160rpx","lineHeight":"80rpx","fontSize":"28rpx","borderStyle":"solid"}' class="title">内务评分</view>
				<picker @change="neiwupingfenChange" :value="neiwupingfenIndex"  :range="neiwupingfenOptions">
					<view :style='{"padding":"0 30rpx","boxShadow":"0 0 0px rgba(0,0,0,.6) inset","margin":"0","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(220, 220, 220, 1)","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderRadius":"16rpx","borderWidth":"2rpx","width":"calc(100% - 240rpx)","lineHeight":"52rpx","fontSize":"28rpx","borderStyle":"solid"}' class="uni-input">{{ruleForm.neiwupingfen?ruleForm.neiwupingfen:"请选择内务评分"}}</view>
				</picker>
			</view>
			<view :style='{"padding":"0 24rpx","boxShadow":"0 0 16rpx rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"#ccc","margin":"0 0 20rpx 0","borderRadius":"50rpx","borderWidth":"0","width":"100%","borderStyle":"solid","height":"80rpx"}' class="cu-form-group select">
				<view :style='{"padding":"0","boxShadow":"0 0 16rpx rgba(0,0,0,0)","margin":"0","borderColor":"#ccc","backgroundColor":"rgba(0,0,0,0)","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderRadius":"0","borderWidth":"0","width":"160rpx","lineHeight":"80rpx","fontSize":"28rpx","borderStyle":"solid"}' class="title">窗户评分</view>
				<picker @change="chuanghupingfenChange" :value="chuanghupingfenIndex"  :range="chuanghupingfenOptions">
					<view :style='{"padding":"0 30rpx","boxShadow":"0 0 0px rgba(0,0,0,.6) inset","margin":"0","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(220, 220, 220, 1)","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderRadius":"16rpx","borderWidth":"2rpx","width":"calc(100% - 240rpx)","lineHeight":"52rpx","fontSize":"28rpx","borderStyle":"solid"}' class="uni-input">{{ruleForm.chuanghupingfen?ruleForm.chuanghupingfen:"请选择窗户评分"}}</view>
				</picker>
			</view>
			<view :style='{"padding":"0 24rpx","boxShadow":"0 0 16rpx rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"#ccc","margin":"0 0 20rpx 0","borderRadius":"50rpx","borderWidth":"0","width":"100%","borderStyle":"solid","height":"80rpx"}' class="cu-form-group select">
				<view :style='{"padding":"0","boxShadow":"0 0 16rpx rgba(0,0,0,0)","margin":"0","borderColor":"#ccc","backgroundColor":"rgba(0,0,0,0)","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderRadius":"0","borderWidth":"0","width":"160rpx","lineHeight":"80rpx","fontSize":"28rpx","borderStyle":"solid"}' class="title">桌凳评分</view>
				<picker @change="zhuodengpingfenChange" :value="zhuodengpingfenIndex"  :range="zhuodengpingfenOptions">
					<view :style='{"padding":"0 30rpx","boxShadow":"0 0 0px rgba(0,0,0,.6) inset","margin":"0","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(220, 220, 220, 1)","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderRadius":"16rpx","borderWidth":"2rpx","width":"calc(100% - 240rpx)","lineHeight":"52rpx","fontSize":"28rpx","borderStyle":"solid"}' class="uni-input">{{ruleForm.zhuodengpingfen?ruleForm.zhuodengpingfen:"请选择桌凳评分"}}</view>
				</picker>
			</view>
			<view :style='{"padding":"0 24rpx","boxShadow":"0 0 0px rgba(0,0,0,.3)","margin":"0 0 20rpx 0","borderColor":"#ccc","backgroundColor":"rgba(255, 255, 255, 1)","borderRadius":"50rpx","borderWidth":"0","width":"100%","borderStyle":"solid","height":"80rpx"}' class="cu-form-group">
				<view :style='{"padding":"0","boxShadow":"0 0 16rpx rgba(0,0,0,0)","margin":"0","borderColor":"#ccc","backgroundColor":"rgba(0,0,0,0)","color":"rgba(161, 161, 161, 1)","textAlign":"left","borderRadius":"0","borderWidth":"0","width":"160rpx","lineHeight":"80rpx","fontSize":"28rpx","borderStyle":"solid"}' class="title">整体效果</view>
				<input :style='{"padding":"0 30rpx","boxShadow":"0 0 0px rgba(0,0,0,.6) inset","margin":"0","borderColor":"rgba(220, 220, 220, 1)","backgroundColor":"rgba(255, 255, 255, 0)","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderRadius":"88rpx","borderWidth":"2rpx","width":"calc(100% - 160rpx)","fontSize":"28rpx","borderStyle":"solid","height":"52rpx"}' :disabled="ro.zhengtixiaoguo" v-model="ruleForm.zhengtixiaoguo" placeholder="整体效果"></input>
			</view>
			<view :style='{"padding":"0 24rpx","boxShadow":"0 0 16rpx rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"#ccc","margin":"0 0 20rpx 0","borderRadius":"50rpx","borderWidth":"0","width":"100%","borderStyle":"solid","height":"80rpx"}' class="cu-form-group select">
				<view :style='{"padding":"0","boxShadow":"0 0 16rpx rgba(0,0,0,0)","margin":"0","borderColor":"#ccc","backgroundColor":"rgba(0,0,0,0)","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderRadius":"0","borderWidth":"0","width":"160rpx","lineHeight":"80rpx","fontSize":"28rpx","borderStyle":"solid"}' class="title">评选结果</view>
				<picker @change="pingxuanjieguoChange" :value="pingxuanjieguoIndex"  :range="pingxuanjieguoOptions">
					<view :style='{"padding":"0 30rpx","boxShadow":"0 0 0px rgba(0,0,0,.6) inset","margin":"0","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(220, 220, 220, 1)","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderRadius":"16rpx","borderWidth":"2rpx","width":"calc(100% - 240rpx)","lineHeight":"52rpx","fontSize":"28rpx","borderStyle":"solid"}' class="uni-input">{{ruleForm.pingxuanjieguo?ruleForm.pingxuanjieguo:"请选择评选结果"}}</view>
				</picker>
			</view>
			<view :style='{"padding":"0 24rpx","boxShadow":"0 0 16rpx rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"#ccc","margin":"0 0 20rpx 0","borderRadius":"50rpx","borderWidth":"0","width":"100%","borderStyle":"solid","height":"80rpx"}' class="cu-form-group select">
				<view :style='{"padding":"0","boxShadow":"0 0 16rpx rgba(0,0,0,0)","margin":"0","borderColor":"#ccc","backgroundColor":"rgba(0,0,0,0)","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderRadius":"0","borderWidth":"0","width":"160rpx","lineHeight":"80rpx","fontSize":"28rpx","borderStyle":"solid"}' class="title">检查日期</view>
				<picker mode="date" :value="ruleForm.jianchariqi" @change="jianchariqiChange">
					<view :style='{"padding":"0 30rpx","boxShadow":"0 0 0px rgba(0,0,0,.6) inset","margin":"0","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(220, 220, 220, 1)","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderRadius":"16rpx","borderWidth":"2rpx","width":"calc(100% - 240rpx)","lineHeight":"52rpx","fontSize":"28rpx","borderStyle":"solid"}' class="uni-input">{{ruleForm.jianchariqi?ruleForm.jianchariqi:"请选择检查日期"}}</view>
				</picker>
			</view>
			
			<!-- 否 -->
 

			
			
			<view class="btn" >
				<button :style='{"padding":"0","boxShadow":"0 0 16rpx rgba(0,0,0,0) inset","margin":"0","backgroundColor":"rgba(123, 226, 205, 1)","borderColor":"#409EFF","borderRadius":"88rpx","color":"#fff","borderWidth":"0","width":"80%","fontSize":"30rpx","borderStyle":"solid","height":"80rpx"}' @tap="onSubmitTap" class="bg-red">提交</button>
			</view>
		</form>

			
	</view>
</template>

<script>
	import wPicker from "@/components/w-picker/w-picker.vue";

	export default {
		data() {
			return {
				cross:'',
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
				weishengzhiduIndex: 0,
				wupinbaifangOptions: [],
				wupinbaifangIndex: 0,
				dimianweishengOptions: [],
				dimianweishengIndex: 0,
				chuangmianpingfenOptions: [],
				chuangmianpingfenIndex: 0,
				qiangmianpingfenOptions: [],
				qiangmianpingfenIndex: 0,
				neiwupingfenOptions: [],
				neiwupingfenIndex: 0,
				chuanghupingfenOptions: [],
				chuanghupingfenIndex: 0,
				zhuodengpingfenOptions: [],
				zhuodengpingfenIndex: 0,
				pingxuanjieguoOptions: [],
				pingxuanjieguoIndex: 0,
				// 登陆用户信息
				user: {},
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
			}
		},
		components: {
			wPicker
		},
		computed: {
			baseUrl() {
				return this.$base.url;
			},
			
			
			
			
			
			
			
			
			
			
			
			
			
		},
		async onLoad(options) {
    		        this.ruleForm.jianchariqi = this.$utils.getCurDate();
			let table = uni.getStorageSync("nowTable");
			// 获取用户信息
			let res = await this.$api.session(table);
			this.user = res.data;
			
			// ss读取


			// 自定义下拉框值
			this.weishengzhiduOptions = "0,1,2,3,4,5".split(',')
			// 自定义下拉框值
			this.wupinbaifangOptions = "0,1,2,3,4,5".split(',')
			// 自定义下拉框值
			this.dimianweishengOptions = "0,1,2,3,4,5".split(',')
			// 自定义下拉框值
			this.chuangmianpingfenOptions = "0,1,2,3,4,5".split(',')
			// 自定义下拉框值
			this.qiangmianpingfenOptions = "0,1,2,3,4,5".split(',')
			// 自定义下拉框值
			this.neiwupingfenOptions = "0,1,2,3,4,5".split(',')
			// 自定义下拉框值
			this.chuanghupingfenOptions = "0,1,2,3,4,5".split(',')
			// 自定义下拉框值
			this.zhuodengpingfenOptions = "0,1,2,3,4,5".split(',')
			// 自定义下拉框值
			this.pingxuanjieguoOptions = "优秀,良好,不合格".split(',')

			// 如果有登陆，获取登陆后保存的userid
			this.ruleForm.userid = uni.getStorageSync("userid")
			if (options.refid) {
				// 如果上一级页面传递了refid，获取改refid数据信息
				this.ruleForm.refid = options.refid;
				this.ruleForm.nickname = uni.getStorageSync("nickname");
			}
			// 如果是更新操作
			if (options.id) {
				this.ruleForm.id = options.id;
				// 获取信息
				res = await this.$api.info(`weishengpingbi`, this.ruleForm.id);
				this.ruleForm = res.data;
			}
			// 跨表
			this.cross = options.cross;
			if(options.cross){
				var obj = uni.getStorageSync('crossObj');
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
			this.styleChange()
		},
		methods: {
			styleChange() {
				this.$nextTick(()=>{
					// document.querySelectorAll('.app-update-pv .cu-form-group .uni-input-input').forEach(el=>{
					//   el.style.backgroundColor = this.addUpdateForm.input.content.backgroundColor
					// })
				})
			},

			// 多级联动参数

			jianchariqiChange(e) {
				this.ruleForm.jianchariqi = e.target.value;
				this.$forceUpdate();
			},


			// 下拉变化
			weishengzhiduChange(e) {
				this.weishengzhiduIndex = e.target.value
				this.ruleForm.weishengzhidu = this.weishengzhiduOptions[this.weishengzhiduIndex]
			},
			// 下拉变化
			wupinbaifangChange(e) {
				this.wupinbaifangIndex = e.target.value
				this.ruleForm.wupinbaifang = this.wupinbaifangOptions[this.wupinbaifangIndex]
			},
			// 下拉变化
			dimianweishengChange(e) {
				this.dimianweishengIndex = e.target.value
				this.ruleForm.dimianweisheng = this.dimianweishengOptions[this.dimianweishengIndex]
			},
			// 下拉变化
			chuangmianpingfenChange(e) {
				this.chuangmianpingfenIndex = e.target.value
				this.ruleForm.chuangmianpingfen = this.chuangmianpingfenOptions[this.chuangmianpingfenIndex]
			},
			// 下拉变化
			qiangmianpingfenChange(e) {
				this.qiangmianpingfenIndex = e.target.value
				this.ruleForm.qiangmianpingfen = this.qiangmianpingfenOptions[this.qiangmianpingfenIndex]
			},
			// 下拉变化
			neiwupingfenChange(e) {
				this.neiwupingfenIndex = e.target.value
				this.ruleForm.neiwupingfen = this.neiwupingfenOptions[this.neiwupingfenIndex]
			},
			// 下拉变化
			chuanghupingfenChange(e) {
				this.chuanghupingfenIndex = e.target.value
				this.ruleForm.chuanghupingfen = this.chuanghupingfenOptions[this.chuanghupingfenIndex]
			},
			// 下拉变化
			zhuodengpingfenChange(e) {
				this.zhuodengpingfenIndex = e.target.value
				this.ruleForm.zhuodengpingfen = this.zhuodengpingfenOptions[this.zhuodengpingfenIndex]
			},
			// 下拉变化
			pingxuanjieguoChange(e) {
				this.pingxuanjieguoIndex = e.target.value
				this.ruleForm.pingxuanjieguo = this.pingxuanjieguoOptions[this.pingxuanjieguoIndex]
			},

			sushetupianTap() {
				let _this = this;
				this.$api.upload(function(res) {
					_this.ruleForm.sushetupian = 'upload/' + res.file;
					_this.$forceUpdate();
					_this.$nextTick(()=>{
						_this.styleChange()
					})
				});
			},

			getUUID () {
				return new Date().getTime();
			},
			async onSubmitTap() {



























//跨表计算判断
				//更新跨表属性
			       var crossuserid;
			       var crossrefid;
			       var crossoptnum;
				if(this.cross){
					var statusColumnName = uni.getStorageSync('statusColumnName');
					var statusColumnValue = uni.getStorageSync('statusColumnValue');
					if(statusColumnName!='') {
						var obj = uni.getStorageSync('crossObj');
						if(!statusColumnName.startsWith("[")) {
							for (var o in obj){
								if(o==statusColumnName){
									obj[o] = statusColumnValue;
								}

							}
							var table = uni.getStorageSync('crossTable');
							await this.$api.update(`${table}`, obj);
						} else {
						       crossuserid=Number(uni.getStorageSync('userid'));
						       crossrefid=obj['id'];
						       crossoptnum=uni.getStorageSync('statusColumnName');
						       crossoptnum=crossoptnum.replace(/\[/,"").replace(/\]/,"");
						}
					}
				}
				if(crossrefid && crossuserid) {
					this.ruleForm.crossuserid=crossuserid;
					this.ruleForm.crossrefid=crossrefid;
					let params = {
						page: 1,
						limit:10,
						crossuserid:crossuserid,
						crossrefid:crossrefid,
					}
					let res = await this.$api.list(`weishengpingbi`, params);
					if (res.data.total >= crossoptnum) {
						this.$utils.msg(uni.getStorageSync('tips'));
						return false;
					} else {
                //跨表计算
						if(this.ruleForm.id){
							await this.$api.update(`weishengpingbi`, this.ruleForm);
						}else{
							await this.$api.add(`weishengpingbi`, this.ruleForm);
						}
						this.$utils.msgBack('提交成功');
					}
				} else {
                //跨表计算
					if(this.ruleForm.id){
						await this.$api.update(`weishengpingbi`, this.ruleForm);
					}else{
						await this.$api.add(`weishengpingbi`, this.ruleForm);
					}
					this.$utils.msgBack('提交成功');
				}
			},
			optionsChange(e) {
				this.index = e.target.value
			},
			bindDateChange(e) {
				this.date = e.target.value
			},
			getDate(type) {
				const date = new Date();
				let year = date.getFullYear();
				let month = date.getMonth() + 1;
				let day = date.getDate();
				if (type === 'start') {
					year = year - 60;
				} else if (type === 'end') {
					year = year + 2;
				}
				month = month > 9 ? month : '0' + month;;
				day = day > 9 ? day : '0' + day;
				return `${year}-${month}-${day}`;
			},
			toggleTab(str) {
				this.$refs[str].show();
			}
		}
	}
</script>

<style lang="scss" scoped>
	.container {
		padding: 20upx;
	}
	
	.content:after {
		position: fixed;
		top: 0;
		right: 0;
		left: 0;
		bottom: 0;
		content: '';
		background-image: url(http://codegen.caihongy.cn/20220215/b9bd41c7f1fc4430b1972688b894f238.png);
		background-attachment: fixed;
		background-size: cover;
		background-position: center;
	}

	textarea {
		border: 1upx solid #EEEEEE;
		border-radius: 20upx;
		padding: 20upx;
	}

	.title {
		width: 180upx;
	}

	.avator {
		width: 150upx;
		height: 60upx;
	}

	.right-input {
		flex: 1;
		text-align: left;
		padding: 0 24upx;
	}
	
	.cu-form-group.active {
		justify-content: space-between;
	}
	
	.btn {
	  display: flex;
	  align-items: center;
	  justify-content: center;
	  flex-wrap: wrap;
	  padding: 20upx 0;
	}
	
	.cu-form-group {
		padding: 0 24upx;
		background-color: transparent;
		min-height: inherit;
	}
	
	.cu-form-group+.cu-form-group {
		border: 0;
	}
	
	.cu-form-group uni-input {
		padding: 0 30upx;
	}
	
	.uni-input {
		padding: 0 30upx;
	}
	
	.cu-form-group uni-textarea {
		padding: 30upx;
		margin: 0;
	}
	
	.cu-form-group uni-picker::after {
		line-height: 52rpx;
	}
	
	.select .uni-input {
		line-height: 52rpx;
	}
	
	.input .right-input {
		line-height: 52rpx;
	}
</style>
