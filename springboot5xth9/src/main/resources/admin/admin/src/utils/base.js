const base = {
    get() {
        return {
            url : "http://localhost:8080/springboot5xth9/",
            name: "springboot5xth9",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springboot5xth9/front/h5/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "宿舍管理小程序"
        } 
    }
}
export default base
