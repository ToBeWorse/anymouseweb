git config --global user.email "117056951@qq.com"
git config --global user.name "Worse_Hand"
anymouseweb
  使用SpringBoot建立的一个操作web的模型
  此项目使用Thymeleaf，前后端没有分离，不适于当前的项目，后期应进行改进。
文档结构
  .idea
  .mvn
  src --源码java文件，资源等
    main --运行与开发文件夹
      java
        com.example.anymouseweb
          CommonUtill --公共方法类
              |__
          Controller --Controller层
              |__
          Entity --实体类
              |__
          Exception --定义异常
              |__
          Mapper --与数据库的映射类 Model层
              |__
          Service  --services层
              |__
          AnymousewebApplication.java --启动入口
          ServletInitializer.java --初始化类
      resources
        Mapper --定义的SQL
          |__
        static --静态资源文件夹
          upload
              |__
          download
              |__
        templates --html文件夹
            |__
        application.yml --配置的环境
    test
  target
  .gitignore
  mvnw
  mvnw.cmd
  pom.xml
  project.xml
代码风格与要求
	1.代码log
	2.代码format
	3.新增代码开发人员
	4.代码规范化，代码注释应当简介明了，重要问题以及段落应当使用段落注释。
新增功能：
    1.增加主页登陆以及注册用户功能。2019/8/9。
    2.增加Redis缓存机制。





   
  

