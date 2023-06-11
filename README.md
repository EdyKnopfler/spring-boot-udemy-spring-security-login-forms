# spring-boot-udemy-spring-security-login-forms

Aquecendo meu Spring Boot pelo [curso da Udemy](https://www.udemy.com/course/spring-boot-expert/).

Testando o Spring Security com formulário de login. A aplicação sendo construída é baseada em API REST, porém optei por fazer um teste com o formulário de login padrão do Spring.

Rotas:

* `/`: livre
* `/confidencial`: deve inicialmente redirecionar para o formulário padrão de login

Toda a lógica de autenticação está no arquivo `SegurancaConfig.java`.
