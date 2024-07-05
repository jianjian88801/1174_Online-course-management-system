const base = {
    get() {
        return {
            url : "http://localhost:8080/springboot0b6e5/",
            name: "springboot0b6e5",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springboot0b6e5/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "在线课程管理系统"
        } 
    }
}
export default base
