һ����Ҫ������

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
            
��������ע��
    
    @Controller��ע������һ��controller��
    @RequestMapping��RequestMappingע������ӳ��url�����������һ���ض��Ĵ�����򷽷�����������򷽷��ϡ��������ϣ���ʾ���е�������Ӧ����ķ��������Ըõ�ַ��Ϊ��·��
    @PathVariable���÷���������ֵ��Ӧ�󶨵�һ��URIģ�������
    @GetMapping��GetMapping ��һ�����ע�⣬ƽʱʹ�õĻ�Ƚ϶࣡�������ݵ��� @RequestMapping(method =RequestMethod.GET) ��һ����ݷ�ʽ
    @PostMapping
    @PutMapping
    @DeleteMapping
    @PatchMapping
    
������ȡ��ַ

    url:"${pageContext.request.contextPath}/a1"
    
�ġ�controller��������Ϊ����
    
    һ���������---->�����һ��Ҫ���뵽tomcat lib����
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
    ��������һ��Ҫ��get��set������������lombok