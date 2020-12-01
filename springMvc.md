一、需要的依赖

    <dependency>
                <groupId>junit</groupId>
                <artifactId>junit</artifactId>
                <version>4.12</version>
            </dependency>
            <dependency>
                <groupId>org.springframework</groupId>
                <artifactId>spring-webmvc</artifactId>
                <version>5.1.9.RELEASE</version>
            </dependency>
            <dependency>
                <groupId>javax.servlet</groupId>
                <artifactId>servlet-api</artifactId>
                <version>2.5</version>
            </dependency>
            <dependency>
                <groupId>javax.servlet.jsp</groupId>
                <artifactId>jsp-api</artifactId>
                <version>2.2</version>
            </dependency>
            <dependency>
                <groupId>javax.servlet</groupId>
                <artifactId>jstl</artifactId>
                <version>1.2</version>
            </dependency>
            
二、常用注解
    
    @Controller：注明类是一个controller类
    @RequestMapping：RequestMapping注解用于映射url到控制器类或一个特定的处理程序方法。可用于类或方法上。用于类上，表示类中的所有响应请求的方法都是以该地址作为父路径
    @PathVariable：让方法参数的值对应绑定到一个URI模板变量上
    @GetMapping：GetMapping 是一个组合注解，平时使用的会比较多！它所扮演的是 @RequestMapping(method =RequestMethod.GET) 的一个快捷方式
    @PostMapping
    @PutMapping
    @DeleteMapping
    @PatchMapping
    
三、获取地址

    url:"${pageContext.request.contextPath}/a1"
    
四、controller返回类型为对象
    
    一、添加依赖---->添加完一定要加入到tomcat lib下面
    <!--jackson-->
            <dependency>
                <groupId>com.fasterxml.jackson.core</groupId>
                <artifactId>jackson-core</artifactId>
                <version>2.11.2</version>
            </dependency>
            <dependency>
                <groupId>com.fasterxml.jackson.core</groupId>
                <artifactId>jackson-databind</artifactId>
                <version>2.11.2</version>
            </dependency>
    二、对象一定要有get、set方法，可以用lombok